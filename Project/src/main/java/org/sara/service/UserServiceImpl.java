package org.sara.service;

import org.sara.domain.UserVO;
import org.sara.mapper.UserMapper;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
	private UserMapper mapper;

	 @Override
	 public void reg(UserVO vo) throws Exception {
	    mapper.reg(vo);
	 }
	 
	 @Override
	 public int emailCheck(String email) throws Exception {
		 return mapper.emailCheck(email);
	 }
}
