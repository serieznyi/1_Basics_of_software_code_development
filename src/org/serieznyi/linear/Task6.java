package org.serieznyi.linear;

import org.jetbrains.annotations.NotNull;

public class Task6 {
    public static void main(String @NotNull [] args) {
        assertArguments(args);

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        System.out.printf("Вы указали координату: X=%s, Y=%s\n", x, y);

        boolean pointOnFigure = (x >= -2 && x <= 2 && y >= 0 && y <= 4) || (x >= -4 && x <= 4 && y <= 0 && y >= -3);

        System.out.printf("Является ли точка [%s, %s] частью фигуры: %b \n", x, y, pointOnFigure);
    }

    private static void assertArguments(String[] args) {
        IllegalArgumentException exception = new IllegalArgumentException(
                "Укажите координату точки"
        );

        if (args.length < 2) {
            throw exception;
        }

        try {
            Integer.parseInt(args[0]);
            Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            throw exception;
        }
    }
}
