package org.example;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 5, 12, 45, 7, 8, 9);
        //printAllNumbersInListFunctional(numbers);
        printEvenNumbersInListFunctional(numbers);
    }

   /* public static void printNumber(int number){
        System.out.println(number);
    }*/

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
         numbers.stream().forEach(System.out::println);
    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
         numbers.stream().filter(number-> number % 2 == 0).forEach(System.out::println);
    }


}
