package cn.memedai.gateway.domain.bid;

/**
 * Created by dell on 14-7-8.
 */
public enum BidStatusEnum {
    BIDDING(10, "已上架"), WIN(20, "已满标"), FAIL(30, "流标");
    private final Integer code;
    private final String desc;

    BidStatusEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static BidStatusEnum fromCode(Integer code) {
        for (BidStatusEnum bse : values()) {
            if (bse.code.equals(code)) return bse;
        }
        return null;
    }

    @Override
    public String toString() {
        return code.toString();
    }
}
