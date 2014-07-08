package cn.memedai.operation.web;

import cn.memedai.operation.common.App;
import cn.memedai.operation.domain.auth.CustomerUserDetail;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;

/**
 * Created by dell on 14-6-24.
 */
@Controller
@RequestMapping(value = "/main")
public class MainController {
    @Inject
    private SimpMessagingTemplate template;
    @Inject
    private App app;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView create(@AuthenticationPrincipal CustomerUserDetail userDetail) {
        ModelAndView ma = new ModelAndView("main");
        ma.addObject("user", app.getCurrentUser());
        return ma;
    }

    public void broadcast() {
        template.convertAndSend("/topic/price", "Hello");
    }

    @MessageMapping("/upstream")
    public void addStock(String message) throws Exception {
        broadcast();
    }

}
