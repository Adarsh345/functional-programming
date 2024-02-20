package org.example;

import java.util.List;

public class FP02Structured {
    public static void main(String[] args) {
        // adding the list and print the result
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        //by using structured way
        System.out.println(addListStructured(numbers));

    }

    private static Integer addListStructured(List<Integer> numbers) {
        //In this approach we should be think about storing the result
        //and the iterating over the list
        int sum = 0  ;
        for(int number : numbers){
            sum += number;
        }
        return sum;
    }
}
