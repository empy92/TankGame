package com.tankgame.entity;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class ArrowButton extends BasicEntity{

	public ArrowButton(float width, float height, float posX, float posY) {
		super(width, height, posX, posY);
	}

	public void draw(ShapeRenderer batch) {
		batch.setColor(Color.GREEN);
		batch.rect(posX, posY, width, height);
	}

	@Override
	public void draw(SpriteBatch batch) {
		// TODO Auto-generated method stub
		
	}

}
