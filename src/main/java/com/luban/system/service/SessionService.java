package com.luban.system.service;

import java.util.Collection;
import java.util.List;

import com.luban.system.domain.UserDO;
import com.luban.system.domain.UserOnline;
import org.apache.shiro.session.Session;
import org.springframework.stereotype.Service;

@Service
public interface SessionService {
	List<UserOnline> list();

	List<UserDO> listOnlineUser();

	Collection<Session> sessionList();
	
	boolean forceLogout(String sessionId);
}
