package com.tankgame.Screen;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.tankgame.entity.JoyStick;
import com.tankgame.entity.Rock;
import com.tankgame.entity.Tank;

public class GameWorld {

	private Tank tankTesting;
	public ArrayList<Rock> rocks;
	public JoyStick digitalJoyStick;
	private Map map;
	
	public GameWorld() {
		map = new Map(20, 12);
		if(map.initMap("map1.map")){
			rocks = new ArrayList<Rock>();
			for(int i=0; i<20; i++){
				for(int j=0; j<12; j++){
					if(map.map[i][j] == 'X')
					rocks.add(new Rock(40, 40, Gdx.graphics.getWidth()/-2+(i*40),
							Gdx.graphics.getHeight()/2-40-(j*40)));
				}
			}
		}
		digitalJoyStick = new JoyStick();
		tankTesting = new Tank(40, 40, Color.MAROON);
	}
	
	public void update(float delta){
		tankTesting.move(delta);
	}
	
	public Tank getTank(){
		return tankTesting;
	}
}
