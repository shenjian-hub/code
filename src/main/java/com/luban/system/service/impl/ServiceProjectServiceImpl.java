package com.luban.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.luban.system.dao.ServiceProjectDao;
import com.luban.system.domain.ServiceProjectDO;
import com.luban.system.service.ServiceProjectService;



@Service
public class ServiceProjectServiceImpl implements ServiceProjectService {
	@Autowired
	private ServiceProjectDao serviceProjectDao;
	
	@Override
	public ServiceProjectDO get(String id){
		return serviceProjectDao.get(id);
	}
	
	@Override
	public List<ServiceProjectDO> list(Map<String, Object> map){
		return serviceProjectDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return serviceProjectDao.count(map);
	}
	
	@Override
	public int save(ServiceProjectDO serviceProject){
		return serviceProjectDao.save(serviceProject);
	}
	
	@Override
	public int update(ServiceProjectDO serviceProject){
		return serviceProjectDao.update(serviceProject);
	}
	
	@Override
	public int remove(String id){
		return serviceProjectDao.remove(id);
	}
	
	@Override
	public int batchRemove(String[] ids){
		return serviceProjectDao.batchRemove(ids);
	}
	
}
