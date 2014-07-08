package cn.memedai.gateway.domain.bid;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by dell on 14-6-4.
 */
@Entity
@Table(name = "BID")
public class Bid implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Embedded
    private BidMetaData metaData;
    @Column(name = "AVL_AMT")
    private Double availableAmount;
    @Column(name = "INVESTED_AMT")
    private Double investedAmount;
    @Column(name = "SHOPPING_CART_AMT")
    private Double shoppingCartAmount;
    @Column(name = "INVESTED_COUNT")
    private Integer investedCount;
    @Column(name = "PROGRESS")
    private Double progress;
    @Column(name = "VISIBILITY")
    private Integer visibility;
    @Column(name = "SETTLED")
    private Boolean settled;
    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS")
    private BidStatusEnum bidStatus;

    public BidStatusEnum getBidStatus() {
        return bidStatus;
    }

    public void setBidStatus(BidStatusEnum bidStatus) {
        this.bidStatus = bidStatus;
    }

    public Double getAvailableAmount() {
        return metaData.amount() - investedAmount - shoppingCartAmount;
    }

    public void setAvailableAmount(Double availableAmount) {
        this.availableAmount = availableAmount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public Boolean getSettled() {
        return settled;
    }

    public void setSettled(Boolean settled) {
        this.settled = settled;
    }

    public Double getProgress() {
        return (shoppingCartAmount + investedAmount) / metaData.amount();
    }

    public void setProgress(Double progress) {
        this.progress = progress;
    }

    public BidMetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(BidMetaData metaData) {
        this.metaData = metaData;
    }

    public Double getInvestedAmount() {
        return investedAmount;
    }

    public void setInvestedAmount(Double investedAmount) {
        this.investedAmount = investedAmount;
    }

    public Double getShoppingCartAmount() {
        return shoppingCartAmount;
    }

    public void setShoppingCartAmount(Double shoppingCartAmount) {
        this.shoppingCartAmount = shoppingCartAmount;
    }

    public Integer getInvestedCount() {
        return investedCount;
    }

    public void setInvestedCount(Integer investedCount) {
        this.investedCount = investedCount;
    }
}
