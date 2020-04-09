package com.luban.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.luban.system.dao.CheckOrderDao;
import com.luban.system.domain.CheckOrderDO;
import com.luban.system.service.CheckOrderService;



@Service
public class CheckOrderServiceImpl implements CheckOrderService {
	@Autowired
	private CheckOrderDao checkOrderDao;
	
	@Override
	public CheckOrderDO get(String id){
		return checkOrderDao.get(id);
	}
	
	@Override
	public List<CheckOrderDO> list(Map<String, Object> map){
		return checkOrderDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return checkOrderDao.count(map);
	}
	
	@Override
	public int save(CheckOrderDO checkOrder){
		return checkOrderDao.save(checkOrder);
	}
	
	@Override
	public int update(CheckOrderDO checkOrder){
		return checkOrderDao.update(checkOrder);
	}
	
	@Override
	public int remove(String id){
		return checkOrderDao.remove(id);
	}
	
	@Override
	public int batchRemove(String[] ids){
		return checkOrderDao.batchRemove(ids);
	}
	
}
