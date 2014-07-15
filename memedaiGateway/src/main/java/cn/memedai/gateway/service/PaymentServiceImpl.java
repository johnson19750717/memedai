package cn.memedai.gateway.service;

import cn.memedai.gateway.domain.bid.Bid;
import cn.memedai.gateway.domain.investment.Investor;
import cn.memedai.gateway.domain.shoppingcart.Order;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Johnson on 7/10/14.
 */
@Service(value = "paymentService")
@Transactional
public class PaymentServiceImpl implements PaymentService {
    @Override
    public void pay(Order order) {

    }

    @Override
    public void getPaymentHistories(Investor investor) {

    }

    @Override
    public void getPaymentHistories(Bid bid) {

    }
}
