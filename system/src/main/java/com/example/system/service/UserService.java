/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: UserService
 * Author:   tjqwecom
 * Date:     2020-10-21 22:28
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.system.service;

import com.example.system.mapper.UserMapper;
import com.example.system.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author tjqwecom
 * @create 2020-10-21
 * @since 1.0.0
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public void add(User user) {
        userMapper.add(user);
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    public List<User> list(){

        return userMapper.list();
}

    public void delete(Integer id) {
        userMapper.delete(id);

    }

    public User get(Integer id) {
        return userMapper.get(id);
    }

    public void update(User user) {
        userMapper.update(user);
    }

    public int getCount() {
        return userMapper.getCount();
    }

    public User getbyname(String userName) {
        return userMapper.getbyname(userName);
    }
}

 
