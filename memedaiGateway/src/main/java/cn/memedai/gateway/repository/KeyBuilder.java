package cn.memedai.gateway.repository;

/**
 * Created by Johnson on 7/10/14.
 */
public class KeyBuilder {
    public static String cartKey(String investor) {
        return investor + ":cart";
    }
}
