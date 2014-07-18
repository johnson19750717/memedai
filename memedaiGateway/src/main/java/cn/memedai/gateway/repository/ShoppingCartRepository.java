package cn.memedai.gateway.repository;

import cn.memedai.gateway.common.App;
import cn.memedai.gateway.domain.shoppingcart.Investment;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by Johnson on 7/10/14.
 */
@Repository(value = "shoppingCartRepository")
public class ShoppingCartRepository {
    @Inject
    private App app;
    @Inject
    private RedisTemplate<String, Investment> redisTemplate;
    @Inject
    private RedisTemplate<String, String> stringRedisTemplate;

    public void add(Investment investment) {
        final String investor = investment.getInvestor();
        redisTemplate.expire(KeyBuilder.cartKey(investor), app.getRetainTimeOfShoppingCart(), TimeUnit.MINUTES);
        redisTemplate.opsForValue().set(KeyBuilder.investmentKey(investor, investment.getId()), investment);
        stringRedisTemplate.opsForSet().add(KeyBuilder.cartInvestmentsKey(investor), investment.getId().toString());
        stringRedisTemplate.opsForSet().add(KeyBuilder.bidKey(investment.getBidNo()), investment.getId().toString());
    }

    public void remove(String investor, Investment investment) {
        redisTemplate.opsForSet().remove(KeyBuilder.cartInvestmentsKey(investor), -1, investment);
        redisTemplate.opsForSet().remove(KeyBuilder.bidKey(investment.getBidNo()), investment);
    }

    public Set<Investment> getInvestmentsBy(String investor) {
        return redisTemplate.opsForSet().members(KeyBuilder.cartKey(investor));
    }

    public Double getShoppingCartBy(Long bidNo) {
        Double result = NumberUtils.DOUBLE_ZERO;
        for (Investment investment : redisTemplate.opsForSet().members(KeyBuilder.bidKey(bidNo))) {
            result += investment.getAmountOfInvestment();
        }
        return result;
    }
}
