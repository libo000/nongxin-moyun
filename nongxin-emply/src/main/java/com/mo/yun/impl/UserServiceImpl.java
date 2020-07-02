package com.mo.yun.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mo.yun.mapper.UserMapper;
import com.mo.yun.pojo.User;
import com.mo.yun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
@Autowired
    UserMapper userMapper;
    @Override
    public List<User> getById(List list) {
        List<User> users = userMapper.selectBatchIds(list);
        return users;
    }

    @Override
    public IPage<User> selectPageVo(Page page, QueryWrapper queryWrapper) {
        return userMapper.selectPageVo(page,queryWrapper);
    }

}
