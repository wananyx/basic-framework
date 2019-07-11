package com.jst.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.jst.common.vo.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 后台角色表
 * </p>
 *
 * @author jst
 * @since 2019-04-30
 */
@Data
@Accessors(chain = true)
@TableName(value = "sys_role")
public class SysRole extends BaseEntity {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 角色名英文
     */
    private String code;

    /**
     * 角色名
     */
    private String roleName;

    private Date created;

    private Date updated;


}
