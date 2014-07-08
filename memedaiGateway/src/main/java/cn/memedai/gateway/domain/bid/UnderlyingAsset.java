package cn.memedai.gateway.domain.bid;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * Created by dell on 14-7-8.
 */
@Embeddable
public class UnderlyingAsset {
    @Column(name = "LOAN_ID")
    private String loanNo;
    @Column(name = "BORROWER")
    private Integer borrower;
    @Column(name = "TEXT_DISPLAY_ON_ICON")
    private String textDisplayOnIcon;
    @Column(name = "TYPE")
    @Enumerated(EnumType.STRING)
    private UnderlyingAssetEnum type;
    @Column(name = "APR")
    private Double apr;
    @Column(name = "TERM")

    private Integer term;
    @Column(name = "AMOUNT")
    private Double amount;
    @Column(name = "MAX_TERM")
    private Integer maxTerm;
    @Column(name = "EACH_PAYMENT")
    private Double eachPayment;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "TOTAL_TERM")
    private Integer totalTerm;
    @Column(name = "REPAYMENT_METHOD")
    private String repaymentMethod;
    @Column(name = "REMAINING_TERM")
    private Integer remainingTerm;
    @Column(name = "REMAINING_PRINCIPAL")
    private Double remainingPrincipal;
    @Column(name = "REMAINING_INTEREST")
    private Double remainingInterest;
    @Column(name = "RATING")
    private String rating;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "PROPERTY")
    private String property;


    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo;
    }

    public Integer getBorrower() {
        return borrower;
    }

    public void setBorrower(Integer borrower) {
        this.borrower = borrower;
    }

    public String getTextDisplayOnIcon() {
        return textDisplayOnIcon;
    }

    public void setTextDisplayOnIcon(String textDisplayOnIcon) {
        this.textDisplayOnIcon = textDisplayOnIcon;
    }

    public Double getApr() {
        return apr;
    }

    public void setApr(Double apr) {
        this.apr = apr;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getMaxTerm() {
        return maxTerm;
    }

    public void setMaxTerm(Integer maxTerm) {
        this.maxTerm = maxTerm;
    }

    public Double getEachPayment() {
        return eachPayment;
    }

    public void setEachPayment(Double eachPayment) {
        this.eachPayment = eachPayment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getTotalTerm() {
        return totalTerm;
    }

    public void setTotalTerm(Integer totalTerm) {
        this.totalTerm = totalTerm;
    }

    public Integer getRemainingTerm() {
        return remainingTerm;
    }

    public void setRemainingTerm(Integer remainingTerm) {
        this.remainingTerm = remainingTerm;
    }

    public Double getRemainingPrincipal() {
        return remainingPrincipal;
    }

    public void setRemainingPrincipal(Double remainingPrincipal) {
        this.remainingPrincipal = remainingPrincipal;
    }

    public Double getRemainingInterest() {
        return remainingInterest;
    }

    public void setRemainingInterest(Double remainingInterest) {
        this.remainingInterest = remainingInterest;
    }

    public String getRepaymentMethod() {
        return repaymentMethod;
    }

    public void setRepaymentMethod(String repaymentMethod) {
        this.repaymentMethod = repaymentMethod;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public UnderlyingAssetEnum getType() {
        return type;
    }

    public void setType(UnderlyingAssetEnum type) {
        this.type = type;
    }
}
