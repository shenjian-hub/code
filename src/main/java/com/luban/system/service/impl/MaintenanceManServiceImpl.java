package com.luban.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.luban.system.dao.MaintenanceManDao;
import com.luban.system.domain.MaintenanceManDO;
import com.luban.system.service.MaintenanceManService;



@Service
public class MaintenanceManServiceImpl implements MaintenanceManService {
	@Autowired
	private MaintenanceManDao maintenanceManDao;
	
	@Override
	public MaintenanceManDO get(String id){
		return maintenanceManDao.get(id);
	}
	
	@Override
	public List<MaintenanceManDO> list(Map<String, Object> map){
		return maintenanceManDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return maintenanceManDao.count(map);
	}
	
	@Override
	public int save(MaintenanceManDO maintenanceMan){
		return maintenanceManDao.save(maintenanceMan);
	}
	
	@Override
	public int update(MaintenanceManDO maintenanceMan){
		return maintenanceManDao.update(maintenanceMan);
	}
	
	@Override
	public int remove(String id){
		return maintenanceManDao.remove(id);
	}
	
	@Override
	public int batchRemove(String[] ids){
		return maintenanceManDao.batchRemove(ids);
	}
	
}
