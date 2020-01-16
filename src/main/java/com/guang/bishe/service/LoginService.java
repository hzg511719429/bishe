package com.guang.bishe.service;


import com.guang.bishe.domain.User;

import java.util.List;

public interface LoginService {

    /**
     * 用户登录，判断用户的用户名和密码是否正确
     *
     * @param user
     * @return
     */
    List<User> getUser(User user);

    /**
     * 根据邮箱查询用户
     *
     * @param email
     * @return
     */
    User findUserByEmail(String email);

    /**
     * 更改用户的密码
     *
     * @param user
     */
    void updateUserPassword(User user);
}
