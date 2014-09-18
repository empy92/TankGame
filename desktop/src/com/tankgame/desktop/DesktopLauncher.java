package com.tankgame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.tankgame.TankGame;

public class DesktopLauncher {
	
	//set your width and height screen size, change for test with your device
	public final static int SCREENWIDTH = 800;
	public final static int SCREENHEIGHT = 480;
	
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = ("TankGame Alpha");
		config.width = SCREENWIDTH;
		config.height = SCREENHEIGHT;
		new LwjglApplication(new TankGame(), config);
	}
}
