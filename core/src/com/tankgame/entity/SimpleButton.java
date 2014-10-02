package com.tankgame.entity;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;


public class SimpleButton extends BasicEntity{
	
	//private TextureRegion buttonUp;
	//private TextureRegion buttonDown;
	private Color buttonUp;
	private Color buttonDown;
	
	private Rectangle bounds;

	private boolean isPressed = false;

	public SimpleButton(float x, float y, float width, float height,
			TextureRegion buttonUp, TextureRegion buttonDown) {
		super(width, height, x, y);
		bounds = new Rectangle(x, y, width, height);
	}
	
	public SimpleButton(float x, float y, float width, float height,
			Color buttonUp, Color buttonDown) {
		super(width, height, x, y);
		this.buttonUp = buttonUp;
		this.buttonDown = buttonDown;
		bounds = new Rectangle(x, y, width, height);
	}

	public boolean isClicked(int screenX, int screenY) {
		return bounds.contains(screenX, screenY);
	}

	public void draw(ShapeRenderer batcher) {
		if (isPressed) {
			batcher.setColor(buttonDown);
		} else {
			batcher.setColor(buttonUp);
		}
		batcher.rect(posX, posY, width, height);
	}

	public boolean isTouchDown(int screenX, int screenY) {

		if (bounds.contains(screenX, screenY)) {
			isPressed = true;
			return true;
		}
		return false;
	}

	public boolean isTouchUp(int screenX, int screenY) {
		
		// It only counts as a touchUp if the button is in a pressed state.
		if (bounds.contains(screenX, screenY) && isPressed) {
			isPressed = false;
			//ACTION
			return true;
		}
		
		// Whenever a finger is released, we will cancel any presses.
		isPressed = false;
		return false;
	}

	@Override
	public void draw(SpriteBatch batch) {
		// TODO Auto-generated method stub
		
	}

}