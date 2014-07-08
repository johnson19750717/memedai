package cn.memedai.operation.domain.accounting.loan;

import cn.memedai.operation.domain.accounting.LoanPeriodEnum;
import cn.memedai.operation.domain.accounting.RepaymentModeEnum;
import cn.memedai.operation.domain.accounting.pricing.AprPolicy;
import cn.memedai.operation.domain.accounting.pricing.FeePolicy;
import cn.memedai.operation.domain.accounting.pricing.OverDuePolicy;
import cn.memedai.operation.domain.accounting.pricing.Product;

import java.util.Date;

/**
 * Created by dell on 14-6-12.
 */
public class Loan {
    private Long id;
    private Product product;
    private String title;
    private String description;
    private RepaymentModeEnum repaymentModeEnum;
    private LoanPeriodEnum loanPeriodEnum;
    private AprPolicy aprPolicy;
    private FeePolicy feePolicy;
    private OverDuePolicy overDuePolicy;
    private Double planingInterest;
    private Integer term;
    private Double principal;
    private Date applyDate;
    private Date approvedDate;
    private Date fullBidDate;
    private Date lendDate;
    private Date interestDate;
    private Date dueDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RepaymentModeEnum getRepaymentModeEnum() {
        return repaymentModeEnum;
    }

    public void setRepaymentModeEnum(RepaymentModeEnum repaymentModeEnum) {
        this.repaymentModeEnum = repaymentModeEnum;
    }

    public LoanPeriodEnum getLoanPeriodEnum() {
        return loanPeriodEnum;
    }

    public void setLoanPeriodEnum(LoanPeriodEnum loanPeriodEnum) {
        this.loanPeriodEnum = loanPeriodEnum;
    }

    public AprPolicy getAprPolicy() {
        return aprPolicy;
    }

    public void setAprPolicy(AprPolicy aprPolicy) {
        this.aprPolicy = aprPolicy;
    }

    public FeePolicy getFeePolicy() {
        return feePolicy;
    }

    public void setFeePolicy(FeePolicy feePolicy) {
        this.feePolicy = feePolicy;
    }

    public OverDuePolicy getOverDuePolicy() {
        return overDuePolicy;
    }

    public void setOverDuePolicy(OverDuePolicy overDuePolicy) {
        this.overDuePolicy = overDuePolicy;
    }

    public Double getPlaningInterest() {
        return planingInterest;
    }

    public void setPlaningInterest(Double planingInterest) {
        this.planingInterest = planingInterest;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public Double getPrincipal() {
        return principal;
    }

    public void setPrincipal(Double principal) {
        this.principal = principal;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public Date getApprovedDate() {
        return approvedDate;
    }

    public void setApprovedDate(Date approvedDate) {
        this.approvedDate = approvedDate;
    }

    public Date getFullBidDate() {
        return fullBidDate;
    }

    public void setFullBidDate(Date fullBidDate) {
        this.fullBidDate = fullBidDate;
    }

    public Date getLendDate() {
        return lendDate;
    }

    public void setLendDate(Date lendDate) {
        this.lendDate = lendDate;
    }

    public Date getInterestDate() {
        return interestDate;
    }

    public void setInterestDate(Date interestDate) {
        this.interestDate = interestDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
