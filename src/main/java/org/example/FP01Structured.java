package org.example;

import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {
        // print a element of list in structured approach
        List<Integer> numbers = List.of(1, 3, 5, 12, 45, 7, 8, 9);

        //printAllNumbersInListStructured(numbers);
        printEvenNumbersInListStructured(numbers);
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    // print only even numbers in structured approch
    private static void printEvenNumbersInListStructured(List<Integer> numbers) {
        for (int number : numbers) {
            if(number % 2 == 0)
            System.out.println(number);
        }
    }


}