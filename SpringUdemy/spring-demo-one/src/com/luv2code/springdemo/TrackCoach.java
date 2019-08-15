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
	
	
	// add an init method
	public static void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	
	// add a destroy method
	public static void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside method doMyEndupStuff");
	}

}
