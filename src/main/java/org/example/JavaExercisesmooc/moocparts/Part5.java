package org.example.JavaExercisesmooc.moocparts;

public class Part5 {
    public static void main(String[] args) {
//        timetTest();
        testBookExercise();

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
