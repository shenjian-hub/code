package com.luban.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 修理厂工单
 * 
 * @author chenyang
 * @email 1992lcg@163.com
 * @date 2020-04-09 23:31:42
 */
public class WorkorderDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//编号
	private String id;
	//修理厂编号
	private String fkShopId;
	//工单编号
	private String workNo;
	//车型照片
	private String carPhoto;
	//接车时间
	private Date orderDate;
	//接车人
	private String maintenanceMan;
	//车牌
	private String carno;
	//车主电话
	private String phoneno;
	//维修项目(存储JSON)
	private String repairItem;
	//总价格
	private Float totalPrice;
	//减免价格
	private Float disPrice;
	//实付金额
	private Float amount;
	//状态 1.维护中  2  已完结  -1 已取消
	private Integer status;
	//交车日期
	private Date finishDate;
	//
	private Date createOn;

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
	 * 设置：工单编号
	 */
	public void setWorkNo(String workNo) {
		this.workNo = workNo;
	}
	/**
	 * 获取：工单编号
	 */
	public String getWorkNo() {
		return workNo;
	}
	/**
	 * 设置：车型照片
	 */
	public void setCarPhoto(String carPhoto) {
		this.carPhoto = carPhoto;
	}
	/**
	 * 获取：车型照片
	 */
	public String getCarPhoto() {
		return carPhoto;
	}
	/**
	 * 设置：接车时间
	 */
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	/**
	 * 获取：接车时间
	 */
	public Date getOrderDate() {
		return orderDate;
	}
	/**
	 * 设置：接车人
	 */
	public void setMaintenanceMan(String maintenanceMan) {
		this.maintenanceMan = maintenanceMan;
	}
	/**
	 * 获取：接车人
	 */
	public String getMaintenanceMan() {
		return maintenanceMan;
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
	 * 设置：车主电话
	 */
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	/**
	 * 获取：车主电话
	 */
	public String getPhoneno() {
		return phoneno;
	}
	/**
	 * 设置：维修项目(存储JSON)
	 */
	public void setRepairItem(String repairItem) {
		this.repairItem = repairItem;
	}
	/**
	 * 获取：维修项目(存储JSON)
	 */
	public String getRepairItem() {
		return repairItem;
	}
	/**
	 * 设置：总价格
	 */
	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}
	/**
	 * 获取：总价格
	 */
	public Float getTotalPrice() {
		return totalPrice;
	}
	/**
	 * 设置：减免价格
	 */
	public void setDisPrice(Float disPrice) {
		this.disPrice = disPrice;
	}
	/**
	 * 获取：减免价格
	 */
	public Float getDisPrice() {
		return disPrice;
	}
	/**
	 * 设置：实付金额
	 */
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	/**
	 * 获取：实付金额
	 */
	public Float getAmount() {
		return amount;
	}
	/**
	 * 设置：状态 1.维护中  2  已完结  -1 已取消
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态 1.维护中  2  已完结  -1 已取消
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：交车日期
	 */
	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}
	/**
	 * 获取：交车日期
	 */
	public Date getFinishDate() {
		return finishDate;
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
}
