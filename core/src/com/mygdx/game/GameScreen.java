package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ScreenUtils;

public class GameScreen implements Screen{
    private Texture BackgroundTexture;
    private TextureRegion BackgroundTextureRegion;
    private TankScreen3 t1;
    private MyGdxGame game;
    OrthographicCamera camera;


    public GameScreen(MyGdxGame game, TankScreen3 t1){
        this.t1=t1;
        this.game=game;
        setBackgroundTexture(new Texture(Gdx.files.internal("A.png")));
        setBackgroundTextureRegion(new TextureRegion(getBackgroundTexture(),0,0,0,0));
        camera = new OrthographicCamera();
        camera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
    }


    public Texture getBackgroundTexture() {
        return BackgroundTexture;
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

    public TankScreen3 getT1() {
        return t1;
    }

    public void setT1(TankScreen3 t1) {
        this.t1 = t1;
    }

    public MyGdxGame getGame() {
        return game;
    }

    public void setGame(MyGdxGame game) {
        this.game = game;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(1, 0, 0, 0);
        camera.update();
        camera.setToOrtho(false, BackgroundTexture.getWidth(), BackgroundTexture.getHeight());
        game.batch.begin();
        game.batch.draw(getBackgroundTexture(), 0,0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        game.batch.end();

        if (Gdx.input.isTouched()){

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




























//    private OrthographicCamera gamecam;
//    private Viewport gamePort;
////    private Hud hud;
//    private TmxMapLoader mapLoader;
//    private TiledMap map;
//    private OrthogonalTiledMapRenderer renderer;
//    TankScreen Sgame;
//    MyGdxGame game;
//    public GameScreen(MyGdxGame game,TankScreen Sgame){
//        this.game = game;
//        this.Sgame = Sgame;
//        setGamecam(new OrthographicCamera());
//        setGamePort(new FitViewport(Gdx.graphics.getWidth(),Gdx.graphics.getHeight(),getGamecam()));
////        setHud(new Hud(game.batch));
//        setMapLoader(new TmxMapLoader());
//        setMap(getMapLoader().load("untitled.tmx"));
//        setRenderer(new OrthogonalTiledMapRenderer(getMap()));
//        getGamecam().position.set(getGamePort().getScreenWidth()/2,getGamePort().getScreenHeight()/2,0);
//    }
//    public void update(float dt){
//        handleInput(dt);
//
//        getGamecam().update();
//        getRenderer().setView(getGamecam());
//    }
//
//    @Override
//    public void render(float delta) {
//        update(delta);
//        Gdx.gl.glClearColor(0,0,0,1);
//        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//
//        getRenderer().render();
////        game.batch.setProjectionMatrix(hud.stage.getCamera().combined);
////        hud.stage.draw();
//    }
//
//    private void handleInput(float dt) {
//        if(Gdx.input.isTouched()){
//            getGamecam().position.x+=100*dt;
//        }
//    }
//
//    public OrthographicCamera getGamecam() {
//        return gamecam;
//    }
//
//    public void setGamecam(OrthographicCamera gamecam) {
//        this.gamecam = gamecam;
//    }
//
//    public Viewport getGamePort() {
//        return gamePort;
//    }
//
//    public void setGamePort(Viewport gamePort) {
//        this.gamePort = gamePort;
//    }
//    public TmxMapLoader getMapLoader() {
//        return mapLoader;
//    }
//
//    public void setMapLoader(TmxMapLoader mapLoader) {
//        this.mapLoader = mapLoader;
//    }
//
//    public TiledMap getMap() {
//        return map;
//    }
//
//    public void setMap(TiledMap map) {
//        this.map = map;
//    }
//
//    public OrthogonalTiledMapRenderer getRenderer() {
//        return renderer;
//    }
//
//    public void setRenderer(OrthogonalTiledMapRenderer renderer) {
//        this.renderer = renderer;
//    }
//
//    @Override
//    public void show() {
//
//    }
//    @Override
//    public void resize(int width, int height) {
//
//    }
//
//    @Override
//    public void pause() {
//
//    }
//
//    @Override
//    public void resume() {
//
//    }
//
//    @Override
//    public void hide() {
//
//    }
//
//    @Override
//    public void dispose() {
//
//    }
//}
