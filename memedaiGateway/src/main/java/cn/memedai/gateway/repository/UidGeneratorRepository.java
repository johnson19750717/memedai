package cn.memedai.gateway.repository;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.support.atomic.RedisAtomicLong;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

/**
 * Created by dell on 14-7-15.
 */
@Repository(value = "uidGeneratorRepository")
public class UidGeneratorRepository {
    @Inject
    private RedisTemplate<String, String> stringRedisTemplate;
    private RedisAtomicLong bidNoCounter;

    @PostConstruct
    private void init() {
        bidNoCounter = new RedisAtomicLong(KeyBuilder.bidGlobalUid(), stringRedisTemplate.getConnectionFactory());
    }

    public Long getBidNo() {
        return bidNoCounter.incrementAndGet();
    }
}
