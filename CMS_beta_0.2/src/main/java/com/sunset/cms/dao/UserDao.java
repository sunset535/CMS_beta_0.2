package com.sunset.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.sunset.cms.bean.User;

public interface UserDao {

	@Insert("insert into user values (null,#{},#{}")
	public int addUser();
	
	@Select("select * from users")  
	List<User> getAllUsers();  
}
