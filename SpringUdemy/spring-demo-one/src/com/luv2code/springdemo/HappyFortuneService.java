package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] fortunes = {"Today is Cool","Tomorrow is Cool","Forever is great"};
		Random rand = new Random();
		int x = rand.nextInt(fortunes.length-1)+1;
		return fortunes[x];
	}

}
