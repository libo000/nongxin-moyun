package com.mo.yun.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mo.yun.pojo.User;

import java.io.Serializable;
import java.util.List;

public interface UserService {
    // 根据 ID 查询
    List<User> getById(List list);

    IPage<User> selectPageVo(Page page, QueryWrapper queryWrapper);
}
