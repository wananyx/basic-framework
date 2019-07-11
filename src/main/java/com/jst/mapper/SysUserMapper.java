package com.jst.mapper;

import com.jst.entity.SysRole;
import com.jst.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.Set;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author jst
 * @since 2019-04-30
 */
public interface SysUserMapper extends BaseMapper<SysUser> {

    Set<SysRole> findRolesByUserId(Long userId);
}
