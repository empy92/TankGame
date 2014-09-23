package com.tankgame.entity;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public abstract class BasicEntity {

	protected float width;
	protected float height;
	protected float posX;
	protected float posY;
	
	public BasicEntity(float width, float height) {
		this.width = width;
		this.height = height;
		setPosition(0, 0);
	}
	
	public BasicEntity(float width, float height, float posX, float posY) {
		this.width = width;
		this.height = height;
		setPosition(posX, posY);
	}
	
	public float getWidth() {
		return width;
	}

	public float getHeight() {
		return height;
	}
	
	public void setPosition(float posX, float posY){
		this.posX = posX;
		this.posY = posY;
	}
	
	public float getPositionX(){ 
		return posX;
	}
	
	public float getPositionY(){ 
		return posY;
	}
	
	public void setPositionX(float posX){ 
		this.posX = posX;
	}
	
	public void setPositionY(float posY){ 
		this.posY = posY;
	}
	
	public abstract void draw(ShapeRenderer batch);
}
