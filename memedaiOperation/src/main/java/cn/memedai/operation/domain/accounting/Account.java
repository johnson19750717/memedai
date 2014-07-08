package cn.memedai.operation.domain.accounting;

/**
 * Created by dell on 14-6-12.
 */
public class Account {
    private Integer memberId;
    private Double crl;
    private Double freezeCrl;
    private Double debit_Amount;
    private Double loanBalance;
    private Double payableInterest;
    private Double payableOverDueInterest;
    private Double payableManagementFee;
    private Double remainAmount;
    private Double returnPrincipal;
 /*
    现金余额	float
冻结现金	float
贷款余额（本金合计）	float
应付利息（应付利息合计）
应付逾期利息合计
应付管理费合计
累计贷款余额	float
累计归还本金	float
累计归还利息	float
累计支付罚息	float
累计支付管理费
应收本金合计	float
应收利息合计	float
应收罚息合计	float
累计已收本金	float
累计已收利息	float
累计已收罚息	float
逾期金额（本费合计）	float
当前逾期天数	float
历史逾期天数（最大）	float
BLOCK_CODE	char(1)
BLOCK_TIME	datetime
     */
}
