package cn.memedai.gateway.repository;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.concurrent.TimeUnit;

/**
 * Created by dell on 14-7-15.
 */
@Repository(value = "smsRepository")
public class SmsRepository {
    private static final Integer SMS_EXPIRE_SECONDS = 30;
    @Inject
    private RedisTemplate<String, String> stringRedisTemplate;

    public void add(String mobilePhone, String code) {
        stringRedisTemplate.opsForValue().set(mobilePhone, code, SMS_EXPIRE_SECONDS, TimeUnit.MINUTES);
    }

    public void remove(String mobilePhone) {
        stringRedisTemplate.delete(mobilePhone);
    }

    public String find(String mobilePhone) {
        return stringRedisTemplate.opsForValue().get(mobilePhone);
    }
}
