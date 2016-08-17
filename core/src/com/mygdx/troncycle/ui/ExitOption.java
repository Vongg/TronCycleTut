package com.mygdx.troncycle.ui;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class ExitOption extends Button{

	private GameLabel label;
	
	public ExitOption(final ClickCallback callback){
		super(prepareResetButtonStyle());
		
		label = new GameLabel();
		label.setPosition(335, 270);
		
		init(callback);
	}

	private void init(final ClickCallback callback) {
		this.setWidth(100);
		this.setHeight(40);
		this.setX(300);
		this.setY(255);
		this.setDebug(true);
		
		this.addListener(new ClickListener(){
			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				callback.onClick();
				return super.touchDown(event, x, y, pointer, button);
			}
		});
	}
	
	public void showDialog(Stage stage, String text){
		stage.addActor(this);
		label.setText(text);
		this.getStage().addActor(label);
	}
	
	private static ButtonStyle prepareResetButtonStyle() {
		ButtonStyle buttonStyle = new ButtonStyle();
		
		return buttonStyle;
	} 
	
}
