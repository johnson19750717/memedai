package cn.memedai.operation.domain.accounting;

/**
 * Created by dell on 14-6-12.
 */
public enum RepaymentModeEnum {
    AVERAGE_CAPTIAL_INTEREST(331, "等额本息"),
    DUE_PRINCIPAL_INTEREST(553, "等额本息"),
    ON_DEMAND(554, "随借随还");

    private final Integer code;
    private final String name;

    RepaymentModeEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
