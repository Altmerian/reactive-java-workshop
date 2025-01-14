package io.javabrains.reactiveworkshop;

import java.io.IOException;

import static io.javabrains.reactiveworkshop.ReactiveSources.intNumbersFlux;

public class Exercise9 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux()

        // Print size of intNumbersFlux after the last item returns
//        intNumbersFlux()
//                .count()
//                .subscribe(count -> System.out.println(count));

        // Collect all items of intNumbersFlux into a single list and print it
//        intNumbersFlux()
//                .collectList()
//                .subscribe(list -> System.out.println(list));

        // Transform to a sequence of sums of adjacent two numbers
        intNumbersFlux()
                .buffer(2)
                .map(list -> list.stream().reduce(0, (i, j) -> i + j))
                .subscribe(listSums -> System.out.println(listSums));

        System.out.println("Press a key to end");
        System.in.read();
    }

}
