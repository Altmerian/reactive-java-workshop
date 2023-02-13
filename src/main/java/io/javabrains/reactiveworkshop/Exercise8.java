package io.javabrains.reactiveworkshop;

import reactor.core.publisher.Flux;

import java.io.IOException;

import static io.javabrains.reactiveworkshop.ReactiveSources.intNumbersFluxWithException;

public class Exercise8 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFluxWithException()

        // Print values from intNumbersFluxWithException and print a message when error happens
//        intNumbersFluxWithException()
//                .doOnError(error -> System.out.println("Error happened! " + error.getMessage()))
//                .subscribe(System.out::println);

        // Print values from intNumbersFluxWithException and continue on errors
//        intNumbersFluxWithException()
//                .onErrorContinue((error, item) -> System.out.println("Error happened! " + error.getMessage()))
//                .subscribe(System.out::println);

        // Print values from intNumbersFluxWithException and when errors
        // happen, replace with a fallback sequence of -1 and -2
        intNumbersFluxWithException()
                .onErrorResume(err -> Flux.just(-1, -2))
                .subscribe(System.out::println);

        System.out.println("Press a key to end");
        System.in.read();
    }

}
