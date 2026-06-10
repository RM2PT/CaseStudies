package com.rm2pt.generator.springboot.MicroK.redis;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.*;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * redis配置类
 * @program: springbootdemo
 * @Date: 2019/2/22 15:20
 * @Author: zjjlive
 * @Description:
 */
@Configuration
@EnableCaching //开启注解
public class RedisConfig extends CachingConfigurerSupport {

    /**
     * retemplate相关配置
     * @param factory
     * @return
     */
    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {

        RedisTemplate<String, Object> template = new RedisTemplate<>();
        // 配置连接工厂
        template.setConnectionFactory(factory);

        //使用Jackson2JsonRedisSerializer来序列化和反序列化redis的value值（默认使用JDK的序列化方式）

        ObjectMapper om = new ObjectMapper();
        // 指定要序列化的域，field,get和set,以及修饰符范围，ANY是都有包括private和public
        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        // 指定序列化输入的类型，类必须是非final修饰的，final修饰的类，比如String,Integer等会跑出异常
        om.activateDefaultTyping(LaissezFaireSubTypeValidator.instance,ObjectMapper.DefaultTyping.NON_FINAL);

        // 值采用json序列化
      	template.setValueSerializer(new JdkSerializationRedisSerializer());
      	//使用StringRedisSerializer来序列化和反序列化redis的key值
      		template.setKeySerializer(new StringRedisSerializer());

        // 设置hash key 和value序列化模式
      	template.setHashKeySerializer(new StringRedisSerializer());
      	 template.setHashValueSerializer(new StringRedisSerializer());
      	 template.afterPropertiesSet();
 
        return template;
}

   	   /**
   	    * @param redisTemplate
   	    * @return
   	    */
   	   @Bean
   	   public HashOperations<String, String, Object> hashOperations(RedisTemplate<String, Object> redisTemplate) {
   	       return redisTemplate.opsForHash();
   	   }
   
       /**
        * @param redisTemplate
        * @return
        */
       @Bean
       public ValueOperations<String, Object> valueOperations(RedisTemplate<String, Object> redisTemplate) {
           return redisTemplate.opsForValue();
       }
   
       /**
        * @param redisTemplate
        * @return
        */
       @Bean
       public ListOperations<String, Object> listOperations(RedisTemplate<String, Object> redisTemplate) {
           return redisTemplate.opsForList();
       }
   
       /**
        * @param redisTemplate
        * @return
        */
       @Bean
       public SetOperations<String, Object> setOperations(RedisTemplate<String, Object> redisTemplate) {
           return redisTemplate.opsForSet();
       }
   
       /**
        * @param redisTemplate
        * @return
        */
       @Bean
       public ZSetOperations<String, Object> zSetOperations(RedisTemplate<String, Object> redisTemplate) {
           return redisTemplate.opsForZSet();
       }
   
   }
