package com.tankgame.entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Tank extends Entity implements Clickable{

	private Color color;
	private Bullet bullet;
	private boolean canShot;
	
	public Tank(float width, float height) {
		super(width, height);
		canShot = true;
	}
	
	public Tank(float width, float height, Color color) {
		super(width, height);
		this.color = color;
		canShot = true;
	}
	
	public Tank(float width, float height, Color color, float posX, float posY) {
		super(width, height, posX, posY);
		canShot = true;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	@Override
	public void move(float delta) {
		super.move(delta);
		if(getPositionX()>Gdx.graphics.getWidth()/2)
			setPositionX(Gdx.graphics.getWidth()/-2);
		if(getPositionX()<Gdx.graphics.getWidth()/-2)
			setPositionX(Gdx.graphics.getWidth()/2);
		if(bullet!=null)
			bullet.move(delta);
	}

	@Override
	public void draw(ShapeRenderer batch) {
		batch.setColor(getColor());
		batch.rect(getPositionX(), getPositionY(), 
				getWidth(), getHeight());
		if(bullet!=null)
			bullet.draw(batch);
		System.out.println(getPositionX());
	}

	@Override
	public void onClick() {
		speedX = -speedX;
	}
	
	public void shot(){
		if(canShot){
			canShot = false;
			if(speedX>0)
				bullet = new Bullet(10, 10, getPositionX()+getWidth()+10, posY+getHeight()/2, this);
			else
				bullet = new Bullet(10, 10, getPositionX()-10, posY+getHeight()/2 - 10/2, this);
			bullet.setSpeedX(getSpeedX()*4);
		}
	}
	
	public void canShot(boolean canShot){
		this.canShot = canShot;
	}

}
