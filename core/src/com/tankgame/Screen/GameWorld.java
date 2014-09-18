package com.tankgame.Screen;

import com.badlogic.gdx.graphics.Color;
import com.tankgame.entity.Tank;

public class GameWorld {

	private Tank tankTesting;
	
	public GameWorld() {
		tankTesting = new Tank(50, 50, Color.MAROON);
	}
	
	public void update(){
		
	}
	
	public Tank getTank(){
		return tankTesting;
	}
}
