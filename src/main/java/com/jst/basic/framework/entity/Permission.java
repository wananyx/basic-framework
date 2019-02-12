package com.jst.basic.framework.entity;

import javax.persistence.*;

import com.jst.basic.framework.common.vo.BasePojo;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description  
 * @Author  Hunter
 * @Date 2019-02-12 
 */

@Data
@Entity
@Table ( name ="sys_permission" )
public class Permission  extends BasePojo {

	/**
	 * 自定id,主要供前端展示权限列表分类排序使用.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   	@Column(name = "id" )
	private Long id;

	/**
	 * 归属菜单,前端判断并展示菜单使用,
	 */
   	@Column(name = "menu_code" )
	private String menuCode;

	/**
	 * 菜单的中文释义
	 */
   	@Column(name = "menu_name" )
	private String menuName;

	/**
	 * 权限的代码/通配符,对应代码中@RequiresPermissions 的value
	 */
   	@Column(name = "permission_code" )
	private String permissionCode;

	/**
	 * 本权限的中文释义
	 */
   	@Column(name = "permission_name" )
	private String permissionName;

	/**
	 * 是否本菜单必选权限, 1.必选 2非必选 通常是"列表"权限是必选
	 */
   	@Column(name = "required_permission" )
	private Integer requiredPermission;

}
