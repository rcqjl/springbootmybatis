package com.inspur.mybatisDemo.controller;

        import com.inspur.mybatisDemo.bean.User;
        import com.inspur.mybatisDemo.service.UserService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.ResponseBody;
        import org.springframework.web.bind.annotation.RestController;

        import javax.annotation.Resource;

    /**
     * Created by qujianlong on 2018/10/2.
     */

    @Controller
    @RequestMapping("/testboot")
    public class MybatisDemoController {
        @ResponseBody
        @RequestMapping("getName")
        public String getName(){
            return "rcqjl";
        }

        @Resource
        private UserService userService;

        @ResponseBody
        @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
        public int addUser(User user){
            return userService.addUser(user);
        }

        @ResponseBody
        @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
        public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){

            return userService.findAllUser(pageNum,pageSize);
        }


    }