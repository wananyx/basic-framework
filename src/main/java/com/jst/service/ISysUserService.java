package com.jst.service;

import com.jst.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author jst
 * @since 2019-04-30
 */
public interface ISysUserService extends IService<SysUser> {

    SysUser findUsername(String username);
}
