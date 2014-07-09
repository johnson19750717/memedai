package cn.memedai.gateway.domain.shoppingcart;

import cn.memedai.gateway.domain.bid.Bid;
import cn.memedai.gateway.domain.investment.Investor;

import java.util.Date;

/**
 * Created by dell on 14-7-8.
 */
public class Investment {
    private Investor investor;
    private Bid bid;
    private Double amountOfInvestment;
    private Date dateOfInvestment;

    public Investor getInvestor() {
        return investor;
    }

    public void setInvestor(Investor investor) {
        this.investor = investor;
    }

    public Bid getBid() {
        return bid;
    }

    public void setBid(Bid bid) {
        this.bid = bid;
    }

    public Double getAmountOfInvestment() {
        return amountOfInvestment;
    }

    public void setAmountOfInvestment(Double amountOfInvestment) {
        this.amountOfInvestment = amountOfInvestment;
    }

    public Date getDateOfInvestment() {
        return dateOfInvestment;
    }

    public void setDateOfInvestment(Date dateOfInvestment) {
        this.dateOfInvestment = dateOfInvestment;
    }
}
