package com.luban.system.service;

import com.luban.system.domain.StationShopDO;

import java.util.List;
import java.util.Map;

/**
 * 商户预约检测站关联
 * 
 * @author chenyang
 * @email 1992lcg@163.com
 * @date 2020-04-09 23:31:41
 */
public interface StationShopService {
	
	StationShopDO get(String fkShopId);
	
	List<StationShopDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(StationShopDO stationShop);
	
	int update(StationShopDO stationShop);
	
	int remove(String fkShopId);
	
	int batchRemove(String[] fkShopIds);
}
