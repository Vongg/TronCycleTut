package com.mygdx.troncycle;

import com.mygdx.troncycle.screens.SplashScreen;

import com.badlogic.gdx.Game;

public class TronCycle extends Game {
	
	public final static String GAME_NAME = "Tron Cycle";
	
	public final static int WIDTH = 800;
	public final static int HEIGHT = 400;
	
	private boolean paused;
	
	
	@Override
	public void create () {
		this.setScreen(new SplashScreen(this));
	}

	/**
	 * ---------------------
	 * getters and setters
	 * 
	 */

	public boolean isPaused() {
		return paused;
	}

	public void setPaused(boolean paused) {
		this.paused = paused;
	}
}