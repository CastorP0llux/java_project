package org.sara.service;

import org.sara.domain.UserVO;

public interface UserService {
	public void reg(UserVO users) throws Exception;
	
	public int emailCheck(String email) throws Exception;
}