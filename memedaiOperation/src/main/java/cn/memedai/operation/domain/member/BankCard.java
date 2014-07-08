package cn.memedai.operation.domain.member;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by dell on 14-6-23.
 */
@Entity
@Table(name = "BANK_CARD")
public class BankCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Enumerated
    @Column(name = "CARD_TYPE")
    private CardTypeEnum cardType;
    @Column(name = "BANK")
    private Integer bank;
    @Column(name = "CARD_NO")
    private String cardNo;
    @Column(name = "VALID_FROM")
    private Date validFrom;
    @Column(name = "VALID_THRU")
    private Date validThru;
    @Column(name = "NAME_ENG")
    private String nameEng;
    @Column(name = "IMAGE")
    private String image;
    @Column(name = "IDENTI")
    private String identi;
    @Column(name = "BANK_PHONE")
    private String bankPhone;
    @Column(name = "CREATE_TIME")
    private Date createTime;
    @Column(name = "CARD_LEVEL")
    private Integer cardLevel;
    @Column(name = "RELATION")
    private Boolean isRelation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CardTypeEnum getCardType() {
        return cardType;
    }

    public void setCardType(CardTypeEnum cardType) {
        this.cardType = cardType;
    }

    public Integer getBank() {
        return bank;
    }

    public void setBank(Integer bank) {
        this.bank = bank;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidThru() {
        return validThru;
    }

    public void setValidThru(Date validThru) {
        this.validThru = validThru;
    }

    public String getNameEng() {
        return nameEng;
    }

    public void setNameEng(String nameEng) {
        this.nameEng = nameEng;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getIdenti() {
        return identi;
    }

    public void setIdenti(String identi) {
        this.identi = identi;
    }

    public String getBankPhone() {
        return bankPhone;
    }

    public void setBankPhone(String bankPhone) {
        this.bankPhone = bankPhone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCardLevel() {
        return cardLevel;
    }

    public void setCardLevel(Integer cardLevel) {
        this.cardLevel = cardLevel;
    }

    public Boolean getIsRelation() {
        return isRelation;
    }

    public void setIsRelation(Boolean isRelation) {
        this.isRelation = isRelation;
    }
}
