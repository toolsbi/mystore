/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Mylog
 * Author:   tjqwecom
 * Date:     2020-11-11 18:23
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.system.annotation;

import java.lang.annotation.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author tjqwecom
 * @create 2020-11-11
 * @since 1.0.0
 */
    /**
     * 自定义注解类
     */
    @Target(ElementType.METHOD) //注解放置的目标位置,METHOD是可注解在方法级别上
    @Retention(RetentionPolicy.RUNTIME) //注解在哪个阶段执行
    @Documented //生成文档
    public @interface Mylog {
        String value() default "";
    }


