package com.designpatterns.context;

import static java.util.Objects.isNull;

import com.designpatterns.strategy.BonusStrategy;
import com.designpatterns.strategy.impl.SemBonus;

public abstract class Personagem {

	BonusStrategy strategy;

	Personagem(BonusStrategy strategy) {
		this.strategy = strategy;
	}

	public void jogar() {
		if (isNull(strategy)) {
			strategy = new SemBonus();
		}
		strategy.jogar();
		strategy = new SemBonus();
	}

}