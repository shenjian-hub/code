package com.luban.system.service;

import com.luban.system.domain.StationDO;

import java.util.List;
import java.util.Map;

/**
 * 机动车检测站
 * 
 * @author chenyang
 * @email 1992lcg@163.com
 * @date 2020-04-09 23:31:41
 */
public interface StationService {
	
	StationDO get(String id);
	
	List<StationDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(StationDO station);
	
	int update(StationDO station);
	
	int remove(String id);
	
	int batchRemove(String[] ids);
}
