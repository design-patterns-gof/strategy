package com.designpatterns;

import com.designpatterns.context.Bowser;
import com.designpatterns.context.Mario;
import com.designpatterns.context.Personagem;
import com.designpatterns.strategy.impl.AtaqueTopera;
import com.designpatterns.strategy.impl.DefesaCascoVerde;

public class Teste {

	public static void main(String[] args) {

		Personagem mario = new Mario();
		mario.jogar();
		mario.capturarBonus(new AtaqueTopera());
		mario.jogar();
		mario.jogar();
		mario.capturarBonus(new DefesaCascoVerde());
		mario.jogar();

		Personagem bowser = new Bowser();
		bowser.jogar();
		bowser.jogar();
		bowser.capturarBonus(new AtaqueTopera());
		bowser.jogar();
		bowser.capturarBonus(new DefesaCascoVerde());
		bowser.jogar();
		bowser.capturarBonus(null);
		bowser.jogar();

	}

}