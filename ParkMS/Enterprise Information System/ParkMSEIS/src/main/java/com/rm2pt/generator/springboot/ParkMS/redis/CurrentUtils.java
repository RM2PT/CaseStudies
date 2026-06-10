package com.rm2pt.generator.springboot.ParkMS.redis;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.redis.RedisConnectionFailureException;
import org.springframework.stereotype.Component;

import com.rm2pt.generator.springboot.ParkMS.entity.BaseEntity;
import com.rm2pt.generator.springboot.ParkMS.jwt.JwtUtils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

@Component
@ConfigurationProperties("jwt.config")
public class CurrentUtils {

	@Autowired
	HttpServletRequest request;

	@Autowired
	HttpServletResponse response;

	@Autowired
	private JwtUtils jwtUtils;

	@Autowired
	private RedisUtil redisUtil;

	static AtomicInteger ai = new AtomicInteger(0);

	private Long ttl;

	public Long getTtl() {
		return ttl;
	}

	public void setTtl(Long ttl) {
		this.ttl = ttl;
	}

	public Object getAttribute(String key) throws IllegalArgumentException,ExpiredJwtException{
		String authorization=request.getHeader("Authorization");
		if(authorization == null) return null;
		Claims claims=jwtUtils.parseJwt(authorization);
		String id=String.valueOf(claims.getId());

		Object o=redisUtil.get(key+id);
		return o;

	}

	public void setAttribute(String key, Object value) throws RedisConnectionFailureException{
		String authorization=request.getHeader("Authorization");
		if(authorization == null) {
			_set(key+ai.get(), value);
			String token=jwtUtils.CreateJwt(ai.getAndIncrement()+"", null, null);
			response.setHeader("Authorization", token);
			return;
		}
		Claims claims=jwtUtils.parseJwt(authorization);
		String id=String.valueOf(claims.getId());
		_set(key+id, value);

	}

	private void _set(String key, Object value) throws RedisConnectionFailureException{
		if(value instanceof Set){
			redisUtil.sSet(key, value);
		} else if (value instanceof List){
			redisUtil.lSet(key, value);
		} else {
			redisUtil.set(key, value, ttl/1000);
		}
	}
}

