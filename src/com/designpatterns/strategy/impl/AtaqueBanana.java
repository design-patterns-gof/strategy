package com.designpatterns.strategy.impl;

import com.designpatterns.strategy.BonusStrategy;

public class AtaqueBanana implements BonusStrategy {

	@Override
	public void jogar() {
		System.out.println("Atacando com 1 Banana");
	}

}