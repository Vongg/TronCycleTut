package com.mygdx.troncycle.screens;

import com.mygdx.troncycle.TronCycle;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.Timer;
import com.badlogic.gdx.utils.Timer.Task;

public class SplashScreen extends AbstractScreen{
	
	private Texture splashImg;

	public SplashScreen(final TronCycle game) {
		super(game);
		init();
		
		Timer.schedule(new Task() {
			@Override
			public void run() {
				game.setScreen(new MenuScreen(game));
			}
		}, 1);
	}

	private void init() {
		// TODO implement better assets loading when game grows
		splashImg = new Texture("intro.png");
	}
	
	@Override
	public void render(float delta) {
		super.render(delta);
		
		spriteBatch.begin();
		spriteBatch.draw(splashImg, 0, 0);
		spriteBatch.end();
	}

	

}