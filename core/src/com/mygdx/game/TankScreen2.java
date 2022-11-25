package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;

import java.awt.*;

public class TankScreen2 implements Screen {

    TankScreen1 welcome;
    WelcomePage wpage;
    MyGdxGame game;
    OrthographicCamera camera;
    private Music BackGroundMusic;
    private Sound Click;
    private Texture Tank1;
    private Texture Left;
    private Texture Right;

    public Texture getLeft() {
        return Left;
    }

    public void setLeft(Texture left) {
        Left = left;
    }

    public Texture getRight() {
        return Right;
    }

    public void setRight(Texture right) {
        Right = right;
    }

    public TankScreen2(MyGdxGame game, TankScreen1 welcome){
        this.game = game;
        this.welcome = welcome;
        setTank1(new Texture(Gdx.files.internal("Tank2.jpeg")));
        setRight(new Texture(Gdx.files.internal("right.png")));
        setLeft(new Texture(Gdx.files.internal("left.png")));
        setClick(Gdx.audio.newSound(Gdx.files.internal("Click.mp3")));
        getClick().play();

        camera = new OrthographicCamera();
        camera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());



    }

    public MyGdxGame getGame() {
        return game;
    }

    public void setGame(MyGdxGame game) {
        this.game = game;
    }

    public Music getBackGroundMusic() {
        return BackGroundMusic;
    }

    public void setBackGroundMusic(Music backGroundMusic) {
        BackGroundMusic = backGroundMusic;
    }
    public Sound getClick() {
        return Click;
    }

    public void setClick(Sound click) {
        Click = click;
    }

    public Texture getTank1() {
        return Tank1;
    }

    public void setTank1(Texture tank1) {
        Tank1 = tank1;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0, 0, 0.2f, 1);
        camera.update();
        game.batch.setProjectionMatrix(camera.combined);
        game.batch.begin();
        game.batch.draw(getTank1(), 0,0, Gdx.graphics.getWidth(),  Gdx.graphics.getHeight());
        game.batch.draw(getLeft(), Gdx.graphics.getWidth()/2+40,Gdx.graphics.getHeight()/2-20, 60,  60);
        game.batch.draw(getRight(), Gdx.graphics.getWidth()/2+270,Gdx.graphics.getHeight()/2-20, 60,  60);
        game.batch.end();

        if (Gdx.input.isTouched() && Gdx.input.getX()>Gdx.graphics.getWidth()/2+270 && Gdx.input.getX()<Gdx.graphics.getWidth()/2+270+getRight().getWidth()/8.3 && Gdx.input.getY()<Gdx.graphics.getHeight()/2-20+getRight().getHeight()/8.3f && Gdx.input.getY()>Gdx.graphics.getHeight()/2-20){
            getClick().play();
            TankScreen3 t3 = new TankScreen3(getGame(),this);
            getGame().setScreen(t3);
        }
        if(Gdx.input.isTouched() && Gdx.input.getX()>Gdx.graphics.getWidth()/2+40 && Gdx.input.getX()<Gdx.graphics.getWidth()/2+40+getRight().getWidth()/8.3 && Gdx.input.getY()<Gdx.graphics.getHeight()/2-20+getRight().getHeight()/8.3f && Gdx.input.getY()>Gdx.graphics.getHeight()/2-20){
            getClick().play();
            TankScreen1 t3 = new TankScreen1(getGame(),wpage);
            getGame().setScreen(t3);
        }
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        getClick().dispose();
        getTank1().dispose();
    }
}
