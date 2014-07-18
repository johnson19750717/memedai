package cn.memedai.gateway.service;

import cn.memedai.gateway.domain.shoppingcart.Investment;
import cn.memedai.gateway.domain.shoppingcart.ShoppingCart;
import cn.memedai.gateway.repository.ShoppingCartRepository;
import cn.memedai.gateway.repository.UidGeneratorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Johnson on 7/10/14.
 */
@Service(value = "shoppingCartService")
@Transactional
public class ShoppingCartServiceImpl implements ShoppingCartService {
    @Inject
    private ShoppingCartRepository shoppingCartRepository;
    @Inject
    private UidGeneratorRepository uidGeneratorRepository;

    @Override
    public Investment add(Investment investment) {
        Long investmentId = uidGeneratorRepository.nextInvestmentId();
        investment.setId(investmentId);
        shoppingCartRepository.add(investment);
        return investment;
    }

    @Override
    public void remove(Long investmentId) {

    }

    @Override
    public void update(Long investmentId, Double newAmount) {

    }

    @Override
    public List<Investment> getInvestments(String investor) {
        return null;
    }

    @Override
    public void expire(ShoppingCart cart) {

    }

    @Override
    public void clean() {

    }
}
