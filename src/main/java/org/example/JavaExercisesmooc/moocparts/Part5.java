package org.example.JavaExercisesmooc.moocparts;

public class Part5 {
    public static void main(String[] args) {
//        timetTest();
//        testCubeExercise();
//        testFitbyte();
//        testConstructorOverload();
//        testCounterP5();
//        healthPersonExercise();
//        testPaymentCardEx2();
    testPaymentTerminal();
    }

    private static void testPaymentTerminal() {
        PaymentTerminal unicafeExactum = new PaymentTerminal();

        double change = unicafeExactum.eatAffordably(10);
        System.out.println("remaining change " + change);

        change = unicafeExactum.eatAffordably(5);
        System.out.println("remaining change " + change);

        change = unicafeExactum.eatHeartily(4.3);
        System.out.println("remaining change " + change);

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

class PaymentTerminal {
    private double money;
    private int affordableMeals;
    private int heartyMeals;

    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        double cost = 2.50, change = 0;
        if (payment < cost) {
            System.out.println("No meal is sold you don't have enough");
            return payment;
        } else {
            this.money += cost;
            affordableMeals++;
            return payment - cost;

        }

        // increase the amount of cash by the price of an affordable meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        double cost = 4.30, change = 0;

        if (payment < cost) {
            System.out.println("No meal is sold you don't have enough");
            return payment;
        } else {
            this.money += cost;
            heartyMeals++;
            return payment - cost;

        }
        // increase the amount of cash by the price of a hearty meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
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
        this.balance = this.balance + increase;
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

class Person {

    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name) {
        this(name, 0, 0, 0);
    }

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
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
    public String toString() {
        return this.name + ", age " + this.age + " years";
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
