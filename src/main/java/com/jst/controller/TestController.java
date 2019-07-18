package com.jst.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.jst.common.utils.RedisUtils;
import com.jst.entity.SysUser;
import com.jst.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private RedisTemplate<String,Object> template;
    @Autowired
    private ISysUserService userService;

    @GetMapping()
    public R getAll(){
        Object userList = RedisUtils.get("userList");
        if (userList!=null) {
            return R.ok(userList);
        }else {
            List<SysUser> list = userService.list();
            RedisUtils.set("userList",list);
            return R.ok(list);
        }
    }

}
