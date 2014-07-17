package cn.memedai.gateway.common;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by dell on 14-7-17.
 */
public class PasswordEncoder {
    private static final BCryptPasswordEncoder ENCODER = new BCryptPasswordEncoder();

    public String encode(String rawPassword) {
        return ENCODER.encode(rawPassword);
    }
}
