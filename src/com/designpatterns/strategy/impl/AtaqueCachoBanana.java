package com.designpatterns.strategy.impl;

import com.designpatterns.strategy.BonusStrategy;

public class AtaqueCachoBanana implements BonusStrategy {

	@Override
	public void jogar() {
		System.out.println("Atacando com 1 cacho de banana");
	}

}