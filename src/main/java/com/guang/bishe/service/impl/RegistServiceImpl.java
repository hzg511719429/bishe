package com.guang.bishe.service.impl;

import com.guang.bishe.domain.User;
import com.guang.bishe.domain.UserExample;
import com.guang.bishe.mapper.UserMapper;
import com.guang.bishe.service.RegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistServiceImpl implements RegistService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByEmail(String userEmail) {
        //创建查询条件
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria1 = userExample.createCriteria();
        criteria1.andUserEmailEqualTo(userEmail);
        //执行查询
        List<User> userList = userMapper.selectByExample(userExample);
        if (userList.size() > 0) {
            return userList.get(0);
        }
        return null;
    }

    @Override
    public void insertUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateByPrimaryKey(user);
    }


}
