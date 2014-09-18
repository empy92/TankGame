package com.tankgame.entity;

import java.awt.Point;

import com.badlogic.gdx.graphics.Color;

public class Tank {

	private float width;
	private float height;
	private Color color;
	private float posX;
	private float posY;
	
	public Tank(float width, float height) {
		this.width = width;
		this.height = height;
	}
	
	public Tank(float width, float height, Color color) {
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public Tank(float width, float height, Color color, float posX, float posY) {
		this.width = width;
		this.height = height;
		this.color = color;
		this.posX = posX;
		this.posY = posY;
	}
	
	

	public float getWidth() {
		return width;
	}

	public float getHeight() {
		return height;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
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
}
