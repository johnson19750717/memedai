package cn.memedai.operation.common;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

/**
 * Created by dell on 14-6-24.
 */
@Component
public class App {
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
}
