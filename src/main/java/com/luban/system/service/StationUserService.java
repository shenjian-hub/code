package com.luban.system.service;

import com.luban.system.domain.StationUserDO;

import java.util.List;
import java.util.Map;

/**
 * 检测站用户
 * 
 * @author chenyang
 * @email 1992lcg@163.com
 * @date 2020-04-09 23:31:41
 */
public interface StationUserService {
	
	StationUserDO get(String id);
	
	List<StationUserDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(StationUserDO stationUser);
	
	int update(StationUserDO stationUser);
	
	int remove(String id);
	
	int batchRemove(String[] ids);
}
