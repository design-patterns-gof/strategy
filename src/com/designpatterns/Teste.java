package com.designpatterns;

import com.designpatterns.context.Bowser;
import com.designpatterns.context.Mario;
import com.designpatterns.context.Personagem;
import com.designpatterns.strategy.impl.AtaqueBanana;
import com.designpatterns.strategy.impl.DefesaTudo;
import com.designpatterns.strategy.impl.SemBonus;

public class Teste {

	public static void main(String[] args) {

		Personagem mario = new Mario(null);
		mario.jogar();
		mario = new Mario(new SemBonus());
		mario.jogar();
		mario = new Mario(new AtaqueBanana());
		mario.jogar();
		mario = new Mario(new DefesaTudo());
		mario.jogar();
		mario.jogar();

		Personagem bowser = new Bowser(null);
		bowser.jogar();
		bowser = new Bowser(new DefesaTudo());
		bowser.jogar();

	}

}