package com.luv2code.springdemo;

public class GolfCoach implements Coach{

	FortuneService fortuneService;
	
	GolfCoach(FortuneService theFortuneService){
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice Golf every Saturday";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	
}
