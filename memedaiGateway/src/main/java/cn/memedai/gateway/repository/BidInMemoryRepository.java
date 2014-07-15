package cn.memedai.gateway.repository;

import cn.memedai.gateway.config.AppConfig;
import cn.memedai.gateway.domain.bid.Bid;
import cn.memedai.gateway.domain.investment.Investor;
import cn.memedai.gateway.domain.shoppingcart.Investment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.support.atomic.RedisAtomicLong;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Johnson on 7/9/14.
 */
@Repository(value = "bidInMemoryRepository")
public class BidInMemoryRepository {
    private RedisAtomicLong idCounter;
    @Inject
    private RedisTemplate<String, Double> redisTemplate;

    public void create(Long bidNo) {
        redisTemplate.opsForValue().set("bid:" + bidNo, 0d);
    }

    public void update(Long bidNo, Double shoppingCartAmount) {
        redisTemplate.opsForValue().set("bid:" + bidNo, shoppingCartAmount);
    }

    public Double get(Long bidNo) {
       return redisTemplate.opsForValue().get("bid:" + bidNo);
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        BidInMemoryRepository repository = context.getBean("bidInMemoryRepository", BidInMemoryRepository.class);
        repository.update(1l, 100d);
        System.out.println(repository.get(1l));

    }
}
