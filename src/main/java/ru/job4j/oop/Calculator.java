package ru.job4j.oop;

import java.util.concurrent.Callable;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int z) {
        return x - z;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int b) {
        return x / b;
    }

    public int sumAllOperation(int y, int z, int a, int b) {
        return sum(y) + minus(z) + multiply(a) + divide(b);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(sum(10));
        System.out.println(minus(3));
        System.out.println(calculator.multiply(5));
        System.out.println(calculator.divide(2));
        System.out.println(calculator.sumAllOperation(10, 3, 5, 2));
    }
}
