package com.designpatterns.strategy.impl;

import com.designpatterns.strategy.BonusStrategy;

public class SemBonus implements BonusStrategy {

	@Override
	public void jogar() {
		System.out.println("Ops! Você não tem bônus!");
	}

}