package org.example.JavaExercisesmooc.moocparts;

public class Part5 {
    public static void main(String[] args) {
//        timetTest();
//        testCubeExercise();
//        testFitbyte();
        testConstructorOverload();
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
