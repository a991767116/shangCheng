package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.mapper.UserMapper;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller

public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMembers=userService.getAllUser();
        return umsMembers;
    }

    @RequestMapping("addUserName")
    @ResponseBody
    public int add(String UserName){
        int i = userService.addUser(UserName);
        return i;
    }

    @RequestMapping("delete")
    @ResponseBody
    public int delete(String UserId){
        int delete=userService.delete(UserId);
        return delete;
    }


    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String membeId){
        List<UmsMemberReceiveAddress> UmsMemberReceiveAddress=userService.getReceiveAddressByMemberId(membeId);
        return UmsMemberReceiveAddress;
    }

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello world";
    }

}
