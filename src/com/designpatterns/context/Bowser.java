package com.designpatterns.context;

import com.designpatterns.strategy.BonusStrategy;
import com.designpatterns.strategy.impl.DefesaTudo;

public class Bowser extends Personagem {

	public Bowser(BonusStrategy strategy) {
		super(strategy);
	}

	@Override
	public void jogar() {
		if (strategy instanceof DefesaTudo)
			strategy = null;
		super.jogar();
	}

	static {
		System.out.println("\n>>>>>>>>>> Bowser jogando ...");
	}

}