package cn.memedai.gateway.service;

import cn.memedai.gateway.domain.auth.User;

/**
 * Created by dell on 14-6-19.
 */
public interface UserService {
    public User getUser(String userName);

    public User register(User user);

    public boolean login(String userName, String password);
}
