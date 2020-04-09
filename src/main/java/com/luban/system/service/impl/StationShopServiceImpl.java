package com.luban.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.luban.system.dao.StationShopDao;
import com.luban.system.domain.StationShopDO;
import com.luban.system.service.StationShopService;



@Service
public class StationShopServiceImpl implements StationShopService {
	@Autowired
	private StationShopDao stationShopDao;
	
	@Override
	public StationShopDO get(String fkShopId){
		return stationShopDao.get(fkShopId);
	}
	
	@Override
	public List<StationShopDO> list(Map<String, Object> map){
		return stationShopDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return stationShopDao.count(map);
	}
	
	@Override
	public int save(StationShopDO stationShop){
		return stationShopDao.save(stationShop);
	}
	
	@Override
	public int update(StationShopDO stationShop){
		return stationShopDao.update(stationShop);
	}
	
	@Override
	public int remove(String fkShopId){
		return stationShopDao.remove(fkShopId);
	}
	
	@Override
	public int batchRemove(String[] fkShopIds){
		return stationShopDao.batchRemove(fkShopIds);
	}
	
}
