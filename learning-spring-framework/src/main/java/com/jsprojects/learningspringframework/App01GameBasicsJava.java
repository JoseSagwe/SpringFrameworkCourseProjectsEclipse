package com.jsprojects.learningspringframework;

import com.jsprojects.learningspringframework.game.Mario;
import com.jsprojects.learningspringframework.game.MarioRunner;
import com.jsprojects.learningspringframework.game.PacManGame;
import com.jsprojects.learningspringframework.game.SuperContraGame;

public class App01GameBasicsJava {

	public static void main(String[] args) {
	
		//Mario game = new Mario();
//		PacManGame game = new PacManGame();
		SuperContraGame game = new SuperContraGame();
		
		MarioRunner rung = new MarioRunner(game);
		rung.run();
	}

}
