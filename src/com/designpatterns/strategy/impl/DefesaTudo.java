package com.designpatterns.strategy.impl;

import com.designpatterns.strategy.BonusStrategy;

public class DefesaTudo implements BonusStrategy {

	@Override
	public void jogar() {
		System.out.println("Me defendendo de todos ataques");
	}

}