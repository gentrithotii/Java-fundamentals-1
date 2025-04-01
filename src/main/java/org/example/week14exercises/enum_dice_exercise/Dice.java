package org.example.week14exercises.enum_dice_exercise;

import java.util.Random;

public enum Dice {
    D6(6),
    D10(10),
    D20(20),
    D100(100);


    private final int maxValue;


    private Dice(int maxValue) {
        this.maxValue = maxValue;
    }


    public int getMaxValue() {
        return maxValue;
    }

    public int roll() {

        return (int) (Math.random() * getMaxValue()) + 1;

    }

}
