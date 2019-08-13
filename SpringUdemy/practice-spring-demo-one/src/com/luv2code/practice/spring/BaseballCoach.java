package com.luv2code.practice.spring;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BaseballCoach() {
		System.out.println("Inside BaseballCoach : Constructor");
	}
	
	public BaseballCoach(FortuneService theFortuneService) {		
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() { 
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() { 
		return fortuneService.getFortune();
	}
}