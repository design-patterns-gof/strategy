package com.designpatterns.strategy.impl;

import com.designpatterns.strategy.BonusStrategy;

public class AtaqueCascoVermelho implements BonusStrategy {

	@Override
	public void jogar() {
		System.out.println("Atacando com 1 casco vermelho");
	}

}