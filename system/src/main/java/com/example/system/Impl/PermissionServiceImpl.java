/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: PermissionServiceImpl
 * Author:   tjqwecom
 * Date:     2020-11-07 13:34
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.system.Impl;

import com.example.system.mapper.PermissionMapper;
import com.example.system.pojo.Permission;
import com.example.system.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Permissions;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author tjqwecom
 * @create 2020-11-07
 * @since 1.0.0
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionMapper permissionMapper;
    @Override
    public List<Permission> findPermissionsByRole(Integer roleId) {
        return permissionMapper.findPermissionsByRole(roleId);
    }
}
