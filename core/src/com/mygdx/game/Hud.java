//package com.mygdx.game;
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.graphics.OrthographicCamera;
//import com.badlogic.gdx.graphics.g2d.BitmapFont;
//import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//import com.badlogic.gdx.scenes.scene2d.Stage;
//import com.badlogic.gdx.utils.viewport.FitViewport;
//import com.badlogic.gdx.utils.viewport.Viewport;
//import jdk.javadoc.internal.doclets.formats.html.Table;
//
//import java.awt.*;
//
//import static com.badlogic.gdx.graphics.g3d.particles.ParticleShader.AlignMode.Screen;
//
//public class Hud {
//
//    public Stage stage;
//    private Viewport viewport;
//    private Integer worldTimer;
//    private float timeCount;
//    private Integer score;
//
//    Label countdownLabel;
//    Label scoreLabel;
//    Label timeLabel;
//    Label levelLabel;
//    Label worldLabel;
//    Label marioLabel;
//
//    public Hud(SpriteBatch sb){
//        worldTimer = 300;
//        timeCount = 0;
//        score = 0;
//        viewport = new FitViewport(Gdx.graphics.getWidth(), Gdx.graphics.getWidth(), new OrthographicCamera());
//        stage = new Stage(viewport,sb);
//
//        Table table = new Table();
//        table.top();
//        table.setFillParent(true);
//
//        countdownLabel= new Label(String.format("%03d",worldTimer), new Label.LabelStyle(new BitmapFont(), Color.WHITE));
//        scoreLabel = new Label(String.format("%06d",score), new Label.LabelStyle(new BitmapFont(), Color.WHITE));
//        timeLabel= new Label("Time" , new Label.LabelStyle(new BitmapFont(), Color.WHITE));
//        levelLabel= new Label("1-1" , new Label.LabelStyle(new BitmapFont(), Color.WHITE));
//        worldLabel= new Label("World" , new Label.LabelStyle(new BitmapFont(), Color.WHITE));
//        marioLabel= new Label("Mario" , new Label.LabelStyle(new BitmapFont(), Color.WHITE));
//
//        table.add(marioLabel).expandX().padTop(10);
//        table.add(worldLabel).expandX().padTop(10);
//        table.add(timeLabel).expandX().padTop(10);
//        table.row();
//        table.add(scoreLabel).expandX();
//        table.add(levelLabel).expandX();
//        table.add(countdownLabel).expand();
//         stage.addActor(table);
//
//
//
//
//    }
//
//    public static final int V_WIDTH = 400;
//    public static final int V_HEIGHT = 208;
//    // these statements are in mariobros class
//    //gamePort = new FitViewport(MarioBros.V_WIDTH, MarioBros.V_HEIGHT,gamecam)
//    // These are in Playscreen class
//
//}
