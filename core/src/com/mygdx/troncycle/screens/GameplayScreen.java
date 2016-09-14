package com.mygdx.troncycle.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.mygdx.troncycle.TronCycle;
import com.mygdx.troncycle.entities.Player;

public class GameplayScreen extends AbstractScreen{
	
	private Player player;
	
	
	public GameplayScreen(TronCycle game) {
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
		player.move();
	
		if(Gdx.input.isKeyJustPressed(Keys.A)){
			player.changeL();
		}
		
		if(Gdx.input.isKeyJustPressed(Keys.D)){
			player.changeR();
		}
		
		}
	}

