package com.mygdx.game;

import java.util.ArrayList;

public class Weapons extends Canon{

    final int NumberofWeapons = 3;

    final String Weapon1 = "Missile";
    final String Weapon2 = "Bomb";
    final String Weapon3 = "Rocket";

    public int getNumberofWeapons() {
        return NumberofWeapons;
    }

    public String getWeapon1() {
        return Weapon1;
    }

    public String getWeapon2() {
        return Weapon2;
    }

    public String getWeapon3() {
        return Weapon3;
    }

    private int NumberOfWeapon1;
    private int NumberOfWeapon2;
    private int NumberOfWeapon3;
    ArrayList<Weapons> WeaponsList = new ArrayList<>();

    public int getNumberOfWeapon1() {
        return NumberOfWeapon1;
    }

    public void setNumberOfWeapon1(int numberOfWeapon1) {
        NumberOfWeapon1 = numberOfWeapon1;
    }

    public int getNumberOfWeapon2() {
        return NumberOfWeapon2;
    }

    public void setNumberOfWeapon2(int numberOfWeapon2) {
        NumberOfWeapon2 = numberOfWeapon2;
    }

    public int getNumberOfWeapon3() {
        return NumberOfWeapon3;
    }

    public void setNumberOfWeapon3(int numberOfWeapon3) {
        NumberOfWeapon3 = numberOfWeapon3;
    }
}
