package com.zept.bean;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private String username;
	private String password;
	private int age;
    private Integer seq;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		List<String> list =new ArrayList<String>();
		list.add("123");
		//System.out.println(list.size());
		List<String> list2 =new ArrayList<String>();
		list2.add("000p");
		list.addAll(list2);
		System.out.println(list.size());
		for(String ss:list){
			System.out.println(ss);
		}
		/*User   user=new User();
		System.out.println(user.getAge());*/
	}
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
	}
}
