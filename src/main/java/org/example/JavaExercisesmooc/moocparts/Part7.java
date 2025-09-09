package org.example.JavaExercisesmooc.moocparts;

import java.util.Arrays;
import java.util.Scanner;

public class Part7 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        exercise1(sc);
//        int[] numbers = {6, 5, 8, 7, 11, 3};
//        System.out.println("Smallest: " + smallest(numbers));

//        int[] numbers = {6, 5, 8, 7, 11};
//        System.out.println("Index of the smallest number: " + indexOfSmallest(numbers));

//        int[] numbers = {-1, 6, 9, 8, 12};
//        System.out.println(indexOfSmallestFrom(numbers, 0));
//        System.out.println(indexOfSmallestFrom(numbers, 1));
//        System.out.println(indexOfSmallestFrom(numbers, 2));
//        int[] numbers = {3, 2, 5, 4, 8};
//        System.out.println(Arrays.toString(numbers));
//        swap(numbers, 1, 0);
//        System.out.println(Arrays.toString(numbers));
//        swap(numbers, 0, 3);
//        System.out.println(Arrays.toString(numbers));
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        sort(numbers);
    }

    public static void sort(int[] array) {
        int smallest = 0;

        for(int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array));
            swap(array, i, indexOfSmallestFrom(array, i));
        }

    }

    public static void swap(int[] array, int index1, int index2) {
        int  holdValue = array[index1];
        array[index1] = array[index2];
        array[index2] = holdValue;
    }

    private  void exercise1(Scanner sc) {
        Container firstContainer = new Container();
        Container secondContainer = new Container();
        String command = "";
        String container = "";
        int amountOfLiters = 0;
        boolean menuLoop = true;
        while (menuLoop) {
            try {
                System.out.println("Enter command input like {Add ContainerName Amount}, {Move ContainerName Amount }, {Remove ContainerName Amount} ");
                String input = sc.nextLine();
                String parts[] = input.split(" ");
                if (parts.length == 1 && parts[0].equals("quit")) {
                    menuLoop = false;
                } else {
                    command = parts[0].toLowerCase();
                    container = parts[1].toLowerCase();
                    amountOfLiters = Integer.parseInt(parts[2]);
                }


                switch (command) {
                    case "add":
                        firstContainer.addLiters(amountOfLiters);

                        System.out.println("Container" + " one has: " + firstContainer.getVolumeLiters() + " liters");
                        System.out.println("Container" + " second has: " + secondContainer.getVolumeLiters() + " liters");
                        break;
                    case "move":
                        firstContainer.moveThisToOther(amountOfLiters, secondContainer);
                        System.out.println("Container" + " one has: " + firstContainer.getVolumeLiters() + " liters");
                        System.out.println("Container" + " second has: " + secondContainer.getVolumeLiters() + " liters");
                        break;
                    case "remove":
                        firstContainer.removeLiters(amountOfLiters);
                        System.out.println("Container" + " one has: " + firstContainer.getVolumeLiters() + " liters");
                        System.out.println("Container" + " second has: " + secondContainer.getVolumeLiters() + " liters");
                        break;
                    case "quit":
                        break;
                    default:
                        if (menuLoop == false) {
                            System.out.println("Bye");
                        } else {
                            System.out.println("Wrong Command");
                        }
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Wrong input");
            }

        }


    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int index = 0;

        for(int i = startIndex; i < table.length; i++){
            if(smallest >= table[i]){
                smallest = table[i];
                index = i;
            }
        }
        return index;    }

    public static int indexOfSmallest(int[] array){
        int smallest = array[0];
        int index = 0;

        for(int i = 1; i < array.length; i++){
            if(smallest >= array[i]){
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }


    public static int smallest(int[] array){
    int smallest = array[0];

    for(int i = 1; i < array.length; i++){
        if(smallest >= array[i]){
            smallest = array[i];
        }
    }
       return smallest;
    }
}
 class Container {
    private int volumeLiters;
    private final int maxLiterSize = 100;

    public Container() {
        this.volumeLiters = 0;
    }

    private int getMaxLiterSize() {
        return maxLiterSize;
    }

    public int getVolumeLiters() {
        return volumeLiters;
    }

    private void setVolumeLiters(int volumeLiters) {
        this.volumeLiters = volumeLiters;
    }

    public void addLiters(int amount) {
        if (amount < 0) {
            System.out.println("Amount cant be negative ");
        }
        if (getVolumeLiters() + amount < maxLiterSize) {
            setVolumeLiters(getVolumeLiters() + amount);
        } else {
            System.out.println("Cant add that amount it exceeds 100 liters");
        }
    }

    public void moveThisToOther(int amount, Container otherContainer) {
        if (this.getVolumeLiters() >= amount) {
            this.removeLiters(amount);
            otherContainer.addLiters(amount);
        } else {
            System.out.println("Not enough");
        }

    }

    public void removeLiters(int amount) {
        if (amount <= 0) {
            System.out.println("Amount cant be negative or 0 ");
        }

        if (amount <= getVolumeLiters()) {
            setVolumeLiters(getVolumeLiters() - amount);
        } else {
            System.out.println("Cant remove that amount of liters");
        }
    }
}