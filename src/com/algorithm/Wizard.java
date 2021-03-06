package com.algorithm;

import java.util.Random;

public class Wizard extends Creature {




    public Wizard() {
        Random rn = new Random();
        this.armour = rn.ints(1,10).findFirst().getAsInt();
        this.health = rn.ints(1,10).findFirst().getAsInt();
        this.strength = rn.ints(1,10).findFirst().getAsInt();
        this.intellect = rn.ints(1,10).findFirst().getAsInt();

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

        if(counter < 3 ){
            this.leadership *=-1;
        }

       this.startState = new Creature(this.strength, this.intellect, this.armour, this.health, this.leadership);


    }




    public Creature heal(Creature creature){
        creature.health = creature.startState.health;
        creature.armour = creature.startState.armour;
        creature.intellect = creature.startState.intellect;
        creature.strength = creature.startState.strength;

        return creature;
    }


    @Override
    public String toString() {
        return "Wizard{" +
                "strength=" + strength +
                ", intellect=" + intellect +
                ", armour=" + armour +
                ", health=" + health +
                ", leadership=" + leadership +
                '}';
    }
}
