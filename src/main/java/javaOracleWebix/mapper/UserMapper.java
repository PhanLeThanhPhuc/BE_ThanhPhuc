package javaOracleWebix.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import javaOracleWebix.entity.User;
@Mapper
public interface UserMapper {
	List<User> getAllUsers();	
}
