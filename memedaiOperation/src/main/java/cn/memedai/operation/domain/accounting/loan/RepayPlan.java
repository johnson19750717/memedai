package cn.memedai.operation.domain.accounting.loan;

import java.util.Date;

/**
 * Created by dell on 14-6-12.
 */
public class RepayPlan {
    private Long id;
    private Loan loan;
    private Integer integer;
    private Date dueDate;
    private Double principal;
    private Double interest;
    private Double managementFee;
    private Double amount;
    private Integer daysOfOverDue;
    private Double principalOfOverDue;
    private Double interestOfOverDue;
    private Double maxDaysOfOverDue;

    private Double paidPrincipal;
    private Double paidInterest;
    private Double paidInterestOfOverDue;
    private Double paidManagementFee;
    private Double paidAmount;
    private Double remainingPrincipal;
    private Double remainingPrincipalOfPreviousTerm;
    private Double maxPrincipalOfOverDue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Double getPrincipal() {
        return principal;
    }

    public void setPrincipal(Double principal) {
        this.principal = principal;
    }

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    public Double getManagementFee() {
        return managementFee;
    }

    public void setManagementFee(Double managementFee) {
        this.managementFee = managementFee;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getDaysOfOverDue() {
        return daysOfOverDue;
    }

    public void setDaysOfOverDue(Integer daysOfOverDue) {
        this.daysOfOverDue = daysOfOverDue;
    }

    public Double getPrincipalOfOverDue() {
        return principalOfOverDue;
    }

    public void setPrincipalOfOverDue(Double principalOfOverDue) {
        this.principalOfOverDue = principalOfOverDue;
    }

    public Double getInterestOfOverDue() {
        return interestOfOverDue;
    }

    public void setInterestOfOverDue(Double interestOfOverDue) {
        this.interestOfOverDue = interestOfOverDue;
    }

    public Double getMaxDaysOfOverDue() {
        return maxDaysOfOverDue;
    }

    public void setMaxDaysOfOverDue(Double maxDaysOfOverDue) {
        this.maxDaysOfOverDue = maxDaysOfOverDue;
    }

    public Double getPaidPrincipal() {
        return paidPrincipal;
    }

    public void setPaidPrincipal(Double paidPrincipal) {
        this.paidPrincipal = paidPrincipal;
    }

    public Double getPaidInterest() {
        return paidInterest;
    }

    public void setPaidInterest(Double paidInterest) {
        this.paidInterest = paidInterest;
    }

    public Double getPaidInterestOfOverDue() {
        return paidInterestOfOverDue;
    }

    public void setPaidInterestOfOverDue(Double paidInterestOfOverDue) {
        this.paidInterestOfOverDue = paidInterestOfOverDue;
    }

    public Double getPaidManagementFee() {
        return paidManagementFee;
    }

    public void setPaidManagementFee(Double paidManagementFee) {
        this.paidManagementFee = paidManagementFee;
    }

    public Double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public Double getRemainingPrincipal() {
        return remainingPrincipal;
    }

    public void setRemainingPrincipal(Double remainingPrincipal) {
        this.remainingPrincipal = remainingPrincipal;
    }

    public Double getRemainingPrincipalOfPreviousTerm() {
        return remainingPrincipalOfPreviousTerm;
    }

    public void setRemainingPrincipalOfPreviousTerm(Double remainingPrincipalOfPreviousTerm) {
        this.remainingPrincipalOfPreviousTerm = remainingPrincipalOfPreviousTerm;
    }

    public Double getMaxPrincipalOfOverDue() {
        return maxPrincipalOfOverDue;
    }

    public void setMaxPrincipalOfOverDue(Double maxPrincipalOfOverDue) {
        this.maxPrincipalOfOverDue = maxPrincipalOfOverDue;
    }
}
