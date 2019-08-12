package com.luv2code.springdemo;

public class CricketCoach implements Coach{
	FortuneService fortuneService;
	
	// create a no-arg constructor
	public CricketCoach(){
		System.out.println("CricketCoach : inside no-arg constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 minutes";
	}

	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach : inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
