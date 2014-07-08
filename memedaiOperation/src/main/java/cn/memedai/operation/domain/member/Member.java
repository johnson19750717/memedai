package cn.memedai.operation.domain.member;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by dell on 14-6-23.
 */
@Entity
@Table(name = "MEMBER")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "ORG_FLAG")
    private Boolean orgFlag;
    @Column(name = "USER_NAME")
    private String userName;
    @Column(name = "NAME")
    private String name;
    @Column(name = "SEX")
    @Enumerated
    private SexEnum sex;
    @Column(name = "MOBILE")
    private String mobile;
    @Column(name = "MOBILE_CITY")
    private String mobileCity;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "SOURCE")
    @Enumerated
    private MemberSourceEnum source;
    @Column(name = "MAC_ADDRESS")
    private String macAddress;
    @Column(name = "PHONE_TYPE")
    private String phoneType;
    @Column(name = "SERVICE_TOKEN")
    private String serviceToken;
    @Column(name = "REFERRER")
    private String referrer;
    @Column(name = "RATING")
    private String rating;
    @Column(name = "TYPE")
    @Enumerated
    private MemberTypeEnum type;
    @Column(name = "STATUS")
    private Integer status;
    @Column(name = "POINTS")
    private Integer points;
    @Column(name = "CREATE_TIME")
    private Date createTime;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "member")
    private IdCard idCard;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "member")

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getOrgFlag() {
        return orgFlag;
    }

    public void setOrgFlag(Boolean orgFlag) {
        this.orgFlag = orgFlag;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobileCity() {
        return mobileCity;
    }

    public void setMobileCity(String mobileCity) {
        this.mobileCity = mobileCity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public MemberSourceEnum getSource() {
        return source;
    }

    public void setSource(MemberSourceEnum source) {
        this.source = source;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public String getServiceToken() {
        return serviceToken;
    }

    public void setServiceToken(String serviceToken) {
        this.serviceToken = serviceToken;
    }

    public String getReferrer() {
        return referrer;
    }

    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public MemberTypeEnum getType() {
        return type;
    }

    public void setType(MemberTypeEnum type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public IdCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IdCard idCard) {
        this.idCard = idCard;
    }
}
