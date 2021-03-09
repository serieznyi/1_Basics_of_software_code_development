package org.serieznyi.branching;

import org.jetbrains.annotations.NotNull;

public class Task2 {

    public static void main(String @NotNull [] args) {
        assertArguments(args);

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);

        System.out.println("Пытаемся найти max {min(a, b), min(c, d)}");

        System.out.printf("Вы передали a=%s, b=%s, c=%s, d=%s\n", a, b, c, d);

        System.out.printf("Пытаемся найти max {min(%s, %s), min(%s, %s)}\n", a, b, c, d);

        int max = Math.max(Math.min(a, b), Math.min(c, d));

        System.out.printf("Результат: %s\n", max);
    }

    private static void assertArguments(String[] args) {
        IllegalArgumentException exception = new IllegalArgumentException(
                "Укажите целочисленные значения a, b, c и d"
        );

        if (args.length < 4) {
            throw exception;
        }

        try {
            Integer.parseInt(args[0]);
            Integer.parseInt(args[1]);
            Integer.parseInt(args[2]);
            Integer.parseInt(args[3]);
        } catch (NumberFormatException e) {
            throw exception;
        }
    }
}
