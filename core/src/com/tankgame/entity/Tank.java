package com.tankgame.entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;

public class Tank extends Entity{

	private Color color;
	
	public Tank(float width, float height) {
		super(width, height);
	}
	
	public Tank(float width, float height, Color color) {
		super(width, height);
		this.color = color;
	}
	
	public Tank(float width, float height, Color color, float posX, float posY) {
		super(width, height, posX, posY);
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public void move(){
		setPositionX(getPositionX()+1);
		if(getPositionX()>Gdx.graphics.getWidth()/2)
			setPositionX(Gdx.graphics.getWidth()/-2);
	}

}
