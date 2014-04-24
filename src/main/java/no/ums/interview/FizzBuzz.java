package no.ums.interview;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * FizzBuzz generator.
 *
 * @author Ståle Undheim <su@ums.no>
 */
public interface FizzBuzz {

    /**
     * Given an intStream, return a stream of strings following the FizzBuzz rules.
     *
     * Any number divisible by 3 should be replaced by Fizz.
     * Any number divisible by 5 should be replaced by Buzz.
     * Any number divisible by 15 should be replaced by FizzBuzz.
     * All other numbers as is.
     *
     * @param intStream source stream
     * @return FizzBuzzStream
     */
    static Stream<String> toFizzBuzzStream(IntStream intStream) {
        return Stream.empty();
    }

}
