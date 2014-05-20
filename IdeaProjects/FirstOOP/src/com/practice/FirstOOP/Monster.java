package com.practice.FirstOOP;

/**
 * Created by daffancher on 5/19/14.
 */
public class Monster {

    public final String DEATH = "GAME OVER";

    private int health = 1000;
    private int attack = 100;
    private int movement = 7;
    private int xPosition = 0;
    private int yPosition = 0;
    private boolean alive = true;

    public String name = "Death Dealer";

    public int getAttack(){
        return attack;
    }

    public int getMovement(){
        return movement;
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int decreaseHealth){
        health = health - decreaseHealth;
        if (health < 0){
            alive = false;
        }
    }

    public void setHealth(double decrease){
        int intDecreaseHealth = (int) decrease;
        health = health - intDecreaseHealth;
        if (health < 0){
            alive = false;
        }

    }


    public Monster(int health, int attack, int movement){
        this.health = health;
        this.attack = attack;
        this.movement = movement;
    }


}
