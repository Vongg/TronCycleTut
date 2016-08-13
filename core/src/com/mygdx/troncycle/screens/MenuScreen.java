package com.mygdx.troncycle.screens;

import com.mygdx.troncycle.TronCycle;
import com.mygdx.troncycle.entities.Player;

public class MenuScreen extends AbstractScreen{
	
	private com.mygdx.troncycle.entities.Player player;

	public MenuScreen(TronCycle game) {
		super(game);
		init();
	}

	private void init() {
		initPlayer();
	}

	private void initPlayer() {
		player = new Player();
		stage.addActor(player);
	}
	
	@Override
	public void render(float delta) {
		super.render(delta);
		update();
		
		spriteBatch.begin();
		stage.draw();
		spriteBatch.end();
	}

	private void update() {
		stage.act();
	}

}