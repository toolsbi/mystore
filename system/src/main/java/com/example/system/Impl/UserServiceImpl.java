/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: AdUserServiceImpl
 * Author:   tjqwecom
 * Date:     2020-11-05 14:17
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.system.Impl;

import com.example.system.mapper.User_infoMapper;
import com.example.system.pojo.User_info;
import com.example.system.service.AdUserService;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author tjqwecom
 * @create 2020-11-05
 * @since 1.0.0
 */
@Service
public class UserServiceImpl implements AdUserService {
    @Autowired
    private User_infoMapper user_infoMapper;
//    @Override
//    public User_info findByName(String name) {
//        return user_infoMapper.findByName(name);
//    }

    @Override
    public User_info getUser(String name) {
            // 没有此用户直接返回null
            if ( user_infoMapper.findByName(name)==null)
                return null;
            User_info detail =user_infoMapper.findByName(name);

            return detail;
    }

    @Override
    public void addUser(String name, String password) {

        user_infoMapper.addUser(name,MD5Pwd(name,password));
    }
    public static String MD5Pwd(String username, String pwd) {
        // 加密算法MD5
        // salt盐 username + salt
        // 迭代次数
        String md5Pwd = new SimpleHash("MD5", pwd, ByteSource.Util.bytes(username + "salt"), 2).toHex();
        return md5Pwd;
    }

}

