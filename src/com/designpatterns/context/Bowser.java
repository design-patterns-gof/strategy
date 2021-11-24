package com.designpatterns.context;

import com.designpatterns.strategy.BonusStrategy;

public class Bowser extends Personagem {

	@Override
	public void capturarBonus(BonusStrategy bonusStrategy) {
		super.capturarBonus(bonusStrategy);
		if (isEstrategiaDeDefesa()) {
			definirEstrategiaSemBonus();
		}
	}

	static {
		System.out.println("\n>>>>>>>>>> Bowser jogando ...");
	}

}