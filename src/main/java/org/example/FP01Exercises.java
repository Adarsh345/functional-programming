package org.example;

import java.util.List;

public class FP01Exercises {
    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        //printAllCourses(courses);
       // printSprintCourses(courses);
       // printMinimum3CharacterLengthCourses(courses);
        printOnlyEvenNoSquare(numbers);



    }

    //exercise 1 completed => printing all courses
    private static void printAllCourses(List<String> courses) {
        courses.stream().forEach(System.out::println);
    }
    //exercise 2 print those courses that has contains "spring" into it
    private static void printSprintCourses(List<String> courses) {
        courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
    }

    //exercise 3 print those courses that has the length of minimum 3 characters
    private static void printMinimum3CharacterLengthCourses(List<String> courses) {
        courses.stream().filter(course -> course.length()>=4).forEach(System.out::println);
    }

    //exercise 4 print only even no square
    private static void printOnlyEvenNoSquare(List<Integer> numbers) {
        numbers.stream().filter(number -> number % 2 == 0)
                .map(number -> number*number)
                .forEach(System.out:: println);
    }


}
