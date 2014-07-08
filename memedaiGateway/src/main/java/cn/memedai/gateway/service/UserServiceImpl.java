package cn.memedai.gateway.service;

import cn.memedai.gateway.domain.auth.User;
import cn.memedai.gateway.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

/**
 * Created by dell on 14-6-19.
 */
@Service(value = "userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Inject
    private UserRepository userRepository;

    @Override
    public User getUser(String userName) {
        return userRepository.findByUserName(userName);
    }

    @Override
    public User register(User user) {
        return userRepository.save(user);
    }

    @Override
    public boolean login(String userName, String password) {
        return false;
    }
}
