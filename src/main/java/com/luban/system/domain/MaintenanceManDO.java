package com.luban.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 维修工
 * 
 * @author chenyang
 * @email 1992lcg@163.com
 * @date 2020-04-09 23:31:42
 */
public class MaintenanceManDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//编号
	private String id;
	//修理厂编号
	private String fkShopId;
	//姓名
	private String realname;
	//工龄
	private Integer workyear;
	//专业(钣金/喷漆/维修)
	private String speciality;
	//状态 0 离职  1 在职  2 请假
	private String status;
	//
	private Date createOn;
	//
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
	 * 设置：修理厂编号
	 */
	public void setFkShopId(String fkShopId) {
		this.fkShopId = fkShopId;
	}
	/**
	 * 获取：修理厂编号
	 */
	public String getFkShopId() {
		return fkShopId;
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
	 * 设置：工龄
	 */
	public void setWorkyear(Integer workyear) {
		this.workyear = workyear;
	}
	/**
	 * 获取：工龄
	 */
	public Integer getWorkyear() {
		return workyear;
	}
	/**
	 * 设置：专业(钣金/喷漆/维修)
	 */
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	/**
	 * 获取：专业(钣金/喷漆/维修)
	 */
	public String getSpeciality() {
		return speciality;
	}
	/**
	 * 设置：状态 0 离职  1 在职  2 请假
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * 获取：状态 0 离职  1 在职  2 请假
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * 设置：
	 */
	public void setCreateOn(Date createOn) {
		this.createOn = createOn;
	}
	/**
	 * 获取：
	 */
	public Date getCreateOn() {
		return createOn;
	}
	/**
	 * 设置：
	 */
	public void setUpdateOn(Date updateOn) {
		this.updateOn = updateOn;
	}
	/**
	 * 获取：
	 */
	public Date getUpdateOn() {
		return updateOn;
	}
}
