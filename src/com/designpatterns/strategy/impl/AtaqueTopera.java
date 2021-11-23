package com.designpatterns.strategy.impl;

import com.designpatterns.strategy.BonusStrategy;

public class AtaqueTopera implements BonusStrategy {

	@Override
	public void jogar() {
		System.out.println("Atacando com topera");
	}

}