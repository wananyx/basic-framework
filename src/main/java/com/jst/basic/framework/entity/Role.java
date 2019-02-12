package com.jst.basic.framework.entity;

import javax.persistence.*;

import com.jst.basic.framework.common.vo.BasePojo;
import lombok.Data;

import java.util.Date;

/**
 * @Description  
 * @Author  Hunter
 * @Date 2019-02-12 
 */

@Data
@Entity
@Table ( name ="sys_role" )
public class Role extends BasePojo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   	@Column(name = "id" )
	private Long id;

	/**
	 * 角色名
	 */
   	@Column(name = "role_name" )
	private String roleName;

   	@Column(name = "create_time" )
	private Date createTime;

   	@Column(name = "update_time" )
	private Date updateTime;

	/**
	 * 是否有效  1有效  2无效
	 */
   	@Column(name = "delete_status" )
	private String deleteStatus;

}
