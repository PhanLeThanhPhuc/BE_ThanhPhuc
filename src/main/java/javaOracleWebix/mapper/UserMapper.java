package javaOracleWebix.mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import javaOracleWebix.entity.User;
@Mapper
public interface UserMapper {
	List<User> getAllUsers();
	User getUserById(int id);
	List<User> getUserByRole(String id);
	List<User> getUserByRoleUse(String id);
}
