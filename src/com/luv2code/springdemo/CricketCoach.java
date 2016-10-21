package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private GbFortuneService gbFortuneService;
	// Add 2 new fields
	private String email;
	private String team;
	
	//Create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	public void setGbFortuneService(GbFortuneService gbFortuneService) {
		System.out.println("CricketCoach: inside setter method - setGbFortune");
		this.gbFortuneService = gbFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practise fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("CricketCoach: inside setter method - setEmail");
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}

	@Override
	public String getGbDailyFortune() {
		System.out.println("CricketCoach: inside getGbDailyFortune");
		String[] gbFortune2 = gbFortuneService.getGbFortune();
		return gbFortune2[2];
	}
	
	

}
