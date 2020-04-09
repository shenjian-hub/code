package com.luban.system.service;

import com.luban.system.domain.WorkorderDO;

import java.util.List;
import java.util.Map;

/**
 * 修理厂工单
 * 
 * @author chenyang
 * @email 1992lcg@163.com
 * @date 2020-04-09 23:31:42
 */
public interface WorkorderService {
	
	WorkorderDO get(String id);
	
	List<WorkorderDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WorkorderDO workorder);
	
	int update(WorkorderDO workorder);
	
	int remove(String id);
	
	int batchRemove(String[] ids);
}
