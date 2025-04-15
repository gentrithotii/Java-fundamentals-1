package org.example.JavaExercisesmooc.moocparts;

import java.awt.*;
import java.nio.file.Paths;
import java.util.*;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class Part4FilesAndData {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);


//        numberOfString(userInput);
//        cubes(userInput);
//        printSpecifiedFile(userInput);
//        guestListFromFile(userInput);
//        isItInFile(userInput);
//        readingNumbersFromFile(userInput);
//        List<Person> personList = StoringRecords.readRecordsFromFilePerson(userInput);
//        System.out.println(Collections.singletonList(personList));
        StoringRecords.sportStatistics(userInput);
    }

    static class StoringRecords {

        public static void sportStatistics(Scanner sc) {
            int gamesPlayed = 0, wins = 0, losses = 0;

            System.out.print("Enter the name of the file: ");
            String userRequestFile = sc.nextLine();
            System.out.println("\n");

            System.out.print("What team: ");
            String userTeamRequest = sc.nextLine();

            try (Scanner fileScanner = new Scanner(Paths.get("filesforexercises/" + userRequestFile))) {
                while (fileScanner.hasNextLine()) {
                    String[] splitString = fileScanner.nextLine().split(",");
                    if (splitString[0].equals(userTeamRequest) || splitString[1].equals(userTeamRequest)) {
                        String homeTeam = splitString[0];
                        String visitTeam = splitString[1];
                        gamesPlayed++;
                        if (homeTeam.equals(userTeamRequest) && Integer.parseInt(splitString[2]) > Integer.parseInt(splitString[3])) {
                            wins++;
                        } else if (visitTeam.equals(userTeamRequest) && Integer.parseInt(splitString[3]) > Integer.parseInt(splitString[2])) {
                            wins++;
                        } else {
                            losses++;
                        }
                    }

                }
                System.out.println("Games: " + gamesPlayed);
                System.out.println("Wins: " + wins);
                System.out.println("Losses: " + losses);
            } catch (Exception e) {
                System.out.println("File not found!");

            }
        }

        public static List<Person> readRecordsFromFilePerson(Scanner sc) {
            System.out.print("Enter the name of the file: ");
            String userRequestFile = sc.nextLine();

            List<Person> personList = new ArrayList<>();

            try (Scanner fileScanner = new Scanner(Paths.get("filesforexercises/" + userRequestFile))) {
                while (fileScanner.hasNextLine()) {
                    String[] splitStringLine = fileScanner.nextLine().split(",");
                    personList.add(new Person(splitStringLine[0], Integer.parseInt(splitStringLine[1])));
                }
                return personList;
            } catch (Exception e) {
                System.out.println("File not found!");
                return null;
            }
        }
    }

    static class Person {
        private String name;
        private Integer age;

        public Person(String name, Integer age) {
            setName(name);
            setAge(age);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
        }
    }


    public static void readingNumbersFromFile(Scanner sc) {
        System.out.print("File? ");
        String userFileName = sc.nextLine();
        int counter = 1;
        while (true) {
            System.out.println("Your gone enter lower and upper bound");
            System.out.print("Enter lower bound:  ");
            String lowerBound = sc.nextLine();
            System.out.println("\n");
            System.out.print("Enter upper bound: ");
            String upperBound = sc.nextLine();

            try (Scanner fileScanner = new Scanner(Paths.get("filesforexercises/" + userFileName))) {
                while (fileScanner.hasNextLine()) {
                    int rowInt = Integer.parseInt(fileScanner.nextLine());
                    if (rowInt >= Integer.parseInt(lowerBound) && rowInt <= Integer.parseInt(upperBound)) {
                        counter++;
                    }
                }

                System.out.println("Numbers: " + counter);
                break;
            } catch (Exception e) {
                System.out.println("File has not been found!");
            }

        }

    }

    public static void isItInFile(Scanner sc) {
        System.out.print("Enter the file name that you want to read: ");
        String userInput = sc.nextLine();
        while (true) {
            System.out.print("Enter the name you want to find: ");
            String userName = sc.nextLine();
            if (userName.isEmpty()) {
                break;
            }

            boolean isFound = false;

            try (Scanner scReadFile = new Scanner(Paths.get("filesforexercises/" + userInput))) {
                while (scReadFile.hasNextLine()) {
                    String line = scReadFile.nextLine();
                    if (line.equals(userName)) {
                        isFound = true;
                        break;
                    }
                }
                System.out.println(isFound ? "Item found" : "Not found");

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }


    }


    public static void guestListFromFile(Scanner sc) {
        System.out.print("Enter the file name: ");
        String userFileName = sc.nextLine();

        while (true) {
            System.out.print("Enter the name you want to find: ");
            String userName = sc.nextLine();
            if (userName.isEmpty()) {
                break;
            }

            boolean isFound = false;

            try (Scanner scReadFile = new Scanner(Paths.get("filesforexercises/" + userFileName))) {
                while (scReadFile.hasNextLine()) {
                    String line = scReadFile.nextLine();
                    if (line.equals(userName)) {
                        isFound = true;
                        break;
                    }
                }
                System.out.println(isFound ? "Item found" : "Not found");

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Thank you");
    }


    public static void searchForNameInFile(String userInput) {
        try (Scanner sc = new Scanner(Paths.get("filesforexercises/" + userInput))) {

            while (sc.hasNextLine()) {
                String row = sc.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    public static void printSpecifiedFile(Scanner sc) {
        System.out.print("Enter the file name that you want to read: ");
        String userInput = sc.nextLine();

        printingAFile(userInput);
    }

    public static void printingAFile(String userInput) {
        try (Scanner sc = new Scanner(Paths.get("filesforexercises/" + userInput))) {

            while (sc.hasNextLine()) {
                String row = sc.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void cubes(Scanner sc) {

        while (true) {
            System.out.print("Enter the number you want to Cube: ");
            String userInput = sc.nextLine();

            if (userInput.equals("end")) {
                break;
            }

            int userNumber = Integer.parseInt(userInput);
            System.out.println(cubeNumber(userNumber));
        }
    }

    public static int cubeNumber(int a) {
        return a * a * a;
    }

    public static void numberOfString(Scanner sc) {
        int stringCounter = 0;

        while (true) {

            System.out.print("Enter strings they will be counted: ");
            String userInput = sc.nextLine();


            if (userInput.equals("end")) {
                break;
            }

            stringCounter++;
        }

        System.out.println(stringCounter);
    }
}
