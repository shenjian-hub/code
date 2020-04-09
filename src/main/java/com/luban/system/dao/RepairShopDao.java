package com.luban.system.dao;

import com.luban.system.domain.RepairShopDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 修理厂商户信息
 * @author chenyang
 * @email 1992lcg@163.com
 * @date 2020-04-09 23:31:41
 */
@Mapper
public interface RepairShopDao {

	RepairShopDO get(String id);
	
	List<RepairShopDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(RepairShopDO repairShop);
	
	int update(RepairShopDO repairShop);
	
	int remove(String id);
	
	int batchRemove(String[] ids);
}
