package cn.memedai.operation.domain.accounting.loan;

/**
 * Created by dell on 14-7-1.
 */
public class DebtorCreditorRelationship {
    private Long id;
    private Loan loan;
    private String investor;
    private String borrower;
    private Double amount;
    private String date;
}
