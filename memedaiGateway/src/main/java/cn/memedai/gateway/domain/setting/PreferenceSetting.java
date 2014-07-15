package cn.memedai.gateway.domain.setting;

import cn.memedai.gateway.domain.investment.Investor;

/**
 * Created by Johnson on 7/8/14.
 */
public class PreferenceSetting {
    private Investor investor;
    private SortingEnum lastSorting;
    private String lastFilter;

    public SortingEnum getLastSorting() {
        return lastSorting;
    }

    public void setLastSorting(SortingEnum lastSorting) {
        this.lastSorting = lastSorting;
    }

    public String getLastFilter() {
        return lastFilter;
    }

    public void setLastFilter(String lastFilter) {
        this.lastFilter = lastFilter;
    }

    public Investor getInvestor() {
        return investor;
    }

    public void setInvestor(Investor investor) {
        this.investor = investor;
    }
}
