package com.jst.basic.framework.entity;

import javax.persistence.*;

import com.jst.basic.framework.common.vo.BasePojo;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @Description  
 * @Author  Hunter
 * @Date 2019-02-12 
 */

@Data
@Entity
@Table ( name ="sys_menu" )
public class Menu  extends BasePojo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   	@Column(name = "menu_id" )
	private Long menuId;

	/**
	 * 父菜单ID，一级菜单为0
	 */
   	@Column(name = "parent_id" )
	private Long parentId;

	/**
	 * 菜单名称
	 */
   	@Column(name = "name" )
	private String name;

	/**
	 * 菜单URL
	 */
   	@Column(name = "url" )
	private String url;

	/**
	 * 授权(多个用逗号分隔，如：user:list,user:create)
	 */
   	@Column(name = "perms" )
	private String perms;

	/**
	 * 类型   0：目录   1：菜单   2：按钮
	 */
   	@Column(name = "type" )
	private Long type;

	/**
	 * 菜单图标
	 */
   	@Column(name = "icon" )
	private String icon;

	/**
	 * 排序
	 */
   	@Column(name = "order_num" )
	private Long orderNum;

	/**
	 * 创建时间
	 */
   	@Column(name = "gmt_create" )
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
   	@Column(name = "gmt_modified" )
	private Date gmtModified;

}
