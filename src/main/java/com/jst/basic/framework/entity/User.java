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
@Table ( name ="sys_user" )
public class User  extends BasePojo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   	@Column(name = "id" )
	private Long id;

	/**
	 * 用户名
	 */
   	@Column(name = "username" )
	private String username;

	/**
	 * 密码
	 */
   	@Column(name = "password" )
	private String password;

	/**
	 * 昵称
	 */
   	@Column(name = "nickname" )
	private String nickname;

	/**
	 * 角色ID
	 */
   	@Column(name = "role_id" )
	private Long roleId;

	/**
	 * 创建时间
	 */
   	@Column(name = "create_time" )
	private Date createTime;

	/**
	 * 修改时间
	 */
   	@Column(name = "update_time" )
	private Date updateTime;

	/**
	 * 是否有效  1有效  2无效
	 */
   	@Column(name = "delete_status" )
	private String deleteStatus;

}
