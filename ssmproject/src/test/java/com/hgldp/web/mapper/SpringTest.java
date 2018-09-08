package com.hgldp.web.mapper;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hgldp.web.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/*.xml")
public class SpringTest {

	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testMap(){
		Map<String,String> map = new HashMap<String,String>();
		map.put("username", "hgl");
		map.put("password", "123");
		map.put("phone", "17621481215");
		map.put("email", "hgl199305@163.com");
		Map<String,Map<String,String>> m = new HashMap<String,Map<String,String>>();
		m.put("keys", map);
		this.userMapper.insertUser(m);
	}
}
