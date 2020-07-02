package com.mo.yun.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mo.yun.pojo.User;
import com.mo.yun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/moyun")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/userList")
    public IPage<User> queryPageUserList(Page<User> page){
        return userService.selectPageVo(page,null);
    }
 }
