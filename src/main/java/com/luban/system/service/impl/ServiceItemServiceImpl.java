package com.luban.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.luban.system.dao.ServiceItemDao;
import com.luban.system.domain.ServiceItemDO;
import com.luban.system.service.ServiceItemService;



@Service
public class ServiceItemServiceImpl implements ServiceItemService {
	@Autowired
	private ServiceItemDao serviceItemDao;
	
	@Override
	public ServiceItemDO get(String id){
		return serviceItemDao.get(id);
	}
	
	@Override
	public List<ServiceItemDO> list(Map<String, Object> map){
		return serviceItemDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return serviceItemDao.count(map);
	}
	
	@Override
	public int save(ServiceItemDO serviceItem){
		return serviceItemDao.save(serviceItem);
	}
	
	@Override
	public int update(ServiceItemDO serviceItem){
		return serviceItemDao.update(serviceItem);
	}
	
	@Override
	public int remove(String id){
		return serviceItemDao.remove(id);
	}
	
	@Override
	public int batchRemove(String[] ids){
		return serviceItemDao.batchRemove(ids);
	}
	
}
