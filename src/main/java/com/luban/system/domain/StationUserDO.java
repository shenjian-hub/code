package com.luban.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 检测站用户
 * 
 * @author chenyang
 * @email 1992lcg@163.com
 * @date 2020-04-09 23:31:41
 */
public class StationUserDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//编号
	private String id;
	//外键监测站ID
	private String fkStationId;
	//工号
	private String emono;
	//手机号(工号和手机号都可以作为登录账号)
	private String phoneno;
	//姓名
	private String realname;
	//头像
	private String headIcon;
	//密码
	private String pwdcode;
	//用户类型 1 财务  2  引车员  3 站外司机
	private Integer userType;
	//创建时间
	private Date createOn;
	//创建人
	private String createBy;
	//更新人
	private String updateBy;
	//更新时间
	private Date updateOn;

	/**
	 * 设置：编号
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取：编号
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置：外键监测站ID
	 */
	public void setFkStationId(String fkStationId) {
		this.fkStationId = fkStationId;
	}
	/**
	 * 获取：外键监测站ID
	 */
	public String getFkStationId() {
		return fkStationId;
	}
	/**
	 * 设置：工号
	 */
	public void setEmono(String emono) {
		this.emono = emono;
	}
	/**
	 * 获取：工号
	 */
	public String getEmono() {
		return emono;
	}
	/**
	 * 设置：手机号(工号和手机号都可以作为登录账号)
	 */
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	/**
	 * 获取：手机号(工号和手机号都可以作为登录账号)
	 */
	public String getPhoneno() {
		return phoneno;
	}
	/**
	 * 设置：姓名
	 */
	public void setRealname(String realname) {
		this.realname = realname;
	}
	/**
	 * 获取：姓名
	 */
	public String getRealname() {
		return realname;
	}
	/**
	 * 设置：头像
	 */
	public void setHeadIcon(String headIcon) {
		this.headIcon = headIcon;
	}
	/**
	 * 获取：头像
	 */
	public String getHeadIcon() {
		return headIcon;
	}
	/**
	 * 设置：密码
	 */
	public void setPwdcode(String pwdcode) {
		this.pwdcode = pwdcode;
	}
	/**
	 * 获取：密码
	 */
	public String getPwdcode() {
		return pwdcode;
	}
	/**
	 * 设置：用户类型 1 财务  2  引车员  3 站外司机
	 */
	public void setUserType(Integer userType) {
		this.userType = userType;
	}
	/**
	 * 获取：用户类型 1 财务  2  引车员  3 站外司机
	 */
	public Integer getUserType() {
		return userType;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateOn(Date createOn) {
		this.createOn = createOn;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateOn() {
		return createOn;
	}
	/**
	 * 设置：创建人
	 */
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	/**
	 * 获取：创建人
	 */
	public String getCreateBy() {
		return createBy;
	}
	/**
	 * 设置：更新人
	 */
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	/**
	 * 获取：更新人
	 */
	public String getUpdateBy() {
		return updateBy;
	}
	/**
	 * 设置：更新时间
	 */
	public void setUpdateOn(Date updateOn) {
		this.updateOn = updateOn;
	}
	/**
	 * 获取：更新时间
	 */
	public Date getUpdateOn() {
		return updateOn;
	}
}
