package io.javabrains.reactiveworkshop;

import java.io.IOException;

import static io.javabrains.reactiveworkshop.ReactiveSources.intNumbersFluxWithRepeat;

public class Exercise7 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

        // Print all values from intNumbersFlux that's greater than 5
//        intNumbersFlux()
//                .filter(number -> number > 5)
//                .log()
//                .subscribe(System.out::println);
//
//        // Print each value multiplied by 10 from intNumbersFlux that's greater than 5
//        intNumbersFlux()
//                .filter(number -> number > 5)
//                .map(number -> number * 10)
//                .subscribe(System.out::println);

        // Print each value multiplied by 10 from intNumbersFlux for the first 3 numbers emitted that's greater than 5
//        intNumbersFlux()
//                .filter(number -> number > 5)
//                .map(number -> number * 10)
//                .take(3)
//                .subscribe(System.out::println);

        // Print each value from intNumbersFlux that's greater than 20. Print -1 if no elements are found
//        intNumbersFlux()
//                .filter(number -> number > 20)
//                .defaultIfEmpty(-1)
//                .subscribe(System.out::println);

        // Switch ints from intNumbersFlux to the right user from userFlux
//        intNumbersFlux()
//                .flatMap(number -> userFlux().filter(user -> user.getId() == number))
//                .subscribe(System.out::println);

        // Print only distinct numbers from intNumbersFluxWithRepeat
//        intNumbersFluxWithRepeat()
//                .distinct()
//                .log()
//                .subscribe();

        // Print from intNumbersFluxWithRepeat excluding immediately repeating numbers
        intNumbersFluxWithRepeat()
                .distinctUntilChanged()
                .log()
                .subscribe();

        System.out.println("Press a key to end");
        System.in.read();
    }

}
