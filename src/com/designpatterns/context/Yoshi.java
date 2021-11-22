package com.designpatterns.context;

import com.designpatterns.strategy.BonusStrategy;

public class Yoshi extends Personagem {

	public Yoshi(BonusStrategy strategy) {
		super(strategy);
	}

	static {
		System.out.println("\n>>>>>>>>>> Yoshi jogando ...");
	}

}