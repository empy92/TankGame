package com.tankgame.InputHandler;

import com.badlogic.gdx.InputProcessor;
import com.tankgame.Screen.GameWorld;

public class InputHandler implements InputProcessor{

	private GameWorld world;
	
	public InputHandler(GameWorld world){
		this.world = world;
	}
	
	@Override
	public boolean keyDown(int keycode) {
		if(keycode == 21 || keycode == 22)
			world.getTank().onClick();
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
		// TODO Auto-generated method stub
		return false;
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
