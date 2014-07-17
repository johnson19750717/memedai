package cn.memedai.gateway.service;

import cn.memedai.gateway.domain.bid.Bid;
import cn.memedai.gateway.domain.investment.Investor;
import cn.memedai.gateway.domain.shoppingcart.Investment;
import cn.memedai.gateway.repository.BidRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by dell on 14-6-4.
 */
@Service(value = "bidService")
@Transactional
public class BidServiceImpl implements BidService {
    @Inject
    private BidRepository bidRepository;

    @Override
    public List<Bid> getBids() {
        return bidRepository.findAll();
    }

    @Override
    public Bid publish(Bid bid) {
        return null;
    }

    @Override
    public boolean invisible(Long bid) {
        return false;
    }

    @Override
    public boolean visible(Long bidId) {
        return false;
    }

    @Override
    public List<Bid> getBidHistories(Investor investor) {
        return null;
    }

    @Override
    public List<Investment> getInvestmentBy(Bid bid) {
        return null;
    }

    @Override
    public void fail(Bid bid) {

    }

    @Override
    public void win(Bid bid) {

    }

    @Override
    public Bid getBid(Long bidId) {
        return bidRepository.findOne(bidId);
    }
}
