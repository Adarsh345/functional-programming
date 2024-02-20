package org.example;

import java.util.List;

public class FP01Exercises {
    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        //printAllCourses(courses);
       // printSprintCourses(courses);
       // printMinimum3CharacterLengthCourses(courses);
       // printOnlyEvenNoSquare(numbers);
      //  printCubeOnlyOddNumbers(numbers);
        printCourseNameWithCourseLength(courses);



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

    //exercise 5 print cube only of odd numbers
    public static void printCubeOnlyOddNumbers(List<Integer> numbers){
        numbers.stream().filter(number -> number % 2 != 0)
                .map(number -> number * number * number)
                .forEach(System.out::println);
    }

    // exercise 6 print length of the course string with the course name
    public static void printCourseNameWithCourseLength(List<String> courses){
        courses.stream().map(course-> String.format("%s %s",course,course.length())).forEach(System.out::println);
    }


}
