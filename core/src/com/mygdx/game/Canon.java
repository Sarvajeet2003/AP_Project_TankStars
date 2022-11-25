package com.mygdx.game;

public class Canon {

    private int CanonAngle;
    final int CanonPower = 20;

    public int getCanonPower(){
        return CanonPower;
    }

    public int getCanonAngle() {
        return CanonAngle;
    }

    public void setCanonAngle(int canonAngle) {
        CanonAngle = canonAngle;
    }
}
