package com.designpatterns.context;

import static java.util.Objects.isNull;

import com.designpatterns.strategy.BonusStrategy;
import com.designpatterns.strategy.impl.DefesaBanana;
import com.designpatterns.strategy.impl.DefesaCascoVerde;
import com.designpatterns.strategy.impl.SemBonus;

public abstract class Personagem {

	BonusStrategy strategy;

	public void jogar() {
		if (isNull(strategy)) {
			definirEstrategiaSemBonus();
		}
		strategy.jogar();
		definirEstrategiaSemBonus();
	}

	public void capturarBonus(BonusStrategy strategy) {
		this.strategy = strategy;
	}

	protected boolean isEstrategiaDeDefesa() {
		return strategy instanceof DefesaCascoVerde || strategy instanceof DefesaBanana;
	}

	protected void definirEstrategiaSemBonus() {
		strategy = new SemBonus();
	}

}