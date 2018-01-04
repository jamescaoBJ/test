package com.bean;

import com.zept.bean.User;


public class TestUser {	
	public static void main(String[] args) {
		User user=new User();
		user.setUsername("james");
		user.setPassword("123456");
		user.setAge(30);
		System.out.println("name="+user.getUsername()+",password="+user.getPassword()+",age="+user.getAge());
	}

}
