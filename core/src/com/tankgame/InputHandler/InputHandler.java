package com.tankgame.InputHandler;

import java.util.Iterator;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.tankgame.Screen.GameWorld;
import com.tankgame.entity.SimpleButton;

public class InputHandler implements InputProcessor{

	private GameWorld world;
	
	public InputHandler(GameWorld world){
		this.world = world;
	}
	
	@Override
	public boolean keyDown(int keycode) {
		if(keycode == 21 || keycode == 22 || keycode == 19 || keycode == 20){
			if(keycode == 21)
				world.getTank().moveLeft();
			if(keycode == 22)
				world.getTank().moveRight();
			if(keycode == 20)
				world.getTank().moveDown();
			if(keycode == 19)
				world.getTank().moveUp();
		}
		else if(keycode == 62)
			world.getTank().shot();
		return true;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		screenX = screenX-Gdx.graphics.getWidth()/2;
		screenY = -(screenY-Gdx.graphics.getHeight()/2);
		if(world.digitalJoyStick.up.isTouchDown(screenX, screenY))
			world.getTank().moveUp();
		if(world.digitalJoyStick.down.isTouchDown(screenX, screenY))
			world.getTank().moveDown();
		if(world.digitalJoyStick.right.isTouchDown(screenX, screenY))
			world.getTank().moveRight();
		if(world.digitalJoyStick.left.isTouchDown(screenX, screenY))
			world.getTank().moveLeft();
		if(world.digitalJoyStick.shot.isTouchDown(screenX, screenY))
			world.getTank().shot();
		return true;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
