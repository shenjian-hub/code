package com.luban.common.service;

import com.luban.common.domain.LogDO;
import com.luban.common.domain.PageDO;
import com.luban.common.utils.Query;
import org.springframework.stereotype.Service;

@Service
public interface LogService {
	void save(LogDO logDO);
	PageDO<LogDO> queryList(Query query);
	int remove(Long id);
	int batchRemove(Long[] ids);
}
