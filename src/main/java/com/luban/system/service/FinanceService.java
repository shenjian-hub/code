package com.luban.system.service;

import com.luban.system.domain.FinanceDO;

import java.util.List;
import java.util.Map;

/**
 * 财务明细
 * 
 * @author chenyang
 * @email 1992lcg@163.com
 * @date 2020-04-09 23:31:42
 */
public interface FinanceService {
	
	FinanceDO get(String id);
	
	List<FinanceDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(FinanceDO finance);
	
	int update(FinanceDO finance);
	
	int remove(String id);
	
	int batchRemove(String[] ids);
}
