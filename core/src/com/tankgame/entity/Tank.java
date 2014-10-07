package com.tankgame.entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Rectangle;
import com.tankgame.AssetLoader.AssetLoader;
import com.tankgame.Screen.GameRenderer;

public class Tank extends Entity{

	private Color color;
	private Bullet bullet;
	private boolean canShot;
	public boolean up = true;
	public boolean down = true;
	public boolean right = true;
	public boolean left = true;
	public final static float BASICSPEED = 80;
	
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
		checkScreenCollision();
		super.move(delta);
		if(bullet!=null)
			bullet.move(delta);
	}

	@Override
	public void draw(SpriteBatch batch) {
		float rotation = 0.0f;
		if(getSpeedX() >0)
			rotation = -90.0f;
		else if(getSpeedX() <0)
			rotation = 90.0f;
		else if(getSpeedY() >0)
			rotation = 0.0f;
		else if(getSpeedY() <0)
			rotation = 180.0f;
		batch.draw(AssetLoader.tank, posX, posY, width/2.0f, height/2.0f, width, height, 1, 1, rotation);
		if(bullet!=null)
			bullet.draw(batch);
		//down
		GameRenderer.shapeRenderer.rect(posX+1, posY, width-2, 1);
		//up
		GameRenderer.shapeRenderer.rect(posX+1, posY+height-1, width-2, 1);
		//left
		GameRenderer.shapeRenderer.rect(posX, posY+1, 1, height-2);
		//right
		GameRenderer.shapeRenderer.rect(posX+width-1, posY+1, 1, height-2);
		//System.out.println(getPositionX());
	}
	
	private void checkScreenCollision(){
		if(getPositionX()>Gdx.graphics.getWidth()/2-getWidth() && speedX>0)
			speedX=0;
		if(getPositionX()<Gdx.graphics.getWidth()/-2 && speedX<0)
			speedX=0;
		if(getPositionY()>Gdx.graphics.getHeight()/2-getHeight() && speedY>0)
			speedY=0;
		if(getPositionY()<Gdx.graphics.getHeight()/-2 && speedY<0)
			speedY=0;
	}

	public void moveUp() {
		setSpeed(0, BASICSPEED);
		setDirection(Direction.UP);
	}
	
	public void moveDown() {
		setSpeed(0, -BASICSPEED);
		setDirection(Direction.DOWN);
	}
	
	public void moveRight() {
		setSpeed(BASICSPEED, 0);
		setDirection(Direction.RIGHT);
	}
	
	public void moveLeft() {
		setSpeed(-BASICSPEED, 0);
		setDirection(Direction.LEFT);
	}
	
	public void shot(){
		if(canShot){
			canShot = false;
			if(speedX!=0){
				if(speedX>0)
					bullet = new Bullet(10, 10, getPositionX()+getWidth()+10, posY+getHeight()/2 - 10/2, this);
				else
					bullet = new Bullet(10, 10, getPositionX()-10, posY+getHeight()/2 - 10/2, this);
			}
			else if(speedY!=0){
				if(speedY>0)
					bullet = new Bullet(10, 10, getPositionX()+getWidth()/2-10/2, posY+getHeight() + 10, this);
				else
					bullet = new Bullet(10, 10, getPositionX()+getWidth()/2-10/2, posY - 10, this);
			}
			bullet.setSpeed(getSpeedX()*4,getSpeedY()*4);
		}
	}
	
	public void canShot(boolean canShot){
		this.canShot = canShot;
	}
	
	@Override
	public boolean collidesWith(BasicEntity other) {
		Rectangle otherR = new Rectangle(other.posX, other.posY, 
				other.width, other.height);
		//down
		if(Intersector.overlaps(new Rectangle(posX+5, posY, width-10, 1),otherR)
				&& speedY<0)
			speedY=0;
		//up
		else if(Intersector.overlaps(new Rectangle(posX+5, posY+height-1, width-10, 1),otherR)
				&& speedY>0)
			speedY=0;
		//left
		else if(Intersector.overlaps(new Rectangle(posX, posY+5, 1, height-10),otherR)
				&& speedX<0)
			speedX=0;
		//right
		else if(Intersector.overlaps(new Rectangle(posX+width-1, posY+5, 1, height-10),otherR)
				&& speedX>0)
			speedX=0;
		return true;
	}
}
