package cn.memedai.operation.domain.accounting;

/**
 * Created by dell on 14-6-12.
 */
public enum LoanPeriodEnum {
    ON_DEMAND(0, "随借随还"),
    M1(30, "1m"),
    M2(60, "2m"),
    M3(90, "3m"),
    M4(120, "4m"),
    M5(150, "5m"),
    M6(180, "6m"),
    M9(270, "9m"),
    M12(360, "12m");

    private final int days;
    private final String name;

    LoanPeriodEnum(int days, String name) {
        this.days = days;
        this.name = name;
    }

    public int getDays() {
        return days;
    }

    public String getName() {
        return name;
    }
}
