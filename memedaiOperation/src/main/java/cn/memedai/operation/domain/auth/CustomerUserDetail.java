package cn.memedai.operation.domain.auth;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by dell on 14-6-20.
 */
public class CustomerUserDetail extends Staff implements UserDetails {
    private Staff staff;

    public CustomerUserDetail() {
    }

    public CustomerUserDetail(Staff staff) {
        this.staff = staff;
        this.setPassword(staff.getPassword());
        this.setUserName(staff.getUserName());
        this.setId(staff.getId());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (StaffRole sf : staff.getRoles()) {
            authorities.add(new SimpleGrantedAuthority(sf.getRole().getRoleName()));
        }
        return authorities;
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public String getUsername() {
        return super.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
