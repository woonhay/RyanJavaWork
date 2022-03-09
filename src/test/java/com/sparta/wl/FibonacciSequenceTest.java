package com.sparta.wl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciSequenceTest {
    @Test
    public void testRecursion() {
        FibonacciSequence fs = new FibonacciSequence();
        int actual = fs.fibbonaciNumber(13);
        int expected = 144;

        Assertions.assertEquals(expected, actual);
    }
}
