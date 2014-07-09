package cn.memedai.gateway.domain.shoppingcart;

import cn.memedai.gateway.domain.investment.Investor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 14-7-8.
 */
public class ShoppingCart {
    private Investor investor;
    private List<Investment> investments = new ArrayList<>();
    private Long remainingRetainTime;

    public Investor getInvestor() {
        return investor;
    }

    public void setInvestor(Investor investor) {
        this.investor = investor;
    }

    public List<Investment> getInvestments() {
        return investments;
    }

    public void setInvestments(List<Investment> investments) {
        this.investments = investments;
    }

    public Long getRemainingRetainTime() {
        return remainingRetainTime;
    }

    public void setRemainingRetainTime(Long remainingRetainTime) {
        this.remainingRetainTime = remainingRetainTime;
    }

    public void addInvestment(Investment investment) {
        if (!investments.contains(investment)) {
            investments.add(investment);
        }
    }

    public void removeInvestment(Investment investment) {
        if (investments.contains(investment)) {
            investments.remove(investment);
        }
    }

    public void clear() {
        investments.clear();
    }

    public Order createOrder() {
        return new Order(investor, investments);
    }

    public Integer size() {
        return investments.size();
    }

    public void reset() {
    }
}
