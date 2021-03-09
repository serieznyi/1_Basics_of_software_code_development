package org.serieznyi.branching;

import org.jetbrains.annotations.NotNull;

public class Task5 {

    public static void main(String @NotNull [] args) {
        assertArguments(args);

        int x = Integer.parseInt(args[0]);
        double result = 0.0;

        if (x <= 3) {
            System.out.println("Вычисляем функцию: x^2 - 3*x + 9");
            result = Math.pow(x, 2) - 3 * x + 9;
        } else {
            System.out.println("Вычисляем функцию: 1 / (x^3 + 6)");
            result = 1 / (Math.pow(x, 3) + 6);
        }

        System.out.printf("Результат: %s\n", result);
    }

    private static void assertArguments(String[] args) {
        IllegalArgumentException exception = new IllegalArgumentException(
            "Укажите X"
        );

        if (args.length < 1) {
            throw exception;
        }

        try {
            Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            throw exception;
        }
    }
}
