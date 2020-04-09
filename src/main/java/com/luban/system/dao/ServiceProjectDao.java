package com.luban.system.dao;

import com.luban.system.domain.ServiceProjectDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 维修项目
 * @author chenyang
 * @email 1992lcg@163.com
 * @date 2020-04-09 23:31:42
 */
@Mapper
public interface ServiceProjectDao {

	ServiceProjectDO get(String id);
	
	List<ServiceProjectDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(ServiceProjectDO serviceProject);
	
	int update(ServiceProjectDO serviceProject);
	
	int remove(String id);
	
	int batchRemove(String[] ids);
}
