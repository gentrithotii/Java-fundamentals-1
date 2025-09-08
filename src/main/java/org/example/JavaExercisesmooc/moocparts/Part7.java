package org.example.JavaExercisesmooc.moocparts;

import java.util.Scanner;

public class Part7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        exercise1(sc);
    }

    private static void exercise1(Scanner sc) {
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

    static class Container {
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
}
