package com.designpatterns.strategy.impl;

import com.designpatterns.strategy.BonusStrategy;

public class DefesaCascoVerde implements BonusStrategy {

	@Override
	public void jogar() {
		System.out.println("Me defendendo de 1 casco verde");
	}

}