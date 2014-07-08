package cn.memedai.gateway.service;

import cn.memedai.gateway.domain.bid.Bid;

import java.util.List;

/**
 * Created by dell on 14-6-4.
 */
public interface BidService {
    public List<Bid> getBids();

    public Bid createBid(Bid bid);

    public boolean invisibleBid(Long bid);

    public boolean visibleBid(Long bidId);

}
