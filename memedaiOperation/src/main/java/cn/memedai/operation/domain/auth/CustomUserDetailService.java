package cn.memedai.operation.domain.auth;

import cn.memedai.operation.service.StaffService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

/**
 * Created by dell on 14-6-20.
 */
@Component(value = "customUserDetailService")
public class CustomUserDetailService implements UserDetailsService {
    @Inject
    private StaffService staffService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Staff staff = staffService.findBy(userName);
        if (staff == null) {
            throw new UsernameNotFoundException("UserName " + userName + " not found");
        }
        return new CustomerUserDetail(staff);
    }
}

