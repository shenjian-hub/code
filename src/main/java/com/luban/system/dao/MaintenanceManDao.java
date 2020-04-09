package com.luban.system.dao;

import com.luban.system.domain.MaintenanceManDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 维修工
 * @author chenyang
 * @email 1992lcg@163.com
 * @date 2020-04-09 23:31:42
 */
@Mapper
public interface MaintenanceManDao {

	MaintenanceManDO get(String id);
	
	List<MaintenanceManDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(MaintenanceManDO maintenanceMan);
	
	int update(MaintenanceManDO maintenanceMan);
	
	int remove(String id);
	
	int batchRemove(String[] ids);
}
