package com.hc.po;

public class Person {
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	//消除警告
	@SuppressWarnings("unused")
	public void doit(){
		int i = 100;
		System.out.println(Math.PI);
		
	}
	
	
	
	
	//过时了
	@Deprecated
	public void aaa(){
		System.out.println("**********");
	}

}
