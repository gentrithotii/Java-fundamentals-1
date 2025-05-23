package org.example.JavaExercisesmooc.moocparts;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Part5 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
//        timetTest();
//        testCubeExercise();
//        testFitbyte();
//        testConstructorOverload();
//        testCounterP5();
//        healthPersonExercise();
//        testPaymentCardEx2();
//        testPaymentTerminal();
//        testApartmentClass();
//        testSongClassEquals();
//        testPersonEquals();
//        testBookExerciseEx2(userInput);
        testSimpleDateAdvance();
    }

    private static void testSimpleDateAdvance() {
        SimpleDate date = new SimpleDate(13, 2, 2015);
        System.out.println("Friday of the examined week is " + date);

        SimpleDate newDate = date.afterNumberOfDays(7);
        int week = 1;
        while (week <= 7) {
            System.out.println("Friday after " + week + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);

            week = week + 1;
        }


        System.out.println("The date after 790 days from the examined Friday is ... try it out yourself!");
        System.out.println("Try " + date.afterNumberOfDays(790));
    }

    private static void testBookExerciseEx2(Scanner sc) {
        List<BookEx2> bookList = new ArrayList<>();

        while (true) {

            System.out.print("Enter the name of the Book: ");
            String bookName = sc.nextLine();

            if (bookName.isEmpty() || bookName.isBlank()) {
                break;
            }

            System.out.print("Enter the book year: ");
            int bookYear = Integer.parseInt(sc.nextLine());

            BookEx2 bookToAdd = new BookEx2(bookName, bookYear);

            if (bookList.contains(bookToAdd)) {
                System.out.println("Book already Exists cant add it");
            } else {
                bookList.add(bookToAdd);
            }
        }
        System.out.println("Thank you! Books added: " + bookList.size());
    }

    private static void testPersonEquals() {
        SimpleDate date = new SimpleDate(24, 3, 2017);
        SimpleDate date2 = new SimpleDate(23, 7, 2017);

        Person leo = new Person("Leo", date, 62, 9);
        Person lily = new Person("Lily", date2, 65, 8);

        if (leo.equals(lily)) {
            System.out.println("Is this quite correct?");
        }

        Person leoWithDifferentWeight = new Person("Leo", date, 62, 10);

        if (leo.equals(leoWithDifferentWeight)) {
            System.out.println("Is this quite correct 2?");
        }
    }

    private static void testSongClassEquals() {
        SongP5 jackSparrow = new SongP5("The Lonely Island", "Jack Sparrow", 196);
        SongP5 anotherSparrow = new SongP5("The Lonely Island", "Jack Sparrow", 196);

        if (jackSparrow.equals(anotherSparrow)) {
            System.out.println("Songs are equal.");
        }

        if (jackSparrow.equals("Another object")) {
            System.out.println("Strange things are afoot.");
        }
    }

    private static void testApartmentClass() {
        Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);

        System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));
        System.out.println(bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt));
    }

    private static void testPaymentTerminal() {
        PaymentTerminal unicafeExactum = new PaymentTerminal();
        System.out.println(unicafeExactum);

        PaymentCardEx2 annesCard = new PaymentCardEx2(2);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        unicafeExactum.addMoneyToCard(annesCard, 100);

        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        System.out.println(unicafeExactum);
    }

    private static void testPaymentCardEx2() {
        PaymentCardEx2 petesCard = new PaymentCardEx2(10);

        System.out.println("money " + petesCard.balance());
        boolean wasSuccessful = petesCard.takeMoney(8);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());

        wasSuccessful = petesCard.takeMoney(4);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());
    }

    private static void healthPersonExercise() {
        HealthStation childrensHospital = new HealthStation();

        Person ethan = new Person("Ethan", 1, 110, 7);
        Person peter = new Person("Peter", 33, 176, 85);

        System.out.println("weighings performed: " + childrensHospital.weighings());

        childrensHospital.weigh(ethan);
        childrensHospital.weigh(peter);

        System.out.println("weighings performed: " + childrensHospital.weighings());

        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);

        System.out.println("weighings performed: " + childrensHospital.weighings());
    }

    private static void testCounterP5() {
        Counter firstCounter = new Counter(2);

        firstCounter.increase();
        firstCounter.increase(5);
        System.out.println(firstCounter.value());
        firstCounter.decrease(5);
        firstCounter.decrease();
        System.out.println(firstCounter.value());
    }

    private static void testConstructorOverload() {
        ProductP5 tapeMeasure = new ProductP5("Tape measure");
        ProductP5 plaster = new ProductP5("Plaster", "home improvement section");
        ProductP5 tyre = new ProductP5("Tyre", 5);

        System.out.println(tapeMeasure);
        System.out.println(plaster);
        System.out.println(tyre);
    }

    private static void testFitbyte() {
        Fitbyte assistant = new Fitbyte(30, 75);

        double percentage = 0.5;

        while (percentage < 1.0) {
            double target = assistant.targetHeartRate(percentage);
            System.out.println("Target " + (percentage * 100) + "% of maximum: " + target);
            percentage = percentage + 0.1;
        }
    }

    private static void testCubeExercise() {
        Cube oSheaJackson = new Cube(4);
        System.out.println(oSheaJackson.volume());
        System.out.println(oSheaJackson);

        System.out.println();

        Cube salt = new Cube(2);
        System.out.println(salt.volume());
        System.out.println(salt);
    }

    private static void testBookExercise() {
        BookP5 bookP5 = new BookP5("Harry Potter and the Sorcerer's Stone", "J. K. Rowling", 223);

        System.out.println(bookP5);
    }

    private static void timetTest() {
        Timer timer = new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }
    }

}

