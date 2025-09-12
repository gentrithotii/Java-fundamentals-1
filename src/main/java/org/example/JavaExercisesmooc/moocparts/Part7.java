package org.example.JavaExercisesmooc.moocparts;

import java.util.*;

public class Part7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
//        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
//        sort(numbers);
//        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(8, 3, 7, 9, 1, 2, 4));
//        sortIntegers(integers);
//        List<BookP7> books = new ArrayList<>(Arrays.asList(
//                new BookP7(7, "Book7"),
//                new BookP7(5, "Book5"),
//                new BookP7(6, "Book6"),
//                new BookP7(2, "Book2"),
//                new BookP7(10, "Book10"),
//                new BookP7(1, "Book1"),
//                new BookP7(4, "Book4"),
//                new BookP7(8, "Book8"),
//                new BookP7(9, "Book9"),
//                new BookP7(3, "Book3")
//        )
//        );
//
////        System.out.println(linearSearch(books, 5));
//        books.sort(Comparator.comparing(BookP7::getId));
//
//        System.out.println(binarySearch(books, 3));
        gradeStatistics(sc);
    }

    public static void gradeStatistics(Scanner sc) {
        double sum = 0;
        boolean loopi = true;
        List<Integer> grades = new ArrayList<>();
        System.out.print("Enter points totals, -1 stops: ");
        while (loopi) {
            String userInput = sc.nextLine();
            int number = Integer.parseInt(userInput);
            if (number <= 100 && number > 0) {
                grades.add(number);
            }

            if (userInput.equals("-1")) {
                loopi = false;
            }

        }
        for (Integer grade : grades) {
            sum += grade;
        }

        double average = sum / grades.size() ;
        System.out.println("Point average(all): " + average);
    }

    public static int binarySearch(List<BookP7> books, int searchedId) {
        int beginning = 0;
        int endIndex = books.size() - 1;

        while (beginning <= endIndex) {
            int middle = (beginning + endIndex) / 2;
            int currentId = books.get(middle).getId();

            System.out.println("Beginning : " + beginning);
            System.out.println("End: " + endIndex);
            System.out.println("Middle : " + middle);
            System.out.println(" ");

            if (currentId == searchedId) {
                return middle;
            } else if (currentId < searchedId) {
                beginning = middle + 1;
            } else {
                endIndex = middle - 1;
            }

        }
        return -1;
    }

    public static int linearSearch(List<BookP7> books, int searchedId) {

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == searchedId) {
                System.out.println(i);
                return i;
            }
        }

        return -1;
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        System.out.println(integers);
        Collections.sort(integers);
        System.out.println(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }

    public static void sort1(int[] array) {
        int smallest = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, i, indexOfSmallestFrom(array, i));
        }

    }

    public static void swap(int[] array, int index1, int index2) {
        int holdValue = array[index1];
        array[index1] = array[index2];
        array[index2] = holdValue;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int index = 0;

        for (int i = startIndex; i < table.length; i++) {
            if (smallest >= table[i]) {
                smallest = table[i];
                index = i;
            }
        }
        return index;
    }

    private void exercise1(Scanner sc) {
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

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (smallest >= array[i]) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }


    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (smallest >= array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }
}

class BookP7 {
    private int id;
    private String name;

    public BookP7(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BookP7{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
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