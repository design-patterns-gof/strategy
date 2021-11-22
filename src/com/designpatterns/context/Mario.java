package com.designpatterns.context;

import com.designpatterns.strategy.BonusStrategy;

public class Mario extends Personagem {

	public Mario(BonusStrategy strategy) {
		super(strategy);
	}

	static {
		System.out.println("\n>>>>>>>>>> Mario jogando ...");
	}

}