package com.tankgame.entity;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;

public class JoyStick {
	
	public SimpleButton up;
	public SimpleButton down;
	public SimpleButton right;
	public SimpleButton left;
	public SimpleButton shot;
	
	public JoyStick() {
		up = new SimpleButton(Gdx.graphics.getWidth()/-2+30, Gdx.graphics.getHeight()/-2+50,
				20, 30, Color.GREEN, Color.YELLOW);
		down = new SimpleButton(Gdx.graphics.getWidth()/-2+30, Gdx.graphics.getHeight()/-2,
				20, 30, Color.GREEN, Color.YELLOW);
		right = new SimpleButton(Gdx.graphics.getWidth()/-2+50, Gdx.graphics.getHeight()/-2+30,
				30, 20, Color.GREEN, Color.YELLOW);
		left = new SimpleButton(Gdx.graphics.getWidth()/-2, Gdx.graphics.getHeight()/-2+30,
				30, 20, Color.GREEN, Color.YELLOW);
		shot = new SimpleButton(Gdx.graphics.getWidth()/2-50, Gdx.graphics.getHeight()/-2+50,
				30, 20, Color.GREEN, Color.YELLOW);
	}
	
	public ArrayList<SimpleButton> getButton(){
		ArrayList<SimpleButton> buttons = new ArrayList<SimpleButton>(5);
		buttons.add(up);
		buttons.add(down);
		buttons.add(right);
		buttons.add(left);
		buttons.add(shot);
		return buttons;
	}
}
