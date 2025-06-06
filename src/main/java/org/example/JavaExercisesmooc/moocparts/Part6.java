package org.example.JavaExercisesmooc.moocparts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Part6 {
    public static void main(String[] args) {
//        testSuitCase();
        testSuitcaseWithMaxWeight();
    }

    public static void testSuitcaseWithMaxWeight() {
        ItemEX2 book = new ItemEX2("Lord of the rings", 2);
        ItemEX2 phone = new ItemEX2("Nokia 3210", 1);
        ItemEX2 brick = new ItemEX2("brick", 4);

        Suitcase suitcase = new Suitcase(5);
        System.out.println(suitcase);

        suitcase.addItem(book);
        System.out.println(suitcase);

        suitcase.addItem(phone);
        System.out.println(suitcase);

        suitcase.addItem(brick);
        System.out.println(suitcase);
    }

    public static void testSuitCase() {
        ItemEX2 book = new ItemEX2("The lord of the rings", 2);
        ItemEX2 phone = new ItemEX2("Nokia 3210", 1);

        System.out.println("The book's name: " + book.getName());
        System.out.println("The book's weight: " + book.getWeight());

        System.out.println("Book: " + book);
        System.out.println("Phone: " + phone);
    }


}

class Suitcase {
    private int maximumWeight;
    private List<ItemEX2> items;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(ItemEX2 item) {
        int currentweight = 0;

        for (ItemEX2 listItem : items) {
            currentweight += listItem.getWeight();
        }

        int test = currentweight + item.getWeight();

        if (test > maximumWeight) {
            System.out.println("Cant add more");
        } else {
            items.add(item);
        }
    }

    public String differentString() {
        if (items.size() == 0) {
            return "no items ";
        } else if (items.size() == 1) {
            return "item ";
        }
        return "items ";
    }

    private int getWeight() {
        int weight = 0;
        for (ItemEX2 item : items) {
            weight += item.getWeight();
        }
        return weight;
    }

    @Override
    public String toString() {
        if (items.size() == 0) {
            return differentString();
        }
        return items.size()+ " " + differentString() + " (" + getWeight() + " kg)";
    }
}

class ItemEX2 {
    private String name;
    private int weight;

    public ItemEX2(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}

