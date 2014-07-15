package cn.memedai.gateway.domain.setting;

/**
 * Created by Johnson on 7/9/14.
 */
public class KeyValuePair {
    private final String key;
    private final Object value;

    public KeyValuePair(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }

    public static KeyValuePair valueOf(final String key, final Object value) {
        return new KeyValuePair(key, value);
    }
}
