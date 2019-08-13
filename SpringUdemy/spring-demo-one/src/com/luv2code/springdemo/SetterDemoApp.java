package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		// load the Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from Spring container
		CricketCoach cricketCoach = context.getBean("myCricketCoach",CricketCoach.class);

		// call methods on the bean
		System.out.println(cricketCoach.getDailyWorkout());
		
		System.out.println(cricketCoach.getDailyFortune());
		
		// call our new methods to get the literal values
		
		System.out.println(cricketCoach.getEmailAddress());
		
		System.out.println(cricketCoach.getTeam());
		
		
		// call our new methods to get the literal values		
		// close the context
		context.close();
	}

}
