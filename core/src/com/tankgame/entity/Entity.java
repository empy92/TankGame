package com.tankgame.entity;

import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Rectangle;

public abstract class Entity extends BasicEntity{

	/** The current speed of this entity horizontally (pixels/sec) */
	protected float speedX;
	/** The current speed of this entity vertically (pixels/sec) */
	protected float speedY;
	protected enum Direction{UP,DOWN,RIGHT,LEFT,
							UP_RIGHT,UP_LEFT,DOWN_RIGHT,DOWN_LEFT							
	};
	protected Direction direction;
	
	public Entity(float width, float height) {
		super(width, height);
		direction = Direction.UP;
	}
	
	public Entity(float width, float height, float posX, float posY) {
		super(width, height, posX, posY);
		direction = Direction.UP;
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
	
	public Direction getDirection(){
		return direction;
	}
	
	public void setDirection(Direction direction){
		this.direction = direction;
	}
	
	/**
	* Request that this entity move itself based on a certain ammount
	* of time passing.
	*
	* @param delta The ammount of time that has passed in milliseconds
	*/
	public void move(float delta) {
		this.posX += (delta * speedX);
		this.posY += (delta * speedY);
	}
	
	/**
	* Check if this entity collised with another.
	*
	* @param other The other entity to check collision against
	* @return True if the entities collide with each other
	*/
	public boolean collidesWith(BasicEntity other) {
		return Intersector.overlaps(new Rectangle(posX, posY, width, height), 
				new Rectangle(other.posX, other.posY, other.width, other.height));
	}
}
