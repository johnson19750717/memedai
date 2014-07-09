package cn.memedai.gateway.repository;

import cn.memedai.gateway.domain.bid.SimpleBid;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.support.atomic.RedisAtomicLong;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by Johnson on 7/9/14.
 */
@Repository
public class BidInMemoryRepository {
    private RedisAtomicLong idCounter;
    @Inject
    private RedisTemplate<String, SimpleBid> redisTemplate;

    @PostConstruct
    public void init() {
        idCounter = new RedisAtomicLong("global.bid:id", redisTemplate.getConnectionFactory());
    }

    public void save(SimpleBid bid) {
        Long bidNo = idCounter.decrementAndGet();
        bid.setBidNo(bidNo);
        redisTemplate.opsForValue().set(bidNo.toString(), bid);
    }

    public List<SimpleBid> findAll() {
        return redisTemplate.opsForList().range("bids", 0, redisTemplate.opsForList().size());
    }
}
