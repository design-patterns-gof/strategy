package com.designpatterns.personagem;

import static java.util.Objects.nonNull;

import com.designpatterns.strategy.JogadaStrategy;

public class Mario {

	private JogadaStrategy jogadaStrategy;

	public Mario(JogadaStrategy jogadaStrategy) {
		this.jogadaStrategy = jogadaStrategy;
	}

	public void jogar() {
		if (nonNull(jogadaStrategy)) {
			jogadaStrategy.jogar();
		}
		this.jogadaStrategy = null;
	}

	static {
		System.out.println(">>> JOGADOR: MARIO");
	}

}