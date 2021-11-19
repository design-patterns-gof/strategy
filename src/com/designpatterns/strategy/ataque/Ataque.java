package com.designpatterns.strategy.ataque;

import com.designpatterns.strategy.JogadaStrategy;

public abstract class Ataque implements JogadaStrategy {

	@Override
	public void jogar() {
		System.out.println("Não posso atacar, estou sem bônus");
	}

}