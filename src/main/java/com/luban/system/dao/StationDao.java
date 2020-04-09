package com.luban.system.dao;

import com.luban.system.domain.StationDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 机动车检测站
 * @author chenyang
 * @email 1992lcg@163.com
 * @date 2020-04-09 23:31:41
 */
@Mapper
public interface StationDao {

	StationDO get(String id);
	
	List<StationDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(StationDO station);
	
	int update(StationDO station);
	
	int remove(String ID);
	
	int batchRemove(String[] ids);
}
