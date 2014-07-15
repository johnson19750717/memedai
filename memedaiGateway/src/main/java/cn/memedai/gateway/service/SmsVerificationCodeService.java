package cn.memedai.gateway.service;

/**
 * Created by dell on 14-7-15.
 */
public interface SmsVerificationCodeService {
    public boolean sendVerificationCode(String mobilePhone);

    public boolean verifyCode(String mobilePhone, String code);
}
