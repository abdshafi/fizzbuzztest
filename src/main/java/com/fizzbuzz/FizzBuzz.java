package com.fizzbuzz;

public class FizzBuzz {

    public void print() {
        int n = 100;
        for (int count = 1; count <= n; count++) {
            if (isFizzBuzzable(count)) {
                System.out.println("Fizz Buzz");
            } else if (isFizzable(count)) {
                System.out.println("Fizz");
            } else if (isBuzzable(count)) {
                System.out.println("Buzz");
            } else {
                System.out.println(count);
            }

        }
    }

    public boolean divisibleBy(int number, int by) {
        return number % by == 0;
    }

    public boolean isFizzable(int number) {
        return (divisibleBy(number, 3) || number % 10 == 3);
    }

    public boolean isBuzzable(int number) {
        return (divisibleBy(number, 5) || number % 10 == 5);
    }

    public boolean isFizzBuzzable(int number) {
        return (divisibleBy(number, 3) && divisibleBy(number, 5));
    }
}
