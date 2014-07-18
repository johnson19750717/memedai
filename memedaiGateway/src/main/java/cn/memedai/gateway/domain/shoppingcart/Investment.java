package cn.memedai.gateway.domain.shoppingcart;

import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by dell on 14-7-8.
 */
public class Investment implements Serializable {
    private Long id;
    private String investor;
    private Long bidNo;
    private Double amountOfInvestment;
    private Date dateOfInvestment;

    public Investment() {
        dateOfInvestment = DateTime.now().toDate();
    }

    public Investment(String investor, Long bidNo, Double amount) {
        this();
        this.investor = investor;
        this.bidNo = bidNo;
        this.amountOfInvestment = amount;
    }

    public String getInvestor() {
        return investor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setInvestor(String investor) {
        this.investor = investor;
    }

    public Long getBidNo() {
        return bidNo;
    }

    public void setBidNo(Long bidNo) {
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
