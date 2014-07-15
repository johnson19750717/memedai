package cn.memedai.gateway.domain.shoppingcart;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by dell on 14-7-8.
 */
public class Investment implements Serializable {
    private String investor;
    private String bidNo;
    private Double amountOfInvestment;
    private Date dateOfInvestment;

    public String getInvestor() {
        return investor;
    }

    public void setInvestor(String investor) {
        this.investor = investor;
    }

    public String getBidNo() {
        return bidNo;
    }

    public void setBidNo(String bidNo) {
        this.bidNo = bidNo;
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
