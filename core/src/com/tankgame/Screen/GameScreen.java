package com.tankgame.Screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.tankgame.AssetLoader.AssetLoader;
import com.tankgame.InputHandler.InputHandler;

public class GameScreen implements Screen{

	private GameRenderer renderer;
	private GameWorld world;
	
	public GameScreen() {
		AssetLoader.loadTexture();
		world = new GameWorld();
		renderer = new GameRenderer(world);
		Gdx.input.setInputProcessor(new InputHandler(world));
	}
	
	@Override
	public void render(float delta) {
		world.update(delta);
		renderer.render();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
