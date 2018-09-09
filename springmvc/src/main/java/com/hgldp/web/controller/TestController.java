package com.hgldp.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.hgldp.web.pojo.User;

@Controller
public class TestController {

	@RequestMapping(value="show",method=RequestMethod.POST)
	@ResponseBody
	public String test1(User user){
		System.out.println(user.toString());
		String flag = "true";
		return flag;
	}
	
	@RequestMapping("show1")
	@ResponseStatus(value=HttpStatus.OK)
	public void test1(){
		System.out.println("show1方法");
	}
}
