package com.tankgame.entity;

public abstract class Entity extends BasicEntity{

	/** The current speed of this entity horizontally (pixels/sec) */
	protected float speedX;
	/** The current speed of this entity vertically (pixels/sec) */
	protected float speedY;
	private static final float SPEEDUNIT = 1000;
	
	public Entity(float width, float height) {
		super(width, height);
	}
	
	public Entity(float width, float height, float posX, float posY) {
		super(width, height, posX, posY);
	}
	
	public void setSpeedX(float speedX){
		this.speedX = speedX;
	}
	
	public void setSpeedY(float speedY){
		this.speedY = speedY;
	}
	
	public void setSpeed(float speedX, float speedY){
		this.speedX = speedX;
		this.speedY = speedY;
	}
	
	public float getSpeedX(){
		return speedX;
	}
	
	public float getSpeedY(){
		return speedY;
	}
	
	/**
	* Request that this entity move itself based on a certain ammount
	* of time passing.
	*
	* @param delta The ammount of time that has passed in milliseconds
	*/
	public void move(float delta) {
		this.posX += (delta * speedX)/SPEEDUNIT;
		this.posX += (delta * speedY)/SPEEDUNIT;
	}
	
	/**
	* Check if this entity collised with another.
	*
	* @param other The other entity to check collision against
	* @return True if the entities collide with each other
	*/
	public boolean collidesWith(BasicEntity other) {
		//TODO implements collision
		return false;
	}
}