package com.designpatterns.strategy.ataque;

import com.designpatterns.strategy.JogadaStrategy;

public abstract class Ataque implements JogadaStrategy {

	@Override
	public void jogar() {
		System.out.println("N�o posso atacar, estou sem b�nus");
	}

}