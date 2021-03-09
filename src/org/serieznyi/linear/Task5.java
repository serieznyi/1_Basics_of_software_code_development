package org.serieznyi.linear;

import org.jetbrains.annotations.NotNull;

public class Task5 {

    public static void main(String @NotNull [] args) {
        assertArguments(args);

        int secondsArg = Integer.parseInt(args[0]);

        long hours = secondsArg / 60 / 60;
        int minutes = secondsArg / 60;
        int seconds = secondsArg % 60;

        System.out.printf("Вы указали число: %s\n", secondsArg);

        System.out.format("Результат: %s ч %s мин %s с", hours, minutes, seconds);
    }

    private static void assertArguments(String[] args) {
        IllegalArgumentException exception = new IllegalArgumentException(
                "Укажите положительное целое число"
        );

        if (args.length < 1) {
            throw exception;
        }

        try {
            int digit = Integer.parseInt(args[0]);

            if (digit < 0) {
                throw exception;
            }
        } catch (NumberFormatException e) {
            throw exception;
        }
    }
}
