package com.tankgame.entity;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

public class Rock extends BasicEntity{

	public Rock(float width, float height, float posX, float posY) {
		super(width, height, posX, posY);
	}

	@Override
	public void draw(ShapeRenderer batch) {
		batch.setColor(Color.GRAY);
		batch.rect(posX, posY, width, height);
		batch.end();
		batch.begin(ShapeType.Line);
		batch.setColor(Color.BLACK);
		batch.rect(posX, posY, width, height);
		batch.end();
		batch.begin(ShapeType.Filled);
	}

}
