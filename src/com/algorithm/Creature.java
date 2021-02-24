package com.algorithm;

public class Creature {

    Creature startState;

    public Creature() {
    }

    public Creature(int strength, int intellect, int armour, int health, int leadership) {
        this.strength = strength;
        this.intellect = intellect;
        this.armour = armour;
        this.health = health;
        this.leadership = leadership;
    }

    int strength;
    int intellect;
    int armour;
    int health;
    //-100 100
    int leadership;

}
