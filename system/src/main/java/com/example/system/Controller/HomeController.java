/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: HomeController
 * Author:   tjqwecom
 * Date:     2020-10-28 19:48
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.system.Controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author tjqwecom
 * @create 2020-10-28
 * @since 1.0.0
 */
@Controller
public class HomeController {
    @RequestMapping(value="/")
    public String Homepage() {
        return "login";
    }

}
