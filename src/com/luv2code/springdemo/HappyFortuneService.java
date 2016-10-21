package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is your lucky day!";
	}

	@Override
	public String[] getGbFortune() {
		String[] test = {"A", "B", "C"}; 
		return test;
	}

}
