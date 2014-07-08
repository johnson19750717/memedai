package cn.memedai.gateway.repository;

import cn.memedai.gateway.domain.auth.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by dell on 14-6-19.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    public User findByUserName(String userName);
}
