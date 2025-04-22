package org.example.week17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>(Arrays.asList(2, 5, 7, 8, 12, 55, 22, 45));

        numList.forEach((n) -> {
            if (n < 15) {
                System.out.print(n + ", ");
            }
        });
    }
}
