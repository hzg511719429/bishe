package com.guang.bishe.service.impl;

import com.guang.bishe.domain.User;
import com.guang.bishe.domain.UserExample;
import com.guang.bishe.mapper.UserMapper;
import com.guang.bishe.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUser(User user) {
        //根据登录用户名，即用户邮箱和密码来查询用户，确认输入的账户和密码是否正确
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria1 = userExample.createCriteria();
        criteria1.andUserEmailEqualTo(user.getUserEmail());
        criteria1.andUserPasswordEqualTo(user.getUserPassword());
        //执行查询
        List<User> userList = userMapper.selectByExample(userExample);

        return userList;
    }

    @Override
    public User findUserByEmail(String email) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserEmailEqualTo(email);
        List<User> list = userMapper.selectByExample(example);
        if (list.size() == 0) {
            return null;
        } else {
            return list.get(0);
        }
    }

    @Override
    public void updateUserPassword(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }
}