class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void advance() {
        this.day++;
        if (this.day > 30) {
            this.month++;
            this.day = 1;
        }
        if (this.month > 12) {
            this.year++;
            this.month = 1;
        }
    }

    public void advance(int howManyDays) {
        for (int i = 0; i < howManyDays; i++) {
            advance();
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        advance(days);
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);

        return newDate;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof SimpleDate)) {
            return false;
        }

        SimpleDate comparedSimpleDate = (SimpleDate) compared;

        if (this.day == comparedSimpleDate.day &&
                this.month == comparedSimpleDate.month &&
                this.year == comparedSimpleDate.year) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}

class BookEx2 {
    private String bookName;
    private int publicationYear;

    public BookEx2(String bookName, int publicationYear) {
        this.bookName = bookName;
        this.publicationYear = publicationYear;
    }

    @Override
    public boolean equals(Object compare) {
        if (this == compare) {
            return true;
        }

        if (!(compare instanceof BookEx2)) {
            return false;
        }
        BookEx2 compareBook = (BookEx2) compare;

        if (this.bookName.equals(compareBook.bookName) && this.publicationYear == compareBook.publicationYear) {
            return true;
        }

        return false;
    }
}

class Person {

    private String name;
    private int age;
    private int weight;
    private int height;
    private Pet ownedDog;
    private SimpleDate birthDate;

    public Person(String name, Pet ownedDog) {
        this(name, 0, 0, 0);
        this.ownedDog = ownedDog;
    }

    public Person(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, int weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, SimpleDate birthDate, int weight, int height) {
        this(name, weight, height);
        this.birthDate = birthDate;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public void growOlder() {
        this.age = this.age + 1;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }

    @Override
    public boolean equals(Object compare) {
        if (this == compare) {
            return true;
        }

        if (!(compare instanceof Person)) {
            return false;
        }
        Person comparePerson = (Person) compare;
        if (this.name.equals(comparePerson.name) && this.birthDate.equals(comparePerson.birthDate) && this.weight == comparePerson.weight && this.height == comparePerson.height) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return this.name + ", has a friend called " + this.ownedDog.getDogName() + " (" + this.ownedDog.getDogRace() + ")";
    }
}

class SongP5 {
    private String songName;
    private String artist;
    private int lengthInSeconds;

    public SongP5(String songName, String artist, int lengthInSeconds) {
        this.songName = songName;
        this.artist = artist;
        this.lengthInSeconds = lengthInSeconds;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof SongP5)) {
            return false;
        }

        SongP5 compareSong = (SongP5) compared;

        if (
                this.songName.equals(compareSong.songName)
                        && this.artist.equals(compareSong.artist)
                        && this.lengthInSeconds == compareSong.lengthInSeconds) {
            return true;
        }

        return false;
    }
}

class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int thisObjectPrice = this.pricePerSquare * this.squares;
        int comparedPrice = compared.pricePerSquare * compared.squares;
        if (thisObjectPrice > comparedPrice) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int thisObjectPrice = this.pricePerSquare * this.squares;
        int comparedPrice = compared.pricePerSquare * compared.squares;
        if (thisObjectPrice > comparedPrice) {
            return thisObjectPrice - comparedPrice;
        }
        return comparedPrice - thisObjectPrice;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }
}

class Pet {
    private String dogName;
    private String dogRace;

    public Pet(String dogName, String dogRace) {
        this.dogName = dogName;
        this.dogRace = dogRace;
    }

    public String getDogRace() {
        return dogRace;
    }

    public String getDogName() {
        return dogName;
    }

}

class PaymentTerminal {

    private double money;
    private int affordableMeals;

    private int heartyMeals;

    public PaymentTerminal() {
        this.money = 1000;
    }

