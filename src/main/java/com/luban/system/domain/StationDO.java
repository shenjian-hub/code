package com.luban.system.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;



/**
 * 机动车检测站
 * 
 * @author chenyang
 * @email 1992lcg@163.com
 * @date 2020-04-09 23:31:41
 */
public class StationDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//编号
	private String id;
	//检测站全称
	private String fullName;
	//检测站简称
	private String shortName;
	//城市编码
	private String cityCode;
	//所属区域(区县一级)
	private String areaCode;
	//详细地址
	private String address;
	//联系电话
	private String tel;
	//手机号码
	private String phoneno;
	//经度
	private BigDecimal longitude;
	//纬度
	private BigDecimal latitude;
	//Logo路径
	private String logopath;
	//状态 1 正常   -1 未开通 
	private Integer status;
	//小车协议结算价格
	private Float carSettlePrice;
	//小车市场价
	private Float carMarketPrice;
	//小车七座价格
	private Float sevenCarPrice;
	//到期时间
	private Date expireTime;
	//创建人
	private String createBy;
	//创建时间
	private Date createOn;
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
	 * 设置：检测站全称
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	/**
	 * 获取：检测站全称
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * 设置：检测站简称
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	/**
	 * 获取：检测站简称
	 */
	public String getShortName() {
		return shortName;
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
	 * 设置：所属区域(区县一级)
	 */
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	/**
	 * 获取：所属区域(区县一级)
	 */
	public String getAreaCode() {
		return areaCode;
	}
	/**
	 * 设置：详细地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取：详细地址
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 设置：联系电话
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}
	/**
	 * 获取：联系电话
	 */
	public String getTel() {
		return tel;
	}
	/**
	 * 设置：手机号码
	 */
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	/**
	 * 获取：手机号码
	 */
	public String getPhoneno() {
		return phoneno;
	}
	/**
	 * 设置：经度
	 */
	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}
	/**
	 * 获取：经度
	 */
	public BigDecimal getLongitude() {
		return longitude;
	}
	/**
	 * 设置：纬度
	 */
	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}
	/**
	 * 获取：纬度
	 */
	public BigDecimal getLatitude() {
		return latitude;
	}
	/**
	 * 设置：Logo路径
	 */
	public void setLogopath(String logopath) {
		this.logopath = logopath;
	}
	/**
	 * 获取：Logo路径
	 */
	public String getLogopath() {
		return logopath;
	}
	/**
	 * 设置：状态 1 正常   -1 未开通 
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态 1 正常   -1 未开通 
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：小车协议结算价格
	 */
	public void setCarSettlePrice(Float carSettlePrice) {
		this.carSettlePrice = carSettlePrice;
	}
	/**
	 * 获取：小车协议结算价格
	 */
	public Float getCarSettlePrice() {
		return carSettlePrice;
	}
	/**
	 * 设置：小车市场价
	 */
	public void setCarMarketPrice(Float carMarketPrice) {
		this.carMarketPrice = carMarketPrice;
	}
	/**
	 * 获取：小车市场价
	 */
	public Float getCarMarketPrice() {
		return carMarketPrice;
	}
	/**
	 * 设置：小车七座价格
	 */
	public void setSevenCarPrice(Float sevenCarPrice) {
		this.sevenCarPrice = sevenCarPrice;
	}
	/**
	 * 获取：小车七座价格
	 */
	public Float getSevenCarPrice() {
		return sevenCarPrice;
	}
	/**
	 * 设置：到期时间
	 */
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}
	/**
	 * 获取：到期时间
	 */
	public Date getExpireTime() {
		return expireTime;
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
