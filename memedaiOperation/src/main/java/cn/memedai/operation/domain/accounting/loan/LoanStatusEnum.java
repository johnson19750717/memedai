package cn.memedai.operation.domain.accounting.loan;

/**
 * Created by dell on 14-6-12.
 */
public enum LoanStatusEnum {
    BIDING(10, "投标中"),
    WAITING(20, "等待放款"),
    NORMAL(30, "正常"),
    OVERDUE(40, "逾期"),
    OUTOFOVERDUE(50, "打呆"),
    CLOSE(90, "结清"),
    CANCEL(91, "客户取消");

    private final int code;
    private final String name;

    LoanStatusEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
