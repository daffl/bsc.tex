package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = context.getBean("userService", UserService.class);
		assert(userService.login("User2", "secret2") != null);
	}
}
