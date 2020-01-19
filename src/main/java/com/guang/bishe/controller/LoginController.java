package com.guang.bishe.controller;

import com.guang.bishe.domain.User;
import com.guang.bishe.service.LoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    /**
     * 跳转登录页面
     */
    @GetMapping(value = "/login")
    public String loginView() {
        return "login";
    }

    /**
     * 登录
     *
     * @return
     */
    @PostMapping(value = "/login")
    public String loginForm(User user, Model model, HttpServletRequest request) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUserEmail(), user.getUserPassword());
        try {
            subject.login(token);
            List<User> userList = loginService.getUser(user);
            if (userList.size() <= 0) {
                model.addAttribute("message", "用户名或密码不正确！");
                return "/login";
            } else {
                request.getSession().setAttribute("user", userList.get(0));
                return "redirect:index";
            }
        } catch (Exception e) {
            model.addAttribute("message", "用户名或密码错误");
            return "/login";
        }

    }

    /**
     * 跳转准备修改密码页面，即输入邮箱跳转
     *
     * @return
     */
    @RequestMapping("/mailEditPassword")
    public String toView() {
        return "mailEditPassword";
    }

    /**
     * 跳转修改密码页面
     *
     * @param email
     * @param model
     * @return
     */
    @PostMapping(value = "/mailEditPassword")
    public String toResetPassword(String email, Model model) {
        String format = "\\w{2,15}[@][a-z0-9]{2,}[.]\\p{Lower}{2,}";
        if (email == null || email == "") {
            model.addAttribute("semail", "邮箱不能为空");
            return "mailEditPassword";
        } else if (!email.matches(format)) {
            model.addAttribute("semail", "邮箱格式不正确");
            return "mailEditPassword";
        }
        User user = loginService.findUserByEmail(email);
        if (user == null) {
            model.addAttribute("semail", "不存在此用户");
            return "mailEditPassword";
        }
        model.addAttribute("userId", user.getUserId());
        return "editPassword";
    }

    /**
     * 更改密码
     *
     * @param password
     * @param passwordAgain
     * @param model
     * @return
     */
    @PostMapping(value = "/editPassword")
    public String editPassword(String password, String passwordAgain, Long userId, Model model) {
        if (password == null || password == "") {
            model.addAttribute("spassword", "密码不能为空");
            return "editPassword";
        } else if (passwordAgain == null || passwordAgain == "") {
            model.addAttribute("spassword2", "确认密码不能为空");
            return "editPassword";
        } else if (!password.equals(passwordAgain)) {
            model.addAttribute("spassword", "两次密码不一致");
            return "editPassword";
        } else {
            User user = new User();
            user.setUserId(userId);
            user.setUserPassword(password);
            loginService.updateUserPassword(user);
        }
        model.addAttribute("view","login");
        model.addAttribute("message","修改密码成功！");
        return  "success";
    }
}
