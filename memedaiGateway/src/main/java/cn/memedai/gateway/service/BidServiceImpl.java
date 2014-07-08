package cn.memedai.gateway.service;

import cn.memedai.gateway.config.AppConfig;
import cn.memedai.gateway.domain.bid.Bid;
import cn.memedai.gateway.domain.bid.BidMetaData;
import cn.memedai.gateway.domain.bid.BidStatusEnum;
import cn.memedai.gateway.repository.BidRepository;
import org.joda.time.DateTime;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
    public Bid createBid(Bid bid) {
        return bidRepository.save(bid);
    }

    @Override
    public boolean invisibleBid(Long bid) {
        return false;
    }

    @Override
    public boolean visibleBid(Long bidId) {
        return false;
    }

    public static void main(String[] args) {
        ApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);
        BidService bidService = context.getBean("bidService", BidService.class);
        Bid bid = new Bid();
        bid.setBidStatus(BidStatusEnum.BIDDING);
        bid.setMetaData(new BidMetaData());
        bid.getMetaData().setStartDate(DateTime.now().toDate());
        bid.getMetaData().setEndDate(DateTime.now().plusDays(10).toDate());
        Bid createdBid = bidService.createBid(bid);
    }
}
