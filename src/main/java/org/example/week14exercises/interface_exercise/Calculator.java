package org.example.week14exercises.interface_exercise;

public class Calculator implements ICalculatorExercise {
    private double sum;


    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    @Override
    public double addition() {
        return 0;
    }

    @Override
    public double multiplication() {
        return 0;
    }

    @Override
    public double division() {
        return 0;
    }

    @Override
    public double subtraction() {
        return 0;
    }

    @Override
    public double calculate() {
        return ICalculatorExercise.super.calculate();
    }
}
