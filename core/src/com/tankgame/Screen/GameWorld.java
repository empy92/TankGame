package com.tankgame.Screen;

import com.badlogic.gdx.graphics.Color;
import com.tankgame.entity.Tank;

public class GameWorld {

	private Tank tankTesting;
	
	public GameWorld() {
		tankTesting = new Tank(50, 50, Color.MAROON);
		tankTesting.setSpeedX(75);
	}
	
	public void update(float delta){
		tankTesting.move(delta);
	}
	
	public Tank getTank(){
		return tankTesting;
	}
}
