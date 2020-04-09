package com.luban.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 修理厂商户信息
 * 
 * @author chenyang
 * @email 1992lcg@163.com
 * @date 2020-04-09 23:31:41
 */
public class RepairShopDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//编号
	private String id;
	//修理厂名称
	private String shopName;
	//修理厂正面照片
	private String picPath;
	//联系人
	private String contactPerson;
	//联系电话
	private String phoneno;
	//登录密码
	private String loginpwd;
	//地址
	private String address;
	//城市编码
	private String cityCode;
	//区县编码
	private String areaCode;
	//简介
	private String introduction;
	//开通日期
	private Date openDate;
	//业务员
	private String bizPerson;
	//经度
	private Float longitude;
	//纬度
	private Float latitude;
	//创建人
	private String createBy;
	//创建时间
	private Date createOn;
	//更新时间
	private Date updateOn;
	//更新人
	private String updateBy;

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
	 * 设置：修理厂名称
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	/**
	 * 获取：修理厂名称
	 */
	public String getShopName() {
		return shopName;
	}
	/**
	 * 设置：修理厂正面照片
	 */
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}
	/**
	 * 获取：修理厂正面照片
	 */
	public String getPicPath() {
		return picPath;
	}
	/**
	 * 设置：联系人
	 */
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	/**
	 * 获取：联系人
	 */
	public String getContactPerson() {
		return contactPerson;
	}
	/**
	 * 设置：联系电话
	 */
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	/**
	 * 获取：联系电话
	 */
	public String getPhoneno() {
		return phoneno;
	}
	/**
	 * 设置：登录密码
	 */
	public void setLoginpwd(String loginpwd) {
		this.loginpwd = loginpwd;
	}
	/**
	 * 获取：登录密码
	 */
	public String getLoginpwd() {
		return loginpwd;
	}
	/**
	 * 设置：地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取：地址
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 设置：城市编码
	 */
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	/**
	 * 获取：城市编码
	 */
	public String getCityCode() {
		return cityCode;
	}
	/**
	 * 设置：区县编码
	 */
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	/**
	 * 获取：区县编码
	 */
	public String getAreaCode() {
		return areaCode;
	}
	/**
	 * 设置：简介
	 */
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	/**
	 * 获取：简介
	 */
	public String getIntroduction() {
		return introduction;
	}
	/**
	 * 设置：开通日期
	 */
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	/**
	 * 获取：开通日期
	 */
	public Date getOpenDate() {
		return openDate;
	}
	/**
	 * 设置：业务员
	 */
	public void setBizPerson(String bizPerson) {
		this.bizPerson = bizPerson;
	}
	/**
	 * 获取：业务员
	 */
	public String getBizPerson() {
		return bizPerson;
	}
	/**
	 * 设置：经度
	 */
	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}
	/**
	 * 获取：经度
	 */
	public Float getLongitude() {
		return longitude;
	}
	/**
	 * 设置：纬度
	 */
	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}
	/**
	 * 获取：纬度
	 */
	public Float getLatitude() {
		return latitude;
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
}
