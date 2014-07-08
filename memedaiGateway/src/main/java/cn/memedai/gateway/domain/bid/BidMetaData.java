package cn.memedai.gateway.domain.bid;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by dell on 14-7-8.
 */
@Embeddable
public class BidMetaData {
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "START_DATE")
    private Date startDate;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "END_DATE")
    private Date endDate;
    @Embedded
    private UnderlyingAsset underlyingAsset;
    @Embedded
    private BidSpecification specification;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public UnderlyingAsset getUnderlyingAsset() {
        return underlyingAsset;
    }

    public void setUnderlyingAsset(UnderlyingAsset underlyingAsset) {
        this.underlyingAsset = underlyingAsset;
    }

    public BidSpecification getSpecification() {
        return specification;
    }

    public void setSpecification(BidSpecification specification) {
        this.specification = specification;
    }

    public Double amount() {
        return underlyingAsset.getAmount();
    }
}
