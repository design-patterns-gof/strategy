package com.designpatterns.context;

import static java.util.Objects.isNull;

import com.designpatterns.strategy.BonusStrategy;
import com.designpatterns.strategy.impl.DefesaBanana;
import com.designpatterns.strategy.impl.DefesaCascoVerde;
import com.designpatterns.strategy.impl.SemBonus;

public abstract class Personagem {

	BonusStrategy strategy;

	Personagem(BonusStrategy strategy) {
		this.strategy = strategy;
	}

	public void jogar() {
		if (isNull(strategy)) {
			descartarEstrategia();
		}
		strategy.jogar();
		strategy = new SemBonus();
	}

	protected boolean estrategiaDeDefesa() {
		return strategy instanceof DefesaCascoVerde || strategy instanceof DefesaBanana;
	}

	protected void descartarEstrategia() {
		strategy = new SemBonus();
	}

}