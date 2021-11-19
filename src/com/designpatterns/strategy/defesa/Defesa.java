package com.designpatterns.strategy.defesa;

import com.designpatterns.strategy.JogadaStrategy;

public abstract class Defesa implements JogadaStrategy {

	@Override
	public void jogar() {
		System.out.println("N�o posso defender, estou sem b�nus");
	}

}