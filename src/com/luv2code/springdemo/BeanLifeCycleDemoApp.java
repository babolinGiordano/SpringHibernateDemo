package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {

		// Load spring configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		// Retrieve bean from spring container
		Coach theCoach = context.getBean("myTrackCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		// Close context
		context.close();
	
	}

}
