package org.example.week17;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    static List<Product> productOperation(List<Product> productArrayList, IAction action, IConditional conditional) {
        List<Product> result = new ArrayList<>();
        for (Product product : productArrayList) {
            if (conditional.test(product)) {
                action.execute(product);
                result.add(product);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>(Arrays.asList(new Product("Nike pants", 42.3, 25),
                new Product("Adidas shoes", 125, 15),
                new Product("Pants Lime", 52.25, 25),
                new Product("Jacket Orange", 200, 5),
                new Product("Tablet", 432, 9),
                new Product("Pants Lime", 50, 5),
                new Product("Nokia 2026", 12, 0),
                new Product("Big Tree", 0, 0),
                new Product("Iphone 16", 1499, 90),
                new Product("Samsung s26", 1300, 3),
                new Product("Bag Orange", 700, 2),
                new Product("Remote Controller", 15.25, 0),
                new Product("Wireless Mouse", 15, 2),
                new Product("Big Bang Projector", 56.25, 0),
                new Product("Grill Knife", 145.5, 2)


        ));

        //Exercise 1
        System.out.println("Exercise - 1");

        IConditional filterWithZeroStock = (test) -> test.getStock() == 0;
        IAction printString = (p) -> System.out.println(p);

        List<Product> filteredListWithZeroAndPrint = productOperation(productList, printString, filterWithZeroStock);
//        System.out.println(filteredListWithZeroAndPrint);


        System.out.println("-----------------------------------------------------------");
        //Exercise 2
        System.out.println("Exercise - 2");

        IConditional firstLetterB = (p) -> p.getProductName().charAt(0) == 'B';

        List<Product> productsWithFirstLetterB = productOperation(productList, printString, firstLetterB);
//        System.out.println(productsWithFirstLetterB);

        System.out.println("-----------------------------------------------------------");

        //Exercise 3
        System.out.println("Exercise - 3");

        IConditional fromAmountToAmount = (p -> p.getPrice() > 100 && p.getPrice() < 150);

        List<Product> filteredWithSpecificAmount = productOperation(productList, printString, fromAmountToAmount);
//        System.out.println(filteredWithSpecificAmount);

        System.out.println("-----------------------------------------------------------");

        //Exercise 4
        System.out.println("Exercise - 4");

        IConditional stockValueFrom = (p) -> p.getStock() < 10 && p.getStock() > 0;
        IAction updatePrice = (p -> p.setPrice(p.getPrice() + (p.getPrice() / 2)));

        List<Product> addedPricesList = productOperation(productList, updatePrice, stockValueFrom);
        System.out.println(addedPricesList);

        System.out.println("-----------------------------------------------------------");

    }
}