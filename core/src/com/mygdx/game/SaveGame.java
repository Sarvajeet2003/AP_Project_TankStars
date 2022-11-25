package com.mygdx.game;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class SaveGame{

    ArrayList<Users> playerList = new ArrayList<>();
    public void SaveTheGame(Users u1){
        this.playerList.add(u1);
    }

    public void WriteToFile() throws Exception {

        FileInputStream fs = new FileInputStream("SavedGame.txt");
        FileOutputStream fo = new FileOutputStream("Games.txt");
        int temp = fs.read();
        while(temp!=-1){
            fo.write((byte) temp);
            temp = fs.read();
        }
    }

}
