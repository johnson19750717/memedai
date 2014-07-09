package cn.memedai.gateway.domain.shoppingcart;

import cn.memedai.gateway.domain.investment.Investor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by dell on 14-7-8.
 */
public class Order {
    private Investor investor;
    private Date createDate;
    private Double amount;
    private Integer countOfInvestment;
    private Double paymentByThirdParty;
    private Double paymentByAccount;
    private Double paymentByCoupon;
    private Double paymentByBonusPoints;
    private Double amountOfPaymentByBonusPoints;
    private Double paymentTotalAmount;
    private String serialNoOfThirdPartyPayment;
    private String serialNoOfAccountPayment;
    private String serialNoOfCouponPayment;
    private String serialNoOfBonusPointsPayment;
    private Integer paymentStatus;
    private Integer settleFlag;
    private List<Investment> investments = new ArrayList<>();

    public Order(Investor investor, List<Investment> investments) {
        this.investor = investor;
        this.investments = investments;
    }

    public Investor getInvestor() {
        return investor;
    }

    public void setInvestor(Investor investor) {
        this.investor = investor;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getCountOfInvestment() {
        return countOfInvestment;
    }

    public void setCountOfInvestment(Integer countOfInvestment) {
        this.countOfInvestment = countOfInvestment;
    }

    public Double getPaymentByThirdParty() {
        return paymentByThirdParty;
    }

    public void setPaymentByThirdParty(Double paymentByThirdParty) {
        this.paymentByThirdParty = paymentByThirdParty;
    }

    public Double getPaymentByAccount() {
        return paymentByAccount;
    }

    public void setPaymentByAccount(Double paymentByAccount) {
        this.paymentByAccount = paymentByAccount;
    }

    public Double getPaymentByCoupon() {
        return paymentByCoupon;
    }

    public void setPaymentByCoupon(Double paymentByCoupon) {
        this.paymentByCoupon = paymentByCoupon;
    }

    public Double getPaymentByBonusPoints() {
        return paymentByBonusPoints;
    }

    public void setPaymentByBonusPoints(Double paymentByBonusPoints) {
        this.paymentByBonusPoints = paymentByBonusPoints;
    }

    public Double getAmountOfPaymentByBonusPoints() {
        return amountOfPaymentByBonusPoints;
    }

    public void setAmountOfPaymentByBonusPoints(Double amountOfPaymentByBonusPoints) {
        this.amountOfPaymentByBonusPoints = amountOfPaymentByBonusPoints;
    }

    public Double getPaymentTotalAmount() {
        return paymentTotalAmount;
    }

    public void setPaymentTotalAmount(Double paymentTotalAmount) {
        this.paymentTotalAmount = paymentTotalAmount;
    }

    public String getSerialNoOfThirdPartyPayment() {
        return serialNoOfThirdPartyPayment;
    }

    public void setSerialNoOfThirdPartyPayment(String serialNoOfThirdPartyPayment) {
        this.serialNoOfThirdPartyPayment = serialNoOfThirdPartyPayment;
    }

    public String getSerialNoOfAccountPayment() {
        return serialNoOfAccountPayment;
    }

    public void setSerialNoOfAccountPayment(String serialNoOfAccountPayment) {
        this.serialNoOfAccountPayment = serialNoOfAccountPayment;
    }

    public String getSerialNoOfCouponPayment() {
        return serialNoOfCouponPayment;
    }

    public void setSerialNoOfCouponPayment(String serialNoOfCouponPayment) {
        this.serialNoOfCouponPayment = serialNoOfCouponPayment;
    }

    public String getSerialNoOfBonusPointsPayment() {
        return serialNoOfBonusPointsPayment;
    }

    public void setSerialNoOfBonusPointsPayment(String serialNoOfBonusPointsPayment) {
        this.serialNoOfBonusPointsPayment = serialNoOfBonusPointsPayment;
    }

    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Integer getSettleFlag() {
        return settleFlag;
    }

    public void setSettleFlag(Integer settleFlag) {
        this.settleFlag = settleFlag;
    }

    public List<Investment> getInvestments() {
        return investments;
    }

    public void setInvestments(List<Investment> investments) {
        this.investments = investments;
    }

    public void pay() {

    }

    public void cancel() {

    }
}
