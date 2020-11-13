package com.example.system.service;

import com.example.system.pojo.Sys_log;
import org.springframework.stereotype.Component;

public interface SysLogService {
    void save(Sys_log sysLog);
}
