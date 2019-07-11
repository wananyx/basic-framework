package com.jst.controller;


import com.jst.common.vo.Result;
import com.jst.entity.SysUser;
import com.jst.service.ISysUserService;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author jst
 * @since 2019-04-30
 */
@RestController
@RequestMapping("/user")
public class SysUserController {

    @Autowired
    private ISysUserService userService;

//    /**
//     * 获取当前登陆用户
//     * @return
//     */
//    @ApiOperation(value = "获取当前登陆用户",notes = "获取当前登陆用户",httpMethod = "GET",response = LoginUser.class)
//    @GetMapping("/current")
//    public LoginUser getLoginUser(){
//        return SecurityUtils.getLoginUser();
//    }
//
//    /**
//     * 注册用户
//     * @param user User实体类
//     * @return
//     */
//    @ApiOperation(value = "注册新用户",notes = "注册新用户")
//    @ApiImplicitParam(name = "user", value = "User实体类",required = true, dataType = "User")
//    @PostMapping("/register")
//    public Result register(UserDO user){
//        try {
//            userServie.register(user);
//            return Result.ok("注册成功");
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return Result.error(400,"参数错误");
//    }
//
//    /**
//     * 查询所有用户列表
//     * @return
//     */
//    @ApiOperation(value = "查询所有用户列表",notes = "查询所有用户列表")
//    @GetMapping("/listUser")
//    public Result listUser(){
//        if(1>0) {
//            throw new JException(400,"111");
//        }
//        List<UserDO> users = userServie.listUser();
//        return Result.ok("listUser", users);
//    }

//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;
//
//    @Override
//    public void register(UserDO user) {
//        user.setId(null);
//        user.setCreated(new Date());
//        if(user.getNickname()==null){
//            throw new IllegalArgumentException("参数错误");
//        }
//        //设置加密密码
//        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
//
//        int insert = userMapper.insert(user);
//        //如果插入数量不为1则证明新增失败
//        if (insert != 1) {
//            throw new RuntimeException("新增失败");
//        }
//    }

    @GetMapping("/anon/findUsername")
    public SysUser findUsername(String username){
        SysUser user = userService.findUsername(username);
        return user;
    }


}
