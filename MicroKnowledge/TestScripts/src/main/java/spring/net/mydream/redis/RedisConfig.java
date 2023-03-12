package spring.net.mydream.redis;


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
 * redis������
 * @program: springbootdemo
 * @Date: 2019/2/22 15:20
 * @Author: zjjlive
 * @Description:
 */
@Configuration
@EnableCaching //����ע��
public class RedisConfig extends CachingConfigurerSupport {

    /**
     * retemplate�������
     * @param factory
     * @return
     */
    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {

        RedisTemplate<String, Object> template = new RedisTemplate<>();
        // �������ӹ���
        template.setConnectionFactory(factory);

        //ʹ��Jackson2JsonRedisSerializer�����л��ͷ����л�redis��valueֵ��Ĭ��ʹ��JDK�����л���ʽ��

        ObjectMapper om = new ObjectMapper();
        // ָ��Ҫ���л�����field,get��set,�Լ����η���Χ��ANY�Ƕ��а���private��public
        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        // ָ�����л���������ͣ�������Ƿ�final���εģ�final���ε��࣬����String,Integer�Ȼ��ܳ��쳣
        om.activateDefaultTyping(LaissezFaireSubTypeValidator.instance,ObjectMapper.DefaultTyping.NON_FINAL);

        // ֵ����json���л�
      	template.setValueSerializer(new JdkSerializationRedisSerializer());
      	//ʹ��StringRedisSerializer�����л��ͷ����л�redis��keyֵ
      		template.setKeySerializer(new StringRedisSerializer());

        // ����hash key ��value���л�ģʽ
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
