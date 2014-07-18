package cn.memedai.gateway.service;

import cn.memedai.gateway.domain.investment.Investor;
import cn.memedai.gateway.domain.shoppingcart.Investment;
import cn.memedai.gateway.domain.shoppingcart.ShoppingCart;

import java.util.List;

/**
 * Created by Johnson on 7/10/14.
 */
public interface ShoppingCartService {
    public Investment add(Investment investment);

    public void remove(Long investmentId);

    public void update(Long investmentId, Double newAmount);

    public List<Investment> getInvestments(String investor);

    public void expire(ShoppingCart cart);

    public void clean();

}
