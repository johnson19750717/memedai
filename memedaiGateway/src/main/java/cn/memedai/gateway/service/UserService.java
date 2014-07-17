package cn.memedai.gateway.service;

import cn.memedai.gateway.domain.auth.User;

import java.util.List;

/**
 * Created by dell on 14-6-19.
 */
public interface UserService {
    public User getUser(String userName);

    public User register(User user);

    public User update(User user);

    public User changePwd(String userName, String pwd);

    public boolean login(String userName, String password);

    public List<User> getUsers();

}
