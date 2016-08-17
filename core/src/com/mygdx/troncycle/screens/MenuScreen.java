package com.mygdx.troncycle.screens;

import com.mygdx.troncycle.TronCycle;
import com.mygdx.troncycle.ui.ClickCallback;
import com.mygdx.troncycle.ui.StartOption;

public class MenuScreen extends AbstractScreen{
	
	private StartOption startOption;

	public MenuScreen(TronCycle game) {
		super(game);
		init();
	}

	private void init() {
		initStartOption();	
	}

	private void initStartOption() {
		startOption = new StartOption(new ClickCallback() {
			
			@Override
			public void onClick() {
				System.out.println("clicked");
				game.setScreen(new GameplayScreen(game));
			}
		});
		stage.addActor(startOption);
		startOption.showDialog(stage, "Start");
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