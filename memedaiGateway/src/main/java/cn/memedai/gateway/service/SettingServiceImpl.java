package cn.memedai.gateway.service;

import cn.memedai.gateway.domain.investment.Investor;
import cn.memedai.gateway.domain.setting.KeyValuePair;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Johnson on 7/9/14.
 */
@Service(value = "settingService")
public class SettingServiceImpl implements SettingService {
    @Override
    public List<KeyValuePair> getGlobalSettings() {
        return null;
    }

    @Override
    public Object get(String key) {
        return null;
    }

    @Override
    public void set(String key) {

    }

    @Override
    public List<String> getKeys() {
        return null;
    }

    @Override
    public List<KeyValuePair> getPreferences(Investor investor) {
        return null;
    }

    @Override
    public void setPreference(Investor investor, String key) {

    }
}
