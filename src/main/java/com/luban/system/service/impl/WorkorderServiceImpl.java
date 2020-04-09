package com.luban.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.luban.system.dao.WorkorderDao;
import com.luban.system.domain.WorkorderDO;
import com.luban.system.service.WorkorderService;



@Service
public class WorkorderServiceImpl implements WorkorderService {
	@Autowired
	private WorkorderDao workorderDao;
	
	@Override
	public WorkorderDO get(String id){
		return workorderDao.get(id);
	}
	
	@Override
	public List<WorkorderDO> list(Map<String, Object> map){
		return workorderDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return workorderDao.count(map);
	}
	
	@Override
	public int save(WorkorderDO workorder){
		return workorderDao.save(workorder);
	}
	
	@Override
	public int update(WorkorderDO workorder){
		return workorderDao.update(workorder);
	}
	
	@Override
	public int remove(String id){
		return workorderDao.remove(id);
	}
	
	@Override
	public int batchRemove(String[] ids){
		return workorderDao.batchRemove(ids);
	}
	
}
