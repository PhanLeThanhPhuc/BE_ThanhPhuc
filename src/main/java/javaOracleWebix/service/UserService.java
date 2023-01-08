package javaOracleWebix.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import javaOracleWebix.entity.User;

public interface UserService {
	List<User>  getAllUsers();
	User getUserById(@Param("id") int id );
	List<User> getUserByRole(@Param("id") String id);
	List<User> getUserByRoleUse(@Param("id") String id);
}
