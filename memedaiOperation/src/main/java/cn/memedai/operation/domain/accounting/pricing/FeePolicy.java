package cn.memedai.operation.domain.accounting.pricing;

import java.util.List;

/**
 * Created by dell on 14-6-12.
 */
public class FeePolicy {
    private String policyCode;
    private List<FeePolicyDetail> details;

    public String getPolicyCode() {
        return policyCode;
    }

    public void setPolicyCode(String policyCode) {
        this.policyCode = policyCode;
    }

    public List<FeePolicyDetail> getDetails() {
        return details;
    }

    public void setDetails(List<FeePolicyDetail> details) {
        this.details = details;
    }
}
