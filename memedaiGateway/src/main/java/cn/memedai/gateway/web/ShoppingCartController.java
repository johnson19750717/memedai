package cn.memedai.gateway.web;

import cn.memedai.gateway.common.App;
import cn.memedai.gateway.domain.shoppingcart.Investment;
import cn.memedai.gateway.service.ShoppingCartService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by dell on 14-7-18.
 */
@Controller
@RequestMapping(value = "/cart")
public class ShoppingCartController {
    @Inject
    private ShoppingCartService shoppingCartService;
    @Inject
    private App app;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Investment> getInvestmentsWithinCart() {
        return shoppingCartService.getInvestments(app.getCurrentUser());
    }

    @RequestMapping(value = "/bid/{bid}/amount/{amount}", method = RequestMethod.POST)
    @ResponseBody
    public Investment add(@PathVariable Long bid, @PathVariable Double amount) {
        Investment investment = new Investment(app.getCurrentUser(), bid, amount);
        return shoppingCartService.add(investment);
    }

    @RequestMapping(value = "/investments/{investmentId}", method = RequestMethod.POST)
    @ResponseBody
    public void remove(@PathVariable Long investmentId) {
        shoppingCartService.remove(investmentId);
    }

    @RequestMapping(value = "/investments/{investmentId}/amount/newAmount", method = RequestMethod.POST)
    @ResponseBody
    public void update(Long investmentId, Double newAmount) {
        shoppingCartService.update(investmentId, newAmount);
    }

    @RequestMapping(value = "/clean", method = RequestMethod.POST)
    @ResponseBody
    public void clean() {
        shoppingCartService.clean();
    }
}
