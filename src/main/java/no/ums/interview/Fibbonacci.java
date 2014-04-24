package no.ums.interview;

import java.util.stream.LongStream;

/**
 * Tools to generate fibbonacci numbers.
 *
 * @author Ståle Undheim <su@ums.no>
 */
public interface Fibbonacci {

    /**
     * Creates a stream of Fibonacci numbers.
     *
     * This should be an infinite stream starting at 1, 1, 2, 3, 5 and so on.
     *
     * Accessing numbers beyond {@link Long#MAX_VALUE} will result in random overflow variables being returned.
     *
     * @return a stream of fibonacci numbers
     */
    static LongStream stream() {
        return LongStream.generate(() -> 1L);
    }

    static LongStream evenFibbonacciNumbers() {
        return stream().filter((l) -> true);
    }

}
