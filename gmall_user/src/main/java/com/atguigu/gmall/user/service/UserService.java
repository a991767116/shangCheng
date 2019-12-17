package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.mapper.UserMapper;

import java.util.List;

public interface UserService {

//    查询全部用户
    List<UmsMember> getAllUser();

//    添加用户姓名
    int addUser(String userName);

//    根据id删除用户
    int delete(String userId);

//    根据id查询收获地址
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String membeId);


}


