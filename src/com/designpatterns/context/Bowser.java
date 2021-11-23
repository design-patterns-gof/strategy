package com.designpatterns.context;

import com.designpatterns.strategy.BonusStrategy;

public class Bowser extends Personagem {

	public Bowser(BonusStrategy strategy) {
		super(strategy);
	}

	@Override
	public void jogar() {
		if (estrategiaDeDefesa())
			descartarEstrategia();
		super.jogar();
	}

	static {
		System.out.println("\n>>>>>>>>>> Bowser jogando ...");
	}

}