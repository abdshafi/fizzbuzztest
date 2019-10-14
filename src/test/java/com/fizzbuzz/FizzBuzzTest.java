package com.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testIsFizzable() {
        int numbers[] = {3, 23, 39, 53, 66, 78, 81, 99};
        for (int x : numbers) {
            assertTrue(fizzBuzz.isFizzable(x));
        }
    }


    @Test
    public void testIsBuzzzable() {
        int numbers[] = {5, 15, 30, 35, 55, 70, 95, 100};
        for (int x : numbers) {
            assertTrue(fizzBuzz.isBuzzable(x));
        }
    }

    @Test
    public void testIsFizzBuzzzable() {
        int numbers[] = {15, 30, 45, 60, 75, 90};
        for (int x : numbers) {
            assertTrue(fizzBuzz.isFizzBuzzable(x));
        }
    }

    @Test
    public void testOther() {

        assertFalse(fizzBuzz.isFizzBuzzable(1));
        assertFalse(fizzBuzz.isFizzBuzzable(79));

        assertFalse(fizzBuzz.isFizzable(1));
        assertFalse(fizzBuzz.isFizzable(34));

        assertFalse(fizzBuzz.isBuzzable(1));
        assertFalse(fizzBuzz.isBuzzable(99));

    }
}
