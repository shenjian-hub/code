package com.luban.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 维修项目（小类目）
 * 
 * @author chenyang
 * @email 1992lcg@163.com
 * @date 2020-04-09 23:31:42
 */
public class ServiceItemDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//编号
	private String id;
	//修理厂编号
	private String fkShopId;
	//服务项目编号
	private String fkProjectId;
	//服务项目名称
	private String itemName;
	//服务项目价格
	private Float itemPrice;
	//是否需要自定义价格 0 否 1 是
	private Integer diyPrice;

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
	 * 设置：服务项目编号
	 */
	public void setFkProjectId(String fkProjectId) {
		this.fkProjectId = fkProjectId;
	}
	/**
	 * 获取：服务项目编号
	 */
	public String getFkProjectId() {
		return fkProjectId;
	}
	/**
	 * 设置：服务项目名称
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * 获取：服务项目名称
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * 设置：服务项目价格
	 */
	public void setItemPrice(Float itemPrice) {
		this.itemPrice = itemPrice;
	}
	/**
	 * 获取：服务项目价格
	 */
	public Float getItemPrice() {
		return itemPrice;
	}
	/**
	 * 设置：是否需要自定义价格 0 否 1 是
	 */
	public void setDiyPrice(Integer diyPrice) {
		this.diyPrice = diyPrice;
	}
	/**
	 * 获取：是否需要自定义价格 0 否 1 是
	 */
	public Integer getDiyPrice() {
		return diyPrice;
	}
}
