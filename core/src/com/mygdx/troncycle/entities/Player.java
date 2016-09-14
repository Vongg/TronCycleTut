package com.mygdx.troncycle.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;


/**
 * @author Mateusz
 *
 */

/**
 * @author Mateusz
 *
 */
public class Player extends Image{

	private final static int WIDHT = 5;
	private final static int HEIGHT = 5;
	
	public static int STARTING_X = 350;
	public static int STARTING_Y = 240;
	
	public static int X = 2;
	public static int Y = 0;
	
	
	
	public Player(){
		super(new Texture("badlogic.jpg"));
		
		this.setOrigin(WIDHT / 2, HEIGHT / 2);
		this.setSize(WIDHT, HEIGHT);
		
		// starting position
		this.setPosition(STARTING_X, STARTING_Y);
	}	
	
	public void move(){
		Action start = Actions.moveBy(X, Y);
		
		this.addAction(start);
	}
	
	public void changeL() {
		switch(X){
		case 2:
			X = 0;
			Y = 2;
			break;
		case -2:
			X = 0;
			Y = -2;
			break;
		case 0:
			switch(Y) {
			case 2:
				X = -2;
				Y = 0;
				break;
			case -2:
				X = 2;
				Y =0;
				break;
			}
		
		}
		
	}
	
	public void changeR() {
		switch(X){
		case 2:
			X = 0;
			Y = -2;
			break;
		case -2:
			X = 0;
			Y = 2;
			break;
		case 0:
			switch(Y) {
			case 2:
				X = 2;
				Y = 0;
				break;
			case -2:
				X = -2;
				Y =0;
				break;
			}
		
		}
		
	}
	
		
}