package com.mygdx.game;

public class controller extends Weapons {

    private int WeaponType;

    public int getWeaponType() {
        return WeaponType;
    }

    public void setWeaponType(int weaponType) {
        WeaponType = weaponType;
    }

    public void move_forward(){

    }

    public void move_backward(){

    }

    public void aim(){
        getCanonAngle();
    }

    public void fire(){
        for(Weapons w:WeaponsList){
            if(getWeaponType()==1){
                w.setNumberOfWeapon1(getNumberOfWeapon1()-1);
            }
            else if(getWeaponType()==2){
                w.setNumberOfWeapon2(getNumberOfWeapon2()-1);
            }
            else if(getWeaponType()==3){
                w.setNumberOfWeapon3(getNumberOfWeapon3()-1);
            }
        }
    }

}
