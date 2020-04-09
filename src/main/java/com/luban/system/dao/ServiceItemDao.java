package com.luban.system.dao;

import com.luban.system.domain.ServiceItemDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 维修项目（小类目）
 * @author chenyang
 * @email 1992lcg@163.com
 * @date 2020-04-09 23:31:42
 */
@Mapper
public interface ServiceItemDao {

	ServiceItemDO get(String id);
	
	List<ServiceItemDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(ServiceItemDO serviceItem);
	
	int update(ServiceItemDO serviceItem);
	
	int remove(String id);
	
	int batchRemove(String[] ids);
}
