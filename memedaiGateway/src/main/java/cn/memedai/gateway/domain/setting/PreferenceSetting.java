package cn.memedai.gateway.domain.setting;

/**
 * Created by Johnson on 7/8/14.
 */
public class PreferenceSetting {
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
}
