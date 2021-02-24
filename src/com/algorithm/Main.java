package com.algorithm;

import com.sun.source.tree.Tree;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Wizard wizard1 = new Wizard();
        Troll troll1 = new Troll();
        Troll troll2 = new Troll();

        System.out.println("Wizard: " + wizard1.toString());
        wizard1 = (Wizard) troll1.attack(wizard1);
        System.out.println("Wizard(after atack): " + wizard1.toString());
        wizard1 = (Wizard) wizard1.heal(wizard1);
        System.out.println("Wizard(after Heal()): " + wizard1.toString());



        System.out.println("Troll: " + troll2.toString());
        troll2 = (Troll) troll1.attack(troll2);
        System.out.println("Troll (after atack): " + troll2.toString());
        troll2 = (Troll) wizard1.heal(troll2);
        System.out.println("Troll(after Heal()): " + troll2.toString());


    }
}
