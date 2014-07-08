package cn.memedai.operation.domain.accounting.pricing;

import java.util.List;

/**
 * Created by dell on 14-6-12.
 */
public class OverDuePolicy {
    private String policyCode;
    private List<OverDuePolicyDetail> details;

    public String getPolicyCode() {
        return policyCode;
    }

    public void setPolicyCode(String policyCode) {
        this.policyCode = policyCode;
    }

    public List<OverDuePolicyDetail> getDetails() {
        return details;
    }

    public void setDetails(List<OverDuePolicyDetail> details) {
        this.details = details;
    }
}
