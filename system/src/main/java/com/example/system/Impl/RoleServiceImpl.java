/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: RoleServiceImpl
 * Author:   tjqwecom
 * Date:     2020-11-05 20:36
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.system.Impl;

import com.example.system.mapper.RoleMapper;
import com.example.system.pojo.Role;
import com.example.system.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author tjqwecom
 * @create 2020-11-05
 * @since 1.0.0
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> getRolesByUserId(Integer userid) {

        return roleMapper.findRolesByUsername(userid);
    }
}

 
