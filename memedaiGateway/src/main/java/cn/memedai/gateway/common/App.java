package cn.memedai.gateway.common;

import org.springframework.core.env.Environment;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

/**
 * Created by dell on 14-7-18.
 */
@Component(value = "App")
public final class App {
    @Inject
    private Environment environment;

    public String getDatabaseSetting() {
        return null;
    }

    public String getNotificationCenterSetting() {
        return null;
    }

    public String getSocketServerSetting() {
        return null;
    }

    public String getCurrentUser() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return principal instanceof UserDetails ? ((UserDetails) principal).getUsername() : principal.toString();
    }

    public Integer getRetainTimeOfShoppingCart() {
        return environment.getProperty("bid.cart.retainTime", Integer.class);
    }
}
