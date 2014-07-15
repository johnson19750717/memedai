package cn.memedai.gateway.service;

import cn.memedai.gateway.domain.investment.Investor;
import cn.memedai.gateway.domain.setting.KeyValuePair;

import java.util.List;

/**
 * Created by Johnson on 7/9/14.
 */
public interface SettingService {
    public List<KeyValuePair> getGlobalSettings();

    public Object get(String key);

    public void set(String key);

    public List<String> getKeys();

    public List<KeyValuePair> getPreferences(Investor investor);

    public void setPreference(Investor investor, String key);
}
