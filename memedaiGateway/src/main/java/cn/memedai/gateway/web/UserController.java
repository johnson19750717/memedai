package cn.memedai.gateway.web;

import cn.memedai.gateway.domain.auth.User;
import cn.memedai.gateway.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by dell on 14-7-17.
 */
@Controller(value = "userController")
@RequestMapping(value = "/users")
public class UserController {
    @Inject
    private UserService userService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public User register(@RequestBody User user) {
        return userService.register(user);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @RequestMapping(value = "/{userName}/pwd/{pwd}", method = RequestMethod.GET)
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public void changePwd(@PathVariable String userName, @PathVariable String pwd) {
        userService.changePwd(userName, pwd);
    }
}
