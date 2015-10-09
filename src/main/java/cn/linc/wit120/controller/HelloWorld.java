package cn.linc.wit120.controller;


import cn.linc.wit120.mappers.UserMapper;
import cn.linc.wit120.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Created by leostormrage on 2015/10/6.
 */

@Controller
public class HelloWorld {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/helloworld")
    public String helloWorld(){
        userMapper.save(new User(-1, "tom",new Date(), 12345));
        System.out.println("hello world! ");
        return "success";

    }


}
