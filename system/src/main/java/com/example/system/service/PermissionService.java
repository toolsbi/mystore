/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: PermissionService
 * Author:   tjqwecom
 * Date:     2020-11-04 20:21
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.system.service;

import com.example.system.pojo.Permission;

import java.security.Permissions;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author tjqwecom
 * @create 2020-11-04
 * @since 1.0.0
 */
public interface PermissionService {
    public List<Permission> findPermissionsByRole(Integer roleId);
}
