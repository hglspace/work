package com.hgldp.web.mapper;

import java.util.List;
import java.util.Map;

import com.hgldp.web.pojo.User;

public interface UserMapper {

	public int updateUser(List<User> userList);
	
	public int insertUser(Map<String,Map<String,String>> maps);
}
