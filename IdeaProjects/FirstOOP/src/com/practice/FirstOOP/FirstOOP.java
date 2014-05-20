package com.practice.FirstOOP;

/**
 * Created by daffancher on 5/19/14.
 */
public class FirstOOP {
    public static void main(String[] args) {
        Monster Dillon = new Monster(100, 1980, 10);
        Monster Connor = new Monster(2000, 100, 10);

        Dillon.name = "Dillon";
        Connor.name = "Connor";

        System.out.println("Dillon attacks Connor with " + Dillon.getAttack() + " Attack points. ");
        System.out.println("Connor has" + Connor.getHealth() + " Health.");

        Connor.setHealth(Dillon.getAttack());

        System.out.println("After Dillon's attack, Connor has " + Connor.getHealth()+ " HP.");

    }
}
