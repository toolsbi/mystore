/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: AdUserService
 * Author:   tjqwecom
 * Date:     2020-11-04 20:52
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.system.service;

import com.example.system.pojo.User_info;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author tjqwecom
 * @create 2020-11-04
 * @since 1.0.0
 */
public interface AdUserService {

     User_info getUser(String name);


    void addUser(String name, String password);
}
