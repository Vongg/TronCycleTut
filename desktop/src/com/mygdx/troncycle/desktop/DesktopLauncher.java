package com.mygdx.troncycle.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.troncycle.TronCycle;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.title = TronCycle.GAME_NAME;
		config.width = TronCycle.WIDTH;
		config.height = TronCycle.HEIGHT;
		config.resizable = false;
		
		new LwjglApplication(new TronCycle(), config);
	}
}
