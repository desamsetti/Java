package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	
	TrackCoach(FortuneService theFortuneService){
		this.fortuneService = theFortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It : "+fortuneService.getFortune();
	}

}
