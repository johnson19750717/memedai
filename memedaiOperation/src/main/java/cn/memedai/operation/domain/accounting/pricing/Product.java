package cn.memedai.operation.domain.accounting.pricing;

import cn.memedai.operation.domain.accounting.LoanPeriodEnum;
import cn.memedai.operation.domain.accounting.pricing.AprPolicy;

import java.util.ArrayList;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;

/**
 * Created by dell on 14-6-12.
 */
public class Product {
    private String productNo;
    private String productName;
    private String productShortName;
    private Integer productType;
    private Double optionalAmtFrom;
    private Double optionalAmtTo;
    private Double aprFrom;
    private Double aprTo;
    private EnumSet<LoanPeriodEnum> periodEnumEnumSet;
    private Integer graceDays;
    private Date validDate;
    private Date invalidDate;
    private List<AprPolicy> aprPolicies = new ArrayList<>();

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductShortName() {
        return productShortName;
    }

    public void setProductShortName(String productShortName) {
        this.productShortName = productShortName;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public Double getOptionalAmtFrom() {
        return optionalAmtFrom;
    }

    public void setOptionalAmtFrom(Double optionalAmtFrom) {
        this.optionalAmtFrom = optionalAmtFrom;
    }

    public Double getOptionalAmtTo() {
        return optionalAmtTo;
    }

    public void setOptionalAmtTo(Double optionalAmtTo) {
        this.optionalAmtTo = optionalAmtTo;
    }

    public Double getAprFrom() {
        return aprFrom;
    }

    public void setAprFrom(Double aprFrom) {
        this.aprFrom = aprFrom;
    }

    public Double getAprTo() {
        return aprTo;
    }

    public void setAprTo(Double aprTo) {
        this.aprTo = aprTo;
    }

    public EnumSet<LoanPeriodEnum> getPeriodEnumEnumSet() {
        return periodEnumEnumSet;
    }

    public void setPeriodEnumEnumSet(EnumSet<LoanPeriodEnum> periodEnumEnumSet) {
        this.periodEnumEnumSet = periodEnumEnumSet;
    }

    public Integer getGraceDays() {
        return graceDays;
    }

    public void setGraceDays(Integer graceDays) {
        this.graceDays = graceDays;
    }

    public Date getValidDate() {
        return validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    public Date getInvalidDate() {
        return invalidDate;
    }

    public void setInvalidDate(Date invalidDate) {
        this.invalidDate = invalidDate;
    }

    public List<AprPolicy> getAprPolicies() {
        return aprPolicies;
    }

    public void setAprPolicies(List<AprPolicy> aprPolicies) {
        this.aprPolicies = aprPolicies;
    }
}
