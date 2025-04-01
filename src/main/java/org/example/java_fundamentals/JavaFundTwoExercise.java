package org.example.java_fundamentals;

public class JavaFundTwoExercise {
    public static void main(String[] args) {
        String exercize1String = "Java";
        System.out.println(exercize1String.length());

        String indexPosition = "Long example sentence";
        System.out.println(indexPosition.indexOf("x"));

        String subStringText = "Ok this is not as long!";

        System.out.println(subStringText.substring(10, 22));

        String capsText = "CAPS EQUALS SCREAMING";
        System.out.println(capsText.toLowerCase());
        System.out.println(capsText.toUpperCase());

        String badStatement = "Java is the worst programming language!";
        System.out.println(badStatement.replaceAll("worst", "best"));

        String tabInsert = "\tJ\ta\tv\ta\t";
        System.out.println(tabInsert);
        System.out.println(tabInsert.trim());

        int intToBeParsedToString = 20;
        String twentyString = "20";
        twentyString += Integer.toString(intToBeParsedToString);
        System.out.println(twentyString);

        String oilAndWaterDoNotMix = "Oil and Water";
        String[] arraString = oilAndWaterDoNotMix.split(" and ");
        for (String arraS : arraString) {
            System.out.println(arraS);
        }

        String namesToSplit = "Carl,Susie,Fredrick,Bob,Erik";

        String[] namesArray = namesToSplit.split(",");

        for (String names : namesArray) {
            System.out.print(names);
        }
        System.out.println(" ");

        String toBeConverted = "ThisShouldBeConverted";
        char[] charArray = toBeConverted.toCharArray();

        for (char value : charArray) {
            System.out.print(value);
        }

        char[] javaCharArray = {'J', 'a', 'v', 'a'};
        String toAddString = "";

        for (char c : javaCharArray) {
            toAddString += c;
            System.out.println(toAddString);
        }
        System.out.println(toAddString);
    }
}
