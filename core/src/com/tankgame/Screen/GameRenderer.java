package com.tankgame.Screen;

import java.util.Iterator;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.tankgame.entity.Rock;
import com.tankgame.entity.SimpleButton;
import com.tankgame.entity.Tank;

public class GameRenderer{

	//to draw geometrical item
	public static ShapeRenderer shapeRenderer;
	
	//to draw sprite item
	private SpriteBatch spriteBatch;
	
	//TODO use scrollable camera and adapt to different size screen
	private OrthographicCamera orthographicCamera;
	
	private GameWorld world;
	
	public GameRenderer(GameWorld gameWorld) {
		world = gameWorld;
		//init camera
		orthographicCamera = new OrthographicCamera(800,480);
		
		//init ShapeRenderer
		shapeRenderer = new ShapeRenderer();
		shapeRenderer.setProjectionMatrix(orthographicCamera.combined);
		
		//init SpriteBatch
		spriteBatch = new SpriteBatch();
		spriteBatch.setProjectionMatrix(orthographicCamera.combined);
	}
	
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		shapeRenderer.begin(ShapeType.Filled);
		spriteBatch.begin();
		spriteBatch.disableBlending();
		world.getTank().draw(spriteBatch);
		spriteBatch.enableBlending();
		Iterator<Rock> iter = world.rocks.iterator();
		while(iter.hasNext())
			iter.next().draw(spriteBatch);
		spriteBatch.end();
		Iterator<SimpleButton> iterator = world.digitalJoyStick.getButton().iterator();
		while(iterator.hasNext())
			iterator.next().draw(shapeRenderer);
		shapeRenderer.end();

	}
}
