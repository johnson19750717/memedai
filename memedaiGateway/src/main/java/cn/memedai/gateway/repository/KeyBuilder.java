package cn.memedai.gateway.repository;

/**
 * Created by Johnson on 7/10/14.
 */
public class KeyBuilder {
    public static String cartKey(String investor) {
        return investor + ":cart";
    }

    public static String cartInvestmentsKey(String investor) {
        return investor + ":cart:investments";
    }

    public static String investmentKey(String investor, Long investmentId) {
        return investor + ":cart:investment:" + investmentId;
    }

    public static String bidKey(Long bidNo) {
        return "bidNo:" + bidNo;
    }

    public static String bidGlobalUid() {
        return "global:uid:bid";
    }

    public static String investmentGlobalUid() {
        return "global:uid:investment.id";
    }
}
