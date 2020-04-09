package com.luban.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.luban.system.dao.StationUserDao;
import com.luban.system.domain.StationUserDO;
import com.luban.system.service.StationUserService;



@Service
public class StationUserServiceImpl implements StationUserService {
	@Autowired
	private StationUserDao stationUserDao;
	
	@Override
	public StationUserDO get(String id){
		return stationUserDao.get(id);
	}
	
	@Override
	public List<StationUserDO> list(Map<String, Object> map){
		return stationUserDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return stationUserDao.count(map);
	}
	
	@Override
	public int save(StationUserDO stationUser){
		return stationUserDao.save(stationUser);
	}
	
	@Override
	public int update(StationUserDO stationUser){
		return stationUserDao.update(stationUser);
	}
	
	@Override
	public int remove(String id){
		return stationUserDao.remove(id);
	}
	
	@Override
	public int batchRemove(String[] ids){
		return stationUserDao.batchRemove(ids);
	}
	
}
