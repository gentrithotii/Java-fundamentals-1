package org.example.JavaExercisesmooc.moocparts;

import java.util.*;

public class Part6 {
    public static void main(String[] args) {
//        testSuitcase();
//        testSuitcaseWithMaxWeight();
//        testSuitcaseP4();
//        testSuitcaseP5();
//        testSuitcaseP6();
//        testSuitcaseP7();
//        testSimpleDictionary();
//        testSimpleDictionaryP2();
//        testSimpleDictionaryP3();
        testJokeP1();
    }

    public static void testJokeP1() {
        JokeManager manager = new JokeManager();
        manager.addJoke("What is red and smells of blue paint? - Red paint.");
        manager.addJoke("What is blue and smells of red paint? - Blue paint.");

        System.out.println("Drawing jokes:");
        for (int i = 0; i < 5; i++) {
            System.out.println(manager.drawJokes());
        }

        System.out.println("");
        System.out.println("Printing jokes:");
        manager.printJokes();
    }

    public static void testSimpleDictionaryP3() {
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();

        TextUI textUI = new TextUI(scanner, dictionary);
        textUI.start();
    }

    public static void testSimpleDictionaryP2() {
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();

        TextUI ui = new TextUI(scanner, dictionary);
        ui.start();
    }

    public static void testSimpleDictionary() {
        SimpleDictionary book = new SimpleDictionary();
        book.add("one", "yksi");
        book.add("two", "kaksi");

        System.out.println(book.translate("one"));
        System.out.println(book.translate("two"));
        System.out.println(book.translate("three"));
    }

    public static void testSuitcaseP7() {
        ItemEX2 book = new ItemEX2("Lord of the rings", 2);
        ItemEX2 phone = new ItemEX2("Nokia 3210", 1);
        ItemEX2 brick = new ItemEX2("brick", 4);

        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
    }

    public static void testSuitcaseP6() {
        ItemEX2 book = new ItemEX2("Lord of the rings", 2);
        ItemEX2 phone = new ItemEX2("Nokia 3210", 1);
        ItemEX2 brick = new ItemEX2("brick", 4);

        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println(hold);
    }

    public static void testSuitcaseP5() {
        ItemEX2 book = new ItemEX2("Lord of the rings", 1);
        ItemEX2 phone = new ItemEX2("Nokia 3210", 2);
        ItemEX2 brick = new ItemEX2("Brick", 4);

        Suitcase suitcase = new Suitcase(10);
        suitcase.addItem(book);
        suitcase.addItem(phone);
        suitcase.addItem(brick);

        ItemEX2 heaviest = suitcase.heaviestItem();
        System.out.println("Heaviest item: " + heaviest);
    }

    public static void testSuitcaseP4() {
        ItemEX2 book = new ItemEX2("Lord of the rings", 2);
        ItemEX2 phone = new ItemEX2("Nokia 3210", 1);
        ItemEX2 brick = new ItemEX2("brick", 4);

        Suitcase suitcase = new Suitcase(10);
        suitcase.addItem(book);
        suitcase.addItem(phone);
        suitcase.addItem(brick);

        System.out.println("The suitcase contains the following items:");
        suitcase.printItems();
        System.out.println("Total weight: " + suitcase.getCurrentTotalWeight() + " kg");
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

    public static void testSuitcase() {
        ItemEX2 book = new ItemEX2("The lord of the rings", 2);
        ItemEX2 phone = new ItemEX2("Nokia 3210", 1);

        System.out.println("The book's name: " + book.getName());
        System.out.println("The book's weight: " + book.getWeight());

        System.out.println("Book: " + book);
        System.out.println("Phone: " + phone);
    }


}

class JokeManager {
    private List<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        jokes.add(joke);
    }

    public String drawJokes() {
        int randomNum = (int) (Math.random() * jokes.size());
        String joke = jokes.get(randomNum);
        return joke;
    }

    public void printJokes() {
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}

class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String userInput = scanner.nextLine();

            if (userInput.equals("add")) {
                System.out.print("Word to add: ");
                String userWord = scanner.nextLine();
                System.out.print("Word translation: ");
                String wordTranslation = scanner.nextLine();

                simpleDictionary.add(userWord, wordTranslation);
            } else if (userInput.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (userInput.equals("search")) {
                System.out.print("Enter the user word to translate: ");
                String userWordToTranslate = scanner.nextLine();
                String wordFound = simpleDictionary.translate(userWordToTranslate);
                if (wordFound == null) {
                    System.out.println("Word " + userWordToTranslate + " was not found");
                } else {
                    System.out.println(wordFound);
                }
            } else {
                System.out.println("Unknown command");
            }

        }
    }

}

class SimpleDictionary {
    private String word;
    private String wordTranslation;
    private Map<String, String> wordTranslateToList;

    public SimpleDictionary() {
        this.wordTranslateToList = new HashMap<>();
    }

    public void add(String word, String wordTranslation) {
        wordTranslateToList.put(word, wordTranslation);
    }

    public String translate(String word) {
        return wordTranslateToList.get(word);
    }
}

class Hold {
    private List<Suitcase> suitcases;
    private int maxWeight;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void printItems() {
        for (Suitcase sc : suitcases) {
            sc.printItems();
        }
    }

    public int checkCurrentSuitcaseWeight() {
        int totalWeightOfAllCases = 0;
        for (Suitcase i : suitcases) {
            totalWeightOfAllCases += i.getCurrentTotalWeight();
        }
        return totalWeightOfAllCases;
    }

    public void addSuitcase(Suitcase suitcase) {
        int totalWithItemToAdd = checkCurrentSuitcaseWeight() + suitcase.getCurrentTotalWeight();
        if (totalWithItemToAdd < maxWeight) {
            suitcases.add(suitcase);
        }
    }

    @Override
    public String toString() {
        return suitcases.size() + " " +
                "suitcases (" + checkCurrentSuitcaseWeight() + " kg)";
    }
}

class Suitcase {
    private List<ItemEX2> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(ItemEX2 item) {

        int totalWeight = getCurrentTotalWeight() + item.getWeight();

        if (totalWeight > maximumWeight) {
            System.out.println("Cant add more");
        } else {
            items.add(item);
        }
    }

    public int getCurrentTotalWeight() {
        int currentweight = 0;

        for (ItemEX2 listItem : items) {
            currentweight += listItem.getWeight();
        }
        return currentweight;
    }

    public void printItems() {
        for (ItemEX2 i : items) {
            System.out.println(i.getName() + " (" + i.getWeight() + " kg)");
        }
    }

    public ItemEX2 heaviestItem() {

        ItemEX2 highest = items.get(0);

        for (int i = 0; i < items.size(); i++) {
            if (highest.getWeight() < items.get(i).getWeight()) {
                highest = items.get(i);
            }
        }

        return highest;
    }

    public String differentString() {
        if (items.size() == 0) {
            return "no items ";
        } else if (items.size() == 1) {
            return "item ";
        }
        return "items ";
    }

    @Override
    public String toString() {
        if (items.size() == 0) {
            return differentString();
        }
        return items.size() + " " + differentString() + " (" + getCurrentTotalWeight() + " kg)";
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
        return
                "name='" + name + '\'' +
                        "(" + weight + " kg)";
    }
}

