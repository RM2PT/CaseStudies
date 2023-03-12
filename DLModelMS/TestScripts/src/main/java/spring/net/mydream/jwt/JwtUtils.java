package spring.net.mydream.jwt;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import spring.net.mydream.redis.RedisUtil;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
@ConfigurationProperties("jwt.config")
public class JwtUtils {
	@Autowired
	private RedisUtil redisUtil;
	//ǩ��˽Կ
	private String key;
	//ǩ��ʧЧʱ��
	private Long ttl;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Long getTtl() {
		return ttl;
	}
	public void setTtl(Long ttl) {
		this.ttl = ttl;
	}
	//������֤token
	public String CreateJwt(String id,String name,Map<String,Object>map) {
		//1.����ʧЧʱ��
		Long now=System.currentTimeMillis();
		Long exp=now+ttl;
		//2.����JwtBuilder
		JwtBuilder jwtBuilder=Jwts.builder().setId(id).setSubject(name)
				.setIssuedAt(new Date()).signWith(SignatureAlgorithm.HS256, key);
		//3.����map����claims
		if(map!=null) {
			jwtBuilder.setClaims(map);
		}
		//4.����ʧЧʱ��
		jwtBuilder.setExpiration(new Date(exp));
		
		//5.����token
		String token=jwtBuilder.compact();
		
//		redisUtil.set("token"+id, token, exp/1000);
		
		return token;
	}
	//����token�ַ���
	public Claims parseJwt(String token) throws IllegalArgumentException,ExpiredJwtException {
		Claims claims=Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody();
		return claims;
	}
}

