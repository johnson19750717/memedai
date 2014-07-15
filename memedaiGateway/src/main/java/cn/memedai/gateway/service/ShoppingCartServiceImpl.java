package cn.memedai.gateway.service;

import cn.memedai.gateway.domain.investment.Investor;
import cn.memedai.gateway.domain.shoppingcart.Investment;
import cn.memedai.gateway.domain.shoppingcart.ShoppingCart;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Johnson on 7/10/14.
 */
@Service(value = "shoppingCartService")
@Transactional
public class ShoppingCartServiceImpl implements ShoppingCartService {
    @Override
    public void add(Investment investment) {

    }

    @Override
    public void remove(Investment investment) {

    }

    @Override
    public void update(Investment investment) {

    }

    @Override
    public List<Investment> getInvestments(Investor investor) {
        return null;
    }

    @Override
    public void expire(ShoppingCart cart) {

    }
}
