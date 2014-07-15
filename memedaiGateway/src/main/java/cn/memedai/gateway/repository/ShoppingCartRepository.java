package cn.memedai.gateway.repository;

import cn.memedai.gateway.domain.shoppingcart.Investment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by Johnson on 7/10/14.
 */
@Repository(value = "shoppingCartRepository")
public class ShoppingCartRepository {
    @Autowired
    private RedisTemplate<String, Investment> redisTemplate;

    public void add(String investor, Investment investment) {
        redisTemplate.expire(KeyBuilder.cartKey(investor), 15, TimeUnit.MINUTES);
        redisTemplate.opsForSet().add(KeyBuilder.cartKey(investor), investment);
    }

    public void remove(String investor, Investment investment) {
        redisTemplate.opsForSet().remove(KeyBuilder.cartKey(investor), -1, investment);
    }

    public Set<Investment> getInvestmentsBy(String investor) {
        return redisTemplate.opsForSet().members(KeyBuilder.cartKey(investor));
    }
}
