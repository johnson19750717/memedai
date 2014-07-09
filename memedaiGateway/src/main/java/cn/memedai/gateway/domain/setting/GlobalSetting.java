package cn.memedai.gateway.domain.setting;

import cn.memedai.gateway.domain.investment.Investor;

import java.util.List;

/**
 * Created by Johnson on 7/8/14.
 */
public class GlobalSetting {
    private List<Investor> investorsForSystemPurpose;
    private Long retainTimeOfShoppingCart;
    private Integer defaultSorting;

    public List<Investor> getInvestorsForSystemPurpose() {
        return investorsForSystemPurpose;
    }

    public void setInvestorsForSystemPurpose(List<Investor> investorsForSystemPurpose) {
        this.investorsForSystemPurpose = investorsForSystemPurpose;
    }

    public Long getRetainTimeOfShoppingCart() {
        return retainTimeOfShoppingCart;
    }

    public void setRetainTimeOfShoppingCart(Long retainTimeOfShoppingCart) {
        this.retainTimeOfShoppingCart = retainTimeOfShoppingCart;
    }

    public Integer getDefaultSorting() {
        return defaultSorting;
    }

    public void setDefaultSorting(Integer defaultSorting) {
        this.defaultSorting = defaultSorting;
    }
}
