package com.luv2code.practice.spring;

public class CricketCoach implements Coach{

	
	private String emailAddress;
	
	private String team;
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	FortuneService fortuneService;
	
	
	
	public CricketCoach(FortuneService fortuneService) {		
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() { 
		return "Do 30 minutes batting practice daily";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
