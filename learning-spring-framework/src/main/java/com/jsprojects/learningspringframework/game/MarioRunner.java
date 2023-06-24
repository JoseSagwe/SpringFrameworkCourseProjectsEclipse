package com.jsprojects.learningspringframework.game;

public class MarioRunner {
	
	GameInterfaceConsole game;

	public MarioRunner(GameInterfaceConsole game) {
		this.game = game;
	}
	
	public void run(){
        game.left();
        game.up();
        game.right();
        game.down();
    }
	

}
