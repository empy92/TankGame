package com.tankgame;

import com.badlogic.gdx.Game;
import com.tankgame.Screen.GameScreen;

public class TankGame extends Game {

	@Override
	public void create () {
		setScreen(new GameScreen());
	}
	
}
