/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: UserMapper
 * Author:   tjqwecom
 * Date:     2020-10-21 19:09
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.system.mapper;

import com.example.system.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author tjqwecom
 * @create 2020-10-21
 * @since 1.0.0
 */
@Component
@Mapper
public interface UserMapper {
    List<User> list();

     void add(User user);

    void delete(Integer id);

    User get(Integer id);

    void update(User user);

    int getCount();

    User getbyname(String user);
}

 
