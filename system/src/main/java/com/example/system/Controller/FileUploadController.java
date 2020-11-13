/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: FileUploadController
 * Author:   tjqwecom
 * Date:     2020-10-21 19:22
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.system.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author tjqwecom
 * @create 2020-10-21
 * @since 1.0.0
 */
@Controller
public class FileUploadController {
    //线程并发问题的来源：多个线程同时修改内存中的同一份数据。

    // 返回一个文件上传页面
    @RequestMapping("/uploadUI")
    public String uoloadUI(){
        return "uploadUI";
    }

    // 处理文件上传请求
    // 当文件上传请求到达springmvc时，springmvc会使用multipartResolver解析文件上传请求
    // springmvc会提取出请求中的参数以及多个文件
    // 针对每个文件，都会创建一个MultipartFile的一个对象，将这些对象放入一个List中
    @RequestMapping("/upload")
    public String upload(HttpServletRequest req, String username, List<MultipartFile> files) throws IOException {
        String realPath=req.getSession().getServletContext().getRealPath("/uploadFile");
        File file=new File(realPath+"dd");
        if(!file.isDirectory()){
            file.mkdirs();
        }
        System.out.println("realPath:"+realPath);
        System.out.println("username:"+username);
        for(MultipartFile multipartFile:files){
            System.out.println("-------------");
            System.out.println("文件名:"+multipartFile.getOriginalFilename());
            System.out.println("文件大小:"+multipartFile.getSize());
            //将文件从临时文件夹转移到目标文件夹
            multipartFile.transferTo(new File(file,multipartFile.getOriginalFilename()));

            System.out.println("--------------------");
        }
        return "/uploadUI";
    }
}
