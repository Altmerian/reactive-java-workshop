package io.javabrains.reactiveworkshop;

import static io.javabrains.reactiveworkshop.StreamSources.intNumbersStream;
import static io.javabrains.reactiveworkshop.StreamSources.userStream;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        System.out.println("\nTask 1");
        intNumbersStream().forEach(System.out::println);

        // Print numbers from intNumbersStream that are less than 5
        System.out.println("\nTask 2");
        intNumbersStream()
                .filter(number -> number < 5)
                .forEach(System.out::println);

        // Print the second and third numbers in intNumbersStream that's greater than 5
        System.out.println("\nTask 3");
        intNumbersStream()
                .filter(number -> number > 5)
                .skip(1)
                .limit(2)
                .forEach(System.out::println);

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        System.out.println("\nTask 4");
        Integer result = intNumbersStream()
                .filter(number -> number > 5)
                .findFirst()
                .orElse(-1);
        System.out.println(result);

        // Print first names of all users in userStream
        System.out.println("\nTask 5");
        userStream().map(User::getFirstName).forEach(System.out::println);

        // Print first names in userStream for users that have IDs from number stream
        System.out.println("\nTask 6");
        userStream()
                .filter(user ->
                        intNumbersStream().anyMatch(number -> number == user.getId()))
                .map(User::getFirstName)
                .forEach(System.out::println);

//        intNumbersStream()
//                .flatMap(number ->
//                        userStream().filter(user -> user.getId() == number))
//                .map(User::getFirstName)
//                .forEach(System.out::println);

    }
}
