package org.serieznyi.linear;

import org.jetbrains.annotations.NotNull;

import java.time.Duration;
import java.util.Date;
import java.util.regex.Pattern;

public class Function5 {

    public static void main(String @NotNull [] args) {
        assertArguments(args);

        int secondsArg = Integer.parseInt(args[0]);

        Duration dur = Duration.ofSeconds(secondsArg);
        long hours = dur.toHours();
        int minutes = dur.toMinutesPart();
        int seconds = dur.toSecondsPart();

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
