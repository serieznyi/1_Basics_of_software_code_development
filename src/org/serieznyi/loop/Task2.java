package org.serieznyi.loop;

import org.jetbrains.annotations.NotNull;

import java.math.BigInteger;

public class Task2 {

    public static void main(String @NotNull [] args) {
        assertArguments(args);

        int begin = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);
        int step = Integer.parseInt(args[2]);

        System.out.printf("Отрезок [%s, %s]. Шаг %s\n", begin, end, step);

        System.out.println("Вычисляем значение функции:");
        System.out.println("""
                { x, x > 2
            y = {
                { -x, x <= 2
        """);

        for (int i = begin; i <= end; i+=step) {
            if (i > 2) {
                System.out.printf(
                        "x = %s, y = %s\n",
                        i,
                        i
                );
            } else {
                System.out.printf(
                        "x = %s, y = %s\n",
                        i,
                        i * -1
                );
            }
        }
    }

    private static void assertArguments(String[] args) {
        IllegalArgumentException exception = new IllegalArgumentException(
            "Укажите начало отрезка, конец отрезка и шаг. Все значения целочисленные"
        );

        if (args.length < 1) {
            throw exception;
        }

        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            assertGreaterThan(b, a);

            Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            throw exception;
        }
    }

    private static void assertGreaterThan(int expected, int actual) {
        if (expected < actual) {
            throw new IllegalArgumentException(String.format("Число %s должно быть больше %s", expected, actual));
        }
    }
}
