/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: SysLogServiceImpl
 * Author:   tjqwecom
 * Date:     2020-11-11 17:45
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.system.Impl;

import com.example.system.mapper.Sys_logMapper;
import com.example.system.pojo.Sys_log;
import com.example.system.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author tjqwecom
 * @create 2020-11-11
 * @since 1.0.0
 */
@Service
public class SysLogServiceImpl implements SysLogService {
    @Autowired
    private Sys_logMapper sys_logMapper;
    @Override
    public void save(Sys_log sysLog) {
        sys_logMapper.insert(sysLog);
    }
}

 
