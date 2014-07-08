package cn.memedai.operation.web;

import cn.memedai.operation.domain.auth.Staff;
import cn.memedai.operation.service.StaffService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by dell on 14-6-20.
 */
@Controller
@RequestMapping(value = "/staffs")
public class StaffController {
    @Inject
    private StaffService staffService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public List<Staff> findStaffs() {
        return staffService.findStaffs();
    }

    @RequestMapping(value = "/user/", method = RequestMethod.GET)
    @ResponseBody
    public String getCurrentUser() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return principal instanceof UserDetails ? ((UserDetails) principal).getUsername() : principal.toString();
    }
}
