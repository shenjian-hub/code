package com.luban.system.service;

import java.util.List;

import com.luban.system.domain.RoleDO;
import org.springframework.stereotype.Service;

@Service
public interface RoleService {

	RoleDO get(Long id);

	List<RoleDO> list();

	int save(RoleDO role);

	int update(RoleDO role);

	int remove(Long id);

	List<RoleDO> list(Long userId);

	int batchremove(Long[] ids);
}
