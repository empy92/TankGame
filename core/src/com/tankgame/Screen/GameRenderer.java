package com.tankgame.Screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.tankgame.entity.Tank;

public class GameRenderer {

	//to draw geometrical item
	//TODO change for sprite draw
	private ShapeRenderer shapeRenderer;
	
	//TODO use scrollable camera and adapt to different size screen
	private OrthographicCamera orthographicCamera;
	
	private GameWorld world;
	
	public GameRenderer(GameWorld gameWorld) {
		world = gameWorld;
		shapeRenderer = new ShapeRenderer();
		orthographicCamera = new OrthographicCamera(800,480);
		shapeRenderer.setProjectionMatrix(orthographicCamera.combined);
	}
	
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		shapeRenderer.begin(ShapeType.Filled);
		drawTank(world.getTank());
		shapeRenderer.end();
	}
	
	private void drawTank(Tank testingTank){
		shapeRenderer.setColor(testingTank.getColor());
		shapeRenderer.rect(testingTank.getPositionX(), testingTank.getPositionY(), 
				testingTank.getWidth(), testingTank.getHeight());
		System.out.println(testingTank.getPositionX());
	}
}
