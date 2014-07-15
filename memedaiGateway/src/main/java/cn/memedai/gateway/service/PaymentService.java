package cn.memedai.gateway.service;

import cn.memedai.gateway.domain.bid.Bid;
import cn.memedai.gateway.domain.investment.Investor;
import cn.memedai.gateway.domain.shoppingcart.Order;

/**
 * Created by Johnson on 7/10/14.
 */
public interface PaymentService {
    public void pay(Order order);

    public void getPaymentHistories(Investor investor);

    public void getPaymentHistories(Bid bid);

}
