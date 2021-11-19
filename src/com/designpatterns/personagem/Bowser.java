package com.designpatterns.personagem;

import static java.util.Objects.nonNull;

import com.designpatterns.strategy.ataque.Ataque;

public class Bowser {

	private Ataque ataque;

	public Bowser(Ataque ataque) {
		this.ataque = ataque;
	}

	public void jogar() {
		if (nonNull(ataque)) {
			ataque.jogar();
		}
		this.ataque = null;
	}

	static {
		System.out.println(">>> JOGADOR: BOWSER");
	}

}