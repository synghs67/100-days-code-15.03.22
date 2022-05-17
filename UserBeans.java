package com.spring.demo.beans;

public class UserBeans {
	private String name;
	private int age;
	public UserBeans() {
		super();
		
	}
	public UserBeans(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
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
	@Override
	public String toString() {
		return "UserBeans [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
	


	
	
	
	
	

}
