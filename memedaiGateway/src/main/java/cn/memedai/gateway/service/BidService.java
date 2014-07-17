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

    public Bid publish(Bid bid);

    public boolean invisible(Long bid);

    public boolean visible(Long bidId);

    public List<Bid> getBidHistories(Investor investor);

    public List<Investment> getInvestmentBy(Bid bid);

    public void fail(Bid bid);

    public void win(Bid bid);

    public Bid getBid(Long bidId);
}
