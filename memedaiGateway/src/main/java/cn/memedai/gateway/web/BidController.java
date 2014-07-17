package cn.memedai.gateway.web;

import cn.memedai.gateway.domain.bid.Bid;
import cn.memedai.gateway.service.BidService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by dell on 14-6-4.
 */
@Controller(value = "gatewayController")
@RequestMapping(value = "/bids")
public class BidController {
    @Inject
    private BidService bidService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Bid> getBids() {
        return bidService.getBids();
    }

    @RequestMapping(value = "/{bidId}", method = RequestMethod.GET)
    @ResponseBody
    public Bid getBid(@PathVariable Long bidId) {
        return bidService.getBid(bidId);
    }

}
