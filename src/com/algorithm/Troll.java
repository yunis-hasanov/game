package com.algorithm;

import java.util.Random;

public class Troll extends Creature {



    public Troll() {
        Random rn = new Random();
        this.armour = rn.ints(1,10).findFirst().getAsInt();
        this.health = rn.ints(1,10).findFirst().getAsInt();
        this.strength = rn.ints(1,10).findFirst().getAsInt();
        this.intellect =1;

        int sumAttr = this.health + this.armour + this.strength + this.intellect;

        if(sumAttr < 15){
            this.leadership = sumAttr * 100/15;
        } else{
            this.leadership = sumAttr * 100/40;
        }

        int counter = 0;

        if(this.armour < 5)
            counter++;
        if(this.health < 5)
            counter++;
        if(this.strength < 5)
            counter++;
        if(this.intellect < 5)
            counter++;

        if(counter <3 ){
            this.leadership *=-1;
        }

        this.startState = new Creature(this.strength, this.intellect, this.armour, this.health, this.leadership);
    }

    public Creature attack(Creature creature){
        if(creature.health > 1)
            creature.health--;
        return creature;
    }

    @Override
    public String toString() {
        return "Troll{" +
                "strength=" + strength +
                ", intellect=" + intellect +
                ", armour=" + armour +
                ", health=" + health +
                ", leadership=" + leadership +
                '}';
    }
}
