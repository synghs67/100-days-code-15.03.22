package com.spring.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo.beans.UserBeans;

public class DemoApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContextConfig.xml");// Start
		
		UserBeans user = context.getBean("userBean", UserBeans.class);
		System.out.println(user);
		
		
		context.close(); // Close
	}

}
