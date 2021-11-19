package com.designpatterns;

import com.designpatterns.personagem.Bowser;
import com.designpatterns.personagem.Mario;
import com.designpatterns.personagem.Yoshi;
import com.designpatterns.strategy.ataque.AtaqueBanana;
import com.designpatterns.strategy.ataque.AtaqueCascoVermelho;
import com.designpatterns.strategy.defesa.DefesaCascoVerde;

public class Main {

	public static void main(String[] args) {

		Mario mario = new Mario(new AtaqueBanana());
		mario.jogar();
		mario = new Mario(new DefesaCascoVerde());
		mario.jogar();

		Bowser bowser = new Bowser(new AtaqueBanana());
		bowser.jogar();

		Yoshi yoshi = new Yoshi(new AtaqueCascoVermelho());
		yoshi.jogar();
	}

}