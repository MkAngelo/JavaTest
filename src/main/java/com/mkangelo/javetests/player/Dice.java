package com.mkangelo.javetests.player;

import java.util.Random;

public class Dice {
    private int sides;

    public Dice(int sites){
        this.sides = sites;
    }
    public int roll(){
        return new Random().nextInt(sides) + 1;
    }
}
