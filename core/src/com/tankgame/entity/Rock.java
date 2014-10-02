package com.tankgame.entity;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.tankgame.AssetLoader.AssetLoader;

public class Rock extends BasicEntity{

	public Rock(float width, float height, float posX, float posY) {
		super(width, height, posX, posY);
	}

	@Override
	public void draw(SpriteBatch batch) {
		batch.draw(AssetLoader.rock, posX, posY, width, height);
	}

}
