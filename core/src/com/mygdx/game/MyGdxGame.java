package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.awt.*;

public class MyGdxGame extends Game {
	SpriteBatch batch2;
	SpriteBatch batch;
	SpriteBatch batch1;
	Texture img;
	BitmapFont font;
	BitmapFont font1;
	BitmapFont font2;




	@Override
	public void create  () {
		batch = new SpriteBatch();
		batch1 = new SpriteBatch();
		batch2 = new SpriteBatch();
		font = new BitmapFont();
		font1 = new BitmapFont();
		font2 = new BitmapFont();
		WelcomePage w1 = new WelcomePage(this);
		this.setScreen(w1);
//		img = w1.getBackgroundTexture();


	}


	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		batch1.dispose();
//		img.dispose();
	}
}
