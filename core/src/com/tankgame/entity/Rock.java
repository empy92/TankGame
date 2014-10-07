package com.tankgame.entity;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.tankgame.AssetLoader.AssetLoader;
import com.tankgame.Screen.GameWorld;

public class Rock extends BasicEntity{

	public boolean color = false;
	
	public Rock(float width, float height, float posX, float posY) {
		super(width, height, posX, posY);
	}

	@Override
	public void draw(SpriteBatch batch) {
		if(color)
			batch.draw(AssetLoader.rock, posX, posY, width, height);
		else
			batch.draw(AssetLoader.rock1, posX, posY, width, height);
	}

}
