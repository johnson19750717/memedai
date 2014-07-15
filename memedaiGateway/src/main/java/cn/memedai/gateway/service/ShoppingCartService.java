package cn.memedai.gateway.service;

import cn.memedai.gateway.domain.investment.Investor;
import cn.memedai.gateway.domain.shoppingcart.Investment;
import cn.memedai.gateway.domain.shoppingcart.ShoppingCart;

import java.util.List;

/**
 * Created by Johnson on 7/10/14.
 */
public interface ShoppingCartService {
    public void add(Investment investment);

    public void remove(Investment investment);

    public void update(Investment investment);

    public List<Investment> getInvestments(Investor investor);

    public void expire(ShoppingCart cart);

}
