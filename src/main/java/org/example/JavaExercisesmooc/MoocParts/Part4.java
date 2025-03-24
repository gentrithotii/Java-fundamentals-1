package org.example.JavaExercisesmooc.MoocParts;

public class Part4 {
    public static void main(String[] args) {
//        Account mathewsAccount = new Account("Mathews account", 16400);
//        Account myAccount = new Account("My account ", 2500);
//        System.out.println(myAccount.getBalance());
//        transferMoney(mathewsAccount, myAccount, 400);
//        myAccount.printAccountInfo();

//        Whistle duckWhistle = new Whistle("Kvaak");
//        Whistle roosterWhistle = new Whistle("Peef");
//        duckWhistle.sound();
//        roosterWhistle.sound();
//        duckWhistle.sound();

//        Product banana = new Product("Banana", 1.1, 13);
//        banana.printProduct();
//        DecreasingCounter counter = new DecreasingCounter(100);
//        counter.printValue();
//        Debt.testMortgage();
//        Song garden = new Song("In The Garden", 10910);
//        garden.printExercise();


    }

    public static void transferMoney(Account accountOne, Account accountTwo, double amountOfTransfer) {
        accountOne.withdraw(amountOfTransfer);
        accountTwo.deposit(amountOfTransfer);
    }
}

class Film {
    private String name;
    private int age;

    public Film(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name() {
        return name;
    }

    public int ageRating() {
        return age;
    }
}

class Song {
    private String name;
    private int length;

    public Song(String name, int length) {
        this.name = name;
        this.length = length;
    }

    private String name() {
        return this.name;
    }

    private int length() {
        return this.length;
    }

    public void printExercise() {
        System.out.println("The song in " + this.name() + " has a length of " + this.length() + " seconds.");
    }
}


class Debt {
    private double balance;
    private double interestRate;

    public Debt(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void printBalance() {
        System.out.println(this.balance);
    }

    public void waitOneYear() {
        this.balance = balance * interestRate;
    }

    public static void testMortgage() {
        Debt mortgage = new Debt(120000.0, 1.01);
        mortgage.printBalance();

        mortgage.waitOneYear();
        mortgage.printBalance();

        int years = 0;

        while (years < 20) {
            mortgage.waitOneYear();
            years = years + 1;
        }

        mortgage.printBalance();
    }
}

class DecreasingCounter {
    private int value;

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        if (this.value != 0) {
            this.value -= 1;
        }
    }

    public void reset() {
        this.value = 0;
    }


}

class Product {
    private double price;
    private int quantity;
    private String name;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void printProduct() {
        System.out.println(this.name + ", Price: " + this.price + ", " + quantity + " pcs");
    }
}

class Door {
    public void knock() {
        System.out.println("Who's there? ");
    }
}

class Room {

    private String code;
    private int numberOfSeats;

    public Room(String code, int numberOfSeats) {
        this.code = code;
        this.numberOfSeats = numberOfSeats;
    }

}

class Whistle {
    private String sound;

    public Whistle(String whistleSound) {
        this.sound = whistleSound;
    }

    public void sound() {
        System.out.println(this.sound);
    }
}

class Dog {

    private String name;
    private String breed;
    private int age;
}


class Account {
    private String accountName;
    private double balance;

    public Account(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > getBalance()) {
            throw new IllegalArgumentException("You don't have enough money");
        }
        double balance = getBalance();
        balance -= amount;
        setBalance(balance);
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Can't enter negative numbers");
        }
        double balance = getBalance();
        balance += amount;
        setBalance(balance);
    }

    public void printAccountInfo() {
        System.out.println("Account name: " + getAccountName() + " And the balance is: " + getBalance());
    }
}


