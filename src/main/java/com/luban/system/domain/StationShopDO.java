package com.luban.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 商户预约检测站关联
 * 
 * @author chenyang
 * @email 1992lcg@163.com
 * @date 2020-04-09 23:31:41
 */
public class StationShopDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//修理厂编号
	private String fkShopId;
	//检测站编号
	private String fkStationId;
	//代驾费用
	private Float driverCost;

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
	 * 设置：检测站编号
	 */
	public void setFkStationId(String fkStationId) {
		this.fkStationId = fkStationId;
	}
	/**
	 * 获取：检测站编号
	 */
	public String getFkStationId() {
		return fkStationId;
	}
	/**
	 * 设置：代驾费用
	 */
	public void setDriverCost(Float driverCost) {
		this.driverCost = driverCost;
	}
	/**
	 * 获取：代驾费用
	 */
	public Float getDriverCost() {
		return driverCost;
	}
}
