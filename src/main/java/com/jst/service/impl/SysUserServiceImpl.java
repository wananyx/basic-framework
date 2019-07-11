package com.jst.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jst.entity.SysRole;
import com.jst.entity.SysUser;
import com.jst.mapper.SysRoleMapper;
import com.jst.mapper.SysUserMapper;
import com.jst.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author jst
 * @since 2019-04-30
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Autowired
    private SysUserMapper userMapper;

    @Autowired
    private SysRoleMapper roleMapper;

    @Override
    public SysUser findUsername(String username) {
        if(StringUtils.isBlank(username)){
            throw new IllegalArgumentException("参数不能为空");
        }
        QueryWrapper<SysUser> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(SysUser::getUsername, username);
        List<SysUser> list = list(wrapper);
        //username唯一，所以list只可能有一个元素
        SysUser user = null;
        if(list.size()>0){
            user = list.get(0);
            //根据用户id查询角色信息
            Set<SysRole> roles = userMapper.findRolesByUserId(user.getId());
            //如果分配了角色，则根据角色id集合查询权限信息
            if(roles.size()>0){
                //获取角色id集合
                Set<Long> roleIds = roles.parallelStream().map(SysRole::getId).collect(Collectors.toSet());
                Set<String> perms = roleMapper.findPermsByRoleIds(roleIds);
                user.setRoles(roles);
                user.setAuthority(perms);
            }
        }
        return user;
    }
}
