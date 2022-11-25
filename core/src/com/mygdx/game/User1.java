package com.mygdx.game;

import  com.badlogic.gdx.maps.tiled.TmxMapLoader;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class User1 extends controller implements Users {

    private int Health;
    private String UserName;
    private int Fuel;
    private int Damage;
    private int Coins;
    private int WeaponSelected;
    public float getX_cord() {
        return x_cord;
    }

    public void setX_cord(float x_cord) {
        this.x_cord = x_cord;
    }

    public float getY_cord() {
        return y_cord;
    }

    public void setY_cord(float y_cord) {
        this.y_cord = y_cord;
    }

    private float x_cord;
    private float y_cord;


    public void SelectWeaponTypeAndFire(int WeaponType){
        setWeaponSelected(WeaponType);
        fire();
        setHealth(getHealth()-getCanonPower());
    }


    public int getWeaponSelected() {
        return WeaponSelected;
    }

    public void setWeaponSelected(int weaponSelected) {
        WeaponSelected = weaponSelected;
    }

    public int getCoins() {
        return Coins;
    }

    public void setCoins(int coins) {
        Coins = coins+250;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getFuel() {
        return Fuel;
    }

    public void setFuel(int fuel) {
        Fuel = fuel;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    @Override
    public void FullFuel() {
        this.setFuel(100);
    }

    @Override
    public void MinusFuel() {
        this.setFuel(this.getFuel()-10);
    }

    @Override
    public void AddCoins() {
        this.setCoins(this.getCoins()+150);
    }

    @Override
    public void HealthMinus() {
        this.setHealth(getHealth()-20);
    }

}
