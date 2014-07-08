package cn.memedai.gateway.domain.bid;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.Date;

/**
 * Created by dell on 14-7-8.
 */
@Embeddable
public class BidSpecification {
    @Column(name = "SINGLE_MIN_AMOUNT")
    private Double singleMinAmount;
    @Column(name = "SINGLE_MAX_AMOUNT")
    private Double singleMaxAmount;
    @Column(name = "TIMES_OF_INVESTING_AMOUNT")
    private Integer timesOfInvestingAmount;
    @Column(name = "MAX_AMOUNT_PER_INVESTOR")
    private Double maxAmountPerInvestor;
    @Column(name = "MAX_COUNT_OF_INVESTING")
    private Integer maxCountOfInvesting;

    public Double getSingleMinAmount() {
        return singleMinAmount;
    }

    public void setSingleMinAmount(Double singleMinAmount) {
        this.singleMinAmount = singleMinAmount;
    }

    public Double getSingleMaxAmount() {
        return singleMaxAmount;
    }

    public void setSingleMaxAmount(Double singleMaxAmount) {
        this.singleMaxAmount = singleMaxAmount;
    }

    public Integer getTimesOfInvestingAmount() {
        return timesOfInvestingAmount;
    }

    public void setTimesOfInvestingAmount(Integer timesOfInvestingAmount) {
        this.timesOfInvestingAmount = timesOfInvestingAmount;
    }

    public Double getMaxAmountPerInvestor() {
        return maxAmountPerInvestor;
    }

    public void setMaxAmountPerInvestor(Double maxAmountPerInvestor) {
        this.maxAmountPerInvestor = maxAmountPerInvestor;
    }

    public Integer getMaxCountOfInvesting() {
        return maxCountOfInvesting;
    }

    public void setMaxCountOfInvesting(Integer maxCountOfInvesting) {
        this.maxCountOfInvesting = maxCountOfInvesting;
    }
    public boolean satisfy() {
        return true;
    }
}
