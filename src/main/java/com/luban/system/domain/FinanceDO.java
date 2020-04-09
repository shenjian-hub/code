package com.luban.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 财务明细
 * 
 * @author chenyang
 * @email 1992lcg@163.com
 * @date 2020-04-09 23:31:42
 */
public class FinanceDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//编号
	private String id;
	//修理厂编号
	private String fkShopId;
	//收支标识 0 支出 1 收入
	private Integer finFlag;
	//金额
	private Float amount;
	//财务类型(直接存储中文)
	private String finType;
	//记录日期
	private Date logDate;
	//备注
	private String remarks;
	//创建人
	private String createBy;
	//create_on
	private Date createOn;
	//
	private String updateBy;
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
	 * 设置：收支标识 0 支出 1 收入
	 */
	public void setFinFlag(Integer finFlag) {
		this.finFlag = finFlag;
	}
	/**
	 * 获取：收支标识 0 支出 1 收入
	 */
	public Integer getFinFlag() {
		return finFlag;
	}
	/**
	 * 设置：金额
	 */
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	/**
	 * 获取：金额
	 */
	public Float getAmount() {
		return amount;
	}
	/**
	 * 设置：财务类型(直接存储中文)
	 */
	public void setFinType(String finType) {
		this.finType = finType;
	}
	/**
	 * 获取：财务类型(直接存储中文)
	 */
	public String getFinType() {
		return finType;
	}
	/**
	 * 设置：记录日期
	 */
	public void setLogDate(Date logDate) {
		this.logDate = logDate;
	}
	/**
	 * 获取：记录日期
	 */
	public Date getLogDate() {
		return logDate;
	}
	/**
	 * 设置：备注
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	/**
	 * 获取：备注
	 */
	public String getRemarks() {
		return remarks;
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
	 * 设置：create_on
	 */
	public void setCreateOn(Date createOn) {
		this.createOn = createOn;
	}
	/**
	 * 获取：create_on
	 */
	public Date getCreateOn() {
		return createOn;
	}
	/**
	 * 设置：
	 */
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	/**
	 * 获取：
	 */
	public String getUpdateBy() {
		return updateBy;
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
