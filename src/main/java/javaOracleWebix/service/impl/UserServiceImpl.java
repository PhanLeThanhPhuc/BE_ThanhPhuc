package javaOracleWebix.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javaOracleWebix.entity.User;
import javaOracleWebix.mapper.UserMapper;
import javaOracleWebix.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper mapper;

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return mapper.getAllUsers();
	}

	@Override
	public User getUserById(@Param("id") int id ) {
		// TODO Auto-generated method stub
		return mapper.getUserById(id);
	}
	
	@Override
	public List<User> getUserByRole(@Param("id") String id) {
		// TODO Auto-generated method stub
		return mapper.getUserByRole(id);
	}
	
	@Override
	public List<User> getUserByRoleUse(@Param("id") String id) {
		// TODO Auto-generated method stub
		return mapper.getUserByRoleUse(id);
	}

}
