package org.example;

import java.util.List;

public class FP02Functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        System.out.println(addListFunctional(numbers));

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    private static int addListFunctional(List<Integer> numbers) {
        //this is way to call method reference
        //  return numbers.stream().reduce(0, FP02Functional::sum);

        // using lambda expression
        // return numbers.stream().reduce(0,(x, y) -> x + y );
        // using Integer class predefined  method
        return numbers.stream().reduce(0, Integer::sum);


    }
}
