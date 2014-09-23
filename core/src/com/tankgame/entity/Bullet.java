package com.tankgame.entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Bullet extends Entity{
	
	private Tank shoter;
	
	public Bullet(float width, float height, float posX, float posY, Tank shoter) {
		super(width, height, posX, posY);
		this.shoter = shoter;
	}

	@Override
	public void draw(ShapeRenderer batch) {
		batch.setColor(Color.YELLOW);
		batch.rect(getPositionX(), getPositionY(), 
				getWidth(), getHeight());
	}
	
	@Override
	public void move(float delta) {
		super.move(delta);
		if(outOfScreen())
			stop();
	}
	
	private boolean outOfScreen(){
		boolean out = false;
		if(getPositionX()>Gdx.graphics.getWidth()/2)
			out = true;
		else if(getPositionX()<Gdx.graphics.getWidth()/-2)
			out = true;
		else if(getPositionY()<Gdx.graphics.getHeight()/-2)
			out = true;
		else if(getPositionY()>Gdx.graphics.getHeight()/2)
			out = true;
		return out;
	}
	
	private void expode(){
		stop();
	}
	
	private void stop(){
		shoter.canShot(true);
		setSpeed(0, 0);
	}
	
	@Override
	public boolean collidesWith(BasicEntity other) {
		return super.collidesWith(other);
	}

}
