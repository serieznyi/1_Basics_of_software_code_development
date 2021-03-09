package org.serieznyi.loop;

import org.jetbrains.annotations.NotNull;

public class Task1 {

    public static void main(String @NotNull [] args) {
        assertArguments(args);

        int number = Integer.parseInt(args[0]);

        long sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.printf("Сумма чисел от 1 до %s равна %s\n", number, sum);
    }

    private static void assertArguments(String[] args) {
        IllegalArgumentException exception = new IllegalArgumentException(
            "Укажите целое положительное число"
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
