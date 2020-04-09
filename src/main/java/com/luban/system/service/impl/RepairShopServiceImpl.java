package com.luban.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.luban.system.dao.RepairShopDao;
import com.luban.system.domain.RepairShopDO;
import com.luban.system.service.RepairShopService;



@Service
public class RepairShopServiceImpl implements RepairShopService {
	@Autowired
	private RepairShopDao repairShopDao;
	
	@Override
	public RepairShopDO get(String id){
		return repairShopDao.get(id);
	}
	
	@Override
	public List<RepairShopDO> list(Map<String, Object> map){
		return repairShopDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return repairShopDao.count(map);
	}
	
	@Override
	public int save(RepairShopDO repairShop){
		return repairShopDao.save(repairShop);
	}
	
	@Override
	public int update(RepairShopDO repairShop){
		return repairShopDao.update(repairShop);
	}
	
	@Override
	public int remove(String id){
		return repairShopDao.remove(id);
	}
	
	@Override
	public int batchRemove(String[] ids){
		return repairShopDao.batchRemove(ids);
	}
	
}
