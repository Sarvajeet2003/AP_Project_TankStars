package com.mygdx.game;

import com.badlogic.gdx.*;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.utils.ScreenUtils;

public class WelcomePage implements Screen{

    MyGdxGame game;
    private Stage stage;
    private Skin skin;
    private Texture StartButton;
    private Texture ExitButton;
    private TextureRegion Start;
    private TextureRegion Exit;
    OrthographicCamera camera;
    OrthographicCamera camera1;
    OrthographicCamera camera2;
    private Sound BackgroundMusic;

    private Texture BackgroundTexture;
    private TextureRegion BackgroundTextureRegion;

    private Texture NewButton;

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public Sound getBackgroundMusic() {
        return BackgroundMusic;
    }
    public void setBackgroundMusic(Sound backgroundMusic) {
        BackgroundMusic = backgroundMusic;
    }

    public Texture getBackgroundTexture() {
        return BackgroundTexture;
    }

    public Texture getStartButton() {
        return StartButton;
    }

    public void setStartButton(Texture startButton) {
        StartButton = startButton;
    }

    public Texture getExitButton() {
        return ExitButton;
    }

    public void setExitButton(Texture exitButton) {
        ExitButton = exitButton;
    }

    public TextureRegion getStart() {
        return Start;
    }

    public void setStart(TextureRegion start) {
        Start = start;
    }

    public TextureRegion getExit() {
        return Exit;
    }

    public void setExit(TextureRegion exit) {
        Exit = exit;
    }

    public void setBackgroundTexture(Texture backgroundTexture) {
        BackgroundTexture = backgroundTexture;
    }

    public TextureRegion getBackgroundTextureRegion() {
        return BackgroundTextureRegion;
    }

    public void setBackgroundTextureRegion(TextureRegion backgroundTextureRegion) {
        BackgroundTextureRegion = backgroundTextureRegion;
    }

    public MyGdxGame getGame() {
        return game;
    }

    public void setGame(MyGdxGame game) {
        this.game = game;
    }
    public WelcomePage(MyGdxGame game){
        this.game = game;
        this.NewButton = new Texture("BGdown.png");
        setBackgroundTexture(new Texture(Gdx.files.internal("Intro.png")));
        setBackgroundTextureRegion(new TextureRegion(getBackgroundTexture(), 0, 0, 0 ,  0));
        setStartButton(new Texture(Gdx.files.internal("Start.png")));
        setStart(new TextureRegion(getBackgroundTexture(),0,0,0,0));
        setExitButton(new Texture(Gdx.files.internal("Exit.png")));
        setExit(new TextureRegion(getBackgroundTexture(),0,0,0,0));
        setBackgroundMusic(Gdx.audio.newSound(Gdx.files.internal("StartGame.mp3")));
        getBackgroundMusic().play();

        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);

        camera1 = new OrthographicCamera();
        camera1.setToOrtho(false, 800, 480);

        camera2 = new OrthographicCamera();
        camera2.setToOrtho(false, 800, 480);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

        ScreenUtils.clear(1, 0, 0, 0);
        camera.update();
        camera.setToOrtho(false, BackgroundTexture.getWidth(), BackgroundTexture.getHeight());
        camera1.update();
        camera2.update();
        game.batch.setProjectionMatrix(camera.combined);
        game.batch1.setProjectionMatrix(camera1.combined);
        game.batch2.setProjectionMatrix(camera2.combined);
        game.batch.begin();
        game.batch1.begin();
        game.batch2.begin();
        game.batch.draw(getBackgroundTexture(), 0,0, 800, 480);
        game.batch1.draw(getStartButton(), Gdx.graphics.getWidth()/2-10,140, 180, 50);
        game.batch2.draw(getExitButton(), Gdx.graphics.getWidth()/2-10,100, 180, 50);
        game.font2.draw(game.batch, "WELCOME TO TANK-STARS !!", 300, 300);
        game.batch.end();
        game.batch1.end();
        game.batch2.end();

        if (Gdx.input.isTouched() &&
                (Gdx.input.getX()>Gdx.graphics.getWidth()/2- getStartButton().getWidth()/8)
                &&  (Gdx.input.getY()<Gdx.graphics.getHeight()/2 +50 + getStartButton().getHeight()/15)
                && (Gdx.input.getY()> Gdx.graphics.getHeight()/2 +50) &&
                (Gdx.input.getX()<Gdx.graphics.getWidth()/2- getStartButton().getWidth()/8+getStartButton().getWidth()/4) ){
            
            TankScreen1 t1 =  new TankScreen1(getGame(),this);
            getBackgroundMusic().pause();
            getGame().setScreen(t1);
            dispose();
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


    }
}
