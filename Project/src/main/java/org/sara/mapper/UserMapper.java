package org.sara.mapper;

import org.sara.domain.UserVO;

public interface UserMapper {
	public void reg(UserVO users) throws Exception;
	public int emailCheck(String email) throws Exception;
}
