package com.luban.system.dao;

import com.luban.system.domain.CheckOrderDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 年检预约订单
 * @author chenyang
 * @email 1992lcg@163.com
 * @date 2020-04-09 23:31:41
 */
@Mapper
public interface CheckOrderDao {

	CheckOrderDO get(String id);
	
	List<CheckOrderDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(CheckOrderDO checkOrder);
	
	int update(CheckOrderDO checkOrder);
	
	int remove(String id);
	
	int batchRemove(String[] ids);
}
