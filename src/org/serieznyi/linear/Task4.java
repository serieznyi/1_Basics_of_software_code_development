package org.serieznyi.linear;

import org.jetbrains.annotations.NotNull;

import java.util.regex.Pattern;

public class Task4 {

    public static final Pattern DIGIT_PATTERN = Pattern.compile("^[\\d]{3}\\.[\\d]{3}$");

    public static void main(String @NotNull [] args) {
        assertArguments(args);

        String digit = args[0];

        System.out.printf("Передано число: %s\n", digit);

        String[] digitParts = digit.split("\\.");

        System.out.print("Новое число: ");
        System.out.printf("%s.%s", digitParts[1], digitParts[0]);
    }

    private static void assertArguments(String[] args) {
        String errorMessage = "Укажите вещественное число состоящее из 3 разрядов в вещественной и дробной частях";

        if (args.length < 1) {
            throw new IllegalArgumentException(errorMessage);
        }

        if (!DIGIT_PATTERN.matcher(args[0]).matches()) {
            throw new IllegalArgumentException(errorMessage);
        }
    }
}