    public void addMoneyToCard(PaymentCardEx2 card, double sum) {
        this.money += sum;
        card.addMoney(sum);
    }

    public double eatAffordably(double payment) {
        double cost = 2.50;
        if (payment < cost) {
            System.out.println("No meal is sold you don't have enough");
            return payment;
        } else {
            this.money += cost;
            affordableMeals++;
            return payment - cost;

        }
    }

    public boolean eatAffordably(PaymentCardEx2 card) {

        double cost = 2.50;

        boolean hasTheMoney = card.takeMoney(cost);
        if (hasTheMoney) {
            affordableMeals++;
            return true;
        }


        System.out.println("No meal is sold you don't have enough");
        return false;
    }

    public boolean eatHeartily(PaymentCardEx2 card) {
        double cost = 4.30;

        boolean hasTheMoney = card.takeMoney(cost);
        if (hasTheMoney) {
            heartyMeals++;
            return true;
        }
        return false;
    }

    public double eatHeartily(double payment) {
        double cost = 4.30;

        if (payment < cost) {
            System.out.println("No meal is sold you don't have enough");
            return payment;
        } else {
            this.money += cost;
            heartyMeals++;
            return payment - cost;

        }
    }

    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }

}

class PaymentCardEx2 {

    private double balance;

    public PaymentCardEx2(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        double currentB = balance();
        this.balance += currentB + increase;
    }

    public boolean takeMoney(double amount) {
        if (amount > balance()) {
            System.out.println("Can't pull money that you don't have");
            return false;
        }
        this.balance -= amount;
        return true;
    }

}

class HealthStation {

    private int weighted;

    public int weigh(Person person) {
        weighted++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        return weighted;
    }

}

class Counter {
    private int counterNumber;


    public Counter(int counterNumber) {
        this.counterNumber = counterNumber;
    }

    public int value() {
        return this.counterNumber;
    }

    public void increase() {
        this.counterNumber += 1;
    }

    public void decrease() {
        this.counterNumber -= 1;
    }

    public void increase(int amount) {
        this.counterNumber += amount;
    }

    public void decrease(int amount) {
        this.counterNumber -= amount;
    }


}

class ProductP5 {
    private String name;
    private String location;
    private Double weight;

    public ProductP5(String name) {
        setName(name);
        setLocation("shelf");
        setWeight(1.0);

    }

    public ProductP5(String name, String location) {
        this(name);
        setLocation(location);
    }

    public ProductP5(String name, double weight) {
        this(name);
        setWeight(weight);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName() + " (" + getWeight() + " kg) can be found from the " + getLocation();
    }
}

class Fitbyte {
    private int age;
    private int restingHeartRate;

    public Fitbyte(int age, int restingHeartRate) {
        setAge(age);
        setRestingHeartRate(restingHeartRate);
    }

    public int getRestingHeartRate() {
        return restingHeartRate;
    }

    public void setRestingHeartRate(int restingHeartRate) {
        this.restingHeartRate = restingHeartRate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        return (206.3 - (0.711 * age) - getRestingHeartRate()) * (percentageOfMaximum) + getRestingHeartRate();
    }


}

class Cube {
    private int edgeLength;

    public Cube(int edgeLength) {
        setEdgeLength(edgeLength);
    }

    public int getEdgeLength() {
        return edgeLength;
    }

    public void setEdgeLength(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public int volume() {
        return getEdgeLength() * getEdgeLength() * getEdgeLength();
    }

    @Override
    public String toString() {
        return "The length of the edge is " + getEdgeLength() + " and the volume " + volume();
    }
}

class BookP5 {
    private String name;
    private String author;
    private int pages;

    public BookP5(String name, String author, int pages) {
        setName(name);
        setAuthor(author);
        setPages(pages);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        return sb.append(getAuthor()).append(", ").append(getName()).append(", ").append(getPages()).append(" pages")

                .toString();
    }
}

class Timer {
    private ClockHand hundredthsOfASecond;
    private ClockHand seconds;

    public Timer() {
        this.hundredthsOfASecond = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.hundredthsOfASecond.advance();

        if (this.hundredthsOfASecond.value() == 0) {
            this.seconds.advance();
        }
    }

    @Override
    public String toString() {
        return "Timer{" +
                "hundredthsOfASecond=" + hundredthsOfASecond +
                ", seconds=" + seconds +
                '}';
    }
}

class ClockHand {
    private int value;
    private int limit;

    public ClockHand(int limit) {
        this.limit = limit;
        this.value = 0;
    }

    public void advance() {
        this.value = this.value + 1;

        if (this.value >= this.limit) {
            this.value = 0;
        }
    }

    public int value() {
        return this.value;
    }

    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        }

        return "" + this.value;
    }
}
