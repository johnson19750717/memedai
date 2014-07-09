package cn.memedai.gateway.service;

import cn.memedai.gateway.domain.bid.Bid;
import cn.memedai.gateway.domain.investment.Investor;
import cn.memedai.gateway.domain.shoppingcart.Investment;
import cn.memedai.gateway.domain.shoppingcart.Order;

import java.util.List;

/**
 * Created by dell on 14-6-4.
 */
public interface BidService {
    public List<Bid> getBids();

    public Bid createBid(Bid bid);

    public boolean invisibleBid(Long bid);

    public boolean visibleBid(Long bidId);

    public void addInvestmentToShoppingCart(Long bid, Double investAmount);

    public void removeInvestmentFromShoppingCart(Investment investment);

    public List<Investment> getInvestmentWithinShoppingCard(Investor investor);

    public void pay(Order order);

    public List<Bid> getBidHistories(Investor investor);

    public List<Investment> getInvestmentBy(Bid bid);

}
