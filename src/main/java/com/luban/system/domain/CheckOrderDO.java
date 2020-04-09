package com.luban.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 年检预约订单
 * 
 * @author chenyang
 * @email 1992lcg@163.com
 * @date 2020-04-09 23:31:41
 */
public class CheckOrderDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//编号
	private String id;
	//修理厂编号
	private String fkShopId;
	//检测站编号
	private String fkStationId;
	//车牌
	private String carno;
	//联系电话
	private String phoneno;
	//行驶证正页
	private String driverFrontPath;
	//行驶证副页
	private String driverBackPath;
	//订单价格
	private Float checkPrice;
	//是否代驾 0 否 1 是
	private Integer needdriver;
	//代驾费用
	private Float driverCost;
	//预约日期
	private Date checkDate;
	//支付方式 1 线下收费  2 线上支付 
	private Integer payWay;
	//订单状态-2 已取消 1.待审核(检查违章)  2.审核通过 3.已安排司机   4 已开始检测  -1.车辆异常  10 交车完成
	private Integer orderStatus;
	//司机
	private String fkStationUserDriver;
	//异常报备
	private String exceptionReason;
	//检测员
	private String fkStationUserCheckor;
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
	 * 设置：车牌
	 */
	public void setCarno(String carno) {
		this.carno = carno;
	}
	/**
	 * 获取：车牌
	 */
	public String getCarno() {
		return carno;
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
	 * 设置：行驶证正页
	 */
	public void setDriverFrontPath(String driverFrontPath) {
		this.driverFrontPath = driverFrontPath;
	}
	/**
	 * 获取：行驶证正页
	 */
	public String getDriverFrontPath() {
		return driverFrontPath;
	}
	/**
	 * 设置：行驶证副页
	 */
	public void setDriverBackPath(String driverBackPath) {
		this.driverBackPath = driverBackPath;
	}
	/**
	 * 获取：行驶证副页
	 */
	public String getDriverBackPath() {
		return driverBackPath;
	}
	/**
	 * 设置：订单价格
	 */
	public void setCheckPrice(Float checkPrice) {
		this.checkPrice = checkPrice;
	}
	/**
	 * 获取：订单价格
	 */
	public Float getCheckPrice() {
		return checkPrice;
	}
	/**
	 * 设置：是否代驾 0 否 1 是
	 */
	public void setNeeddriver(Integer needdriver) {
		this.needdriver = needdriver;
	}
	/**
	 * 获取：是否代驾 0 否 1 是
	 */
	public Integer getNeeddriver() {
		return needdriver;
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
	/**
	 * 设置：预约日期
	 */
	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}
	/**
	 * 获取：预约日期
	 */
	public Date getCheckDate() {
		return checkDate;
	}
	/**
	 * 设置：支付方式 1 线下收费  2 线上支付 
	 */
	public void setPayWay(Integer payWay) {
		this.payWay = payWay;
	}
	/**
	 * 获取：支付方式 1 线下收费  2 线上支付 
	 */
	public Integer getPayWay() {
		return payWay;
	}
	/**
	 * 设置：订单状态-2 已取消 1.待审核(检查违章)  2.审核通过 3.已安排司机   4 已开始检测  -1.车辆异常  10 交车完成
	 */
	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}
	/**
	 * 获取：订单状态-2 已取消 1.待审核(检查违章)  2.审核通过 3.已安排司机   4 已开始检测  -1.车辆异常  10 交车完成
	 */
	public Integer getOrderStatus() {
		return orderStatus;
	}
	/**
	 * 设置：司机
	 */
	public void setFkStationUserDriver(String fkStationUserDriver) {
		this.fkStationUserDriver = fkStationUserDriver;
	}
	/**
	 * 获取：司机
	 */
	public String getFkStationUserDriver() {
		return fkStationUserDriver;
	}
	/**
	 * 设置：异常报备
	 */
	public void setExceptionReason(String exceptionReason) {
		this.exceptionReason = exceptionReason;
	}
	/**
	 * 获取：异常报备
	 */
	public String getExceptionReason() {
		return exceptionReason;
	}
	/**
	 * 设置：检测员
	 */
	public void setFkStationUserCheckor(String fkStationUserCheckor) {
		this.fkStationUserCheckor = fkStationUserCheckor;
	}
	/**
	 * 获取：检测员
	 */
	public String getFkStationUserCheckor() {
		return fkStationUserCheckor;
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
