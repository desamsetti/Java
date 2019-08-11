package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeHelloSpringApp {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach golfCoach = context.getBean("golfCoach",Coach.class);
		
		System.out.println(golfCoach.getDailyWorkout());
		
		context.close();
	}
	
}
