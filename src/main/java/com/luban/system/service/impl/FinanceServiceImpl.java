package com.luban.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.luban.system.dao.FinanceDao;
import com.luban.system.domain.FinanceDO;
import com.luban.system.service.FinanceService;



@Service
public class FinanceServiceImpl implements FinanceService {
	@Autowired
	private FinanceDao financeDao;
	
	@Override
	public FinanceDO get(String id){
		return financeDao.get(id);
	}
	
	@Override
	public List<FinanceDO> list(Map<String, Object> map){
		return financeDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return financeDao.count(map);
	}
	
	@Override
	public int save(FinanceDO finance){
		return financeDao.save(finance);
	}
	
	@Override
	public int update(FinanceDO finance){
		return financeDao.update(finance);
	}
	
	@Override
	public int remove(String id){
		return financeDao.remove(id);
	}
	
	@Override
	public int batchRemove(String[] ids){
		return financeDao.batchRemove(ids);
	}
	
}
