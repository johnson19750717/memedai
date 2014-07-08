package cn.memedai.gateway.domain.bid;

/**
 * Created by dell on 14-7-8.
 */
public enum UnderlyingAssetEnum {
    LOAN(1, "普通标"), PRODUCT_PACKAGE(2, "转让标"), ASSIGNMENT_OF_DEBT(3, "产品包");
    private final Integer code;
    private final String name;

    UnderlyingAssetEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return code.toString();
    }
}
