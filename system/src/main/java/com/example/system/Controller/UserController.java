///**
// * Copyright (C), 2015-2020, XXX有限公司
// * FileName: UserController
// * Author:   tjqwecom
// * Date:     2020-10-21 22:26
// * Description:
// * History:
// * <author>          <time>          <version>          <desc>
// * 作者姓名           修改时间           版本号              描述
// */
//package com.example.system.Controller;
//
//import com.example.system.annotation.Mylog;
//import com.example.system.pojo.User_info;
//import com.example.system.service.AdUserService;
//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.authc.*;
//import org.apache.shiro.authz.annotation.RequiresPermissions;
//import org.apache.shiro.subject.Subject;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
///**
// * 〈一句话功能简述〉<br>
// * 〈〉
// *
// * @author tjqwecom
// * @create 2020-10-21
// * @since 1.0.0
// */
//@Controller
//@RequestMapping("/user")
//public class UserController{
////    @Autowired
////    UserService userService;
////
////    @RequestMapping("/list")
////    public String list(Model model){
////       List<User> users =userService.list();
////        model.addAttribute("users",users);
////        return "user/list";
////
////    }
//    @RequiresPermissions("user:view")
//    @RequestMapping("/userPageList")
//    public String showUser() {
//        return "user/useradd";
//    }
//    @RequestMapping("/testThymeleaf")
//    public String test(){
//        return "test";
//    }
//    @RequestMapping("/fail")
//    public String fail(){
//        return "user/fail";
//    }
//    @Mylog (value = "用户登录")  //这里添加了AOP的自定义注解
//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//        public String toLogin(User_info user_info, Model model){
//
//        /*使用shiro编写认证操作*/
//        //1。获取subject
//            Subject subject = SecurityUtils.getSubject();
//            //2.封装用户数据
//        UsernamePasswordToken token = new UsernamePasswordToken(user_info.getUsername(),user_info.getPassword());
//        //3。 执行登录方法
//        try {
//            subject.login(token);
//            model.addAttribute("msg","你已经成功登入");
//
//            return "/test";
//        }catch (UnknownAccountException e){
//            //登录失败：用户名不存在
//            model.addAttribute("msg","用户不存在");
//            return "/test";
//
//        }catch (IncorrectCredentialsException e){
//            model.addAttribute("msg","密码错误");
//            return "/test";
//        } catch (LockedAccountException lae) {
//        return "账户已锁定";
//    } catch (
//    ExcessiveAttemptsException eae) {
//        return "用户名或密码错误次数过多";
//    } catch (AuthenticationException ae) {
//        return "用户名或密码不正确！";
//    }
//        }
//        @Autowired
//    private AdUserService adUserService;
//    @RequestMapping("/addUI")
//    public String addUI(){
//        return "user/useradd";
//    }
//    @RequestMapping("/add")
//    @ResponseBody
//    public String add(String name,String password, Model model){
//            adUserService.addUser(name,password);
//            model.addAttribute("add","添加成功");
//            return "w无了";
//
//        }
////添加
////        @RequestMapping("/insertUser")
////        @ResponseBody
////        public int insertUser(User_info user){
////            //将uuid设置为密码盐值
////            String salt = UUID.randomUUID().toString().replaceAll("-","");
////            SimpleHash simpleHash = new SimpleHash("MD5", user.getPassword(), salt, 1024);
////          //添加用户信息
////            user.setPassword(simpleHash.toHex()).setValid(1).setSalt(salt).setCreateTime(new Date()).setDel(0);
////            return  AdUserMapper.insertSelective(user);
////        }
////
////    @RequestMapping("/addUI")
////    public String addUI(){
////        return "user/add";
////    }
////    @RequestMapping("/add")
////    public String add(User user){
////        userService.add(user);
////        return "redirect:list";
////    }
////    @RequestMapping("/delete")
////    public String delete(Integer id){
////        userService.delete(id);
////        return "redirect:list";
////    }
////    @RequestMapping("/updateUI")
////    public String update(Integer id,Model model){
////        User user=userService.get(id);
////        model.addAttribute("u",user);
////        return "user/update";
////    }
////    @RequestMapping("/update")
////    public String update(User user){
////        userService.update(user);
////        return "redirect:list";
////    }
////    @RequestMapping("/content")
////    public String listUI(){
////        return "user/useragent";
////    }
////
////
////    @RequestMapping("/listData")
////    @ResponseBody
////    public Map<String, Object> listData(){
//////        int start = (page - 1) * limit;//从第几条数据开始查询
////
////        List<User> userList = userService.list();//查询一页的数据
////        int userCount = userService.getCount();//查询总条数
////        Map<String, Object> result = new HashMap<String, Object>();
////        result.put("code", 0);//响应代码
////        result.put("msg", "");//响应消息
////        result.put("count", userCount);//数据总条数
////        result.put("data", userList);
////        return result;
////    }
//
//
//
//}
//
//
//
//
//
