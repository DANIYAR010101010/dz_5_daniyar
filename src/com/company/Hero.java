package com.company;

public class Hero {
    private int health;
    private int damage;
    private String supSp;

    public Hero(){

    }

    public Hero(int health, int damage, String supSp){
        this.health=health;
        this.damage=damage;
        this.supSp=supSp;

    }
    public Hero(int health,int damage){
        this.health=health;
        this.damage=damage;
    }
    public void print_info(){
        System.out.println("Health: "+this.health+"; "+"Damage: "+this.damage+"; "+"supSp: "+this.supSp);
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSupSp() {
        return supSp;
    }
}
