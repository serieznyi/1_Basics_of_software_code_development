package org.serieznyi.branching;

import org.jetbrains.annotations.NotNull;

public class Task3 {

    public static void main(String @NotNull [] args) {
        assertArguments(args);

        int aX = Integer.parseInt(args[0]);
        int aY = Integer.parseInt(args[1]);
        int bX = Integer.parseInt(args[2]);
        int bY = Integer.parseInt(args[3]);
        int cX = Integer.parseInt(args[4]);
        int cY = Integer.parseInt(args[5]);

        System.out.println("Пытаемся определит расположены ли указанные точки на одной прямой");

        System.out.printf(
                "Вы указали следующие точки a={%s, %s}, b={%s, %s}, c={%s, %s}\n",
                aX, aY, bX, bY, cX, cY
        );

        if (isAllPointsPlacedOnOneLine(aX, aY, bX, bY, cX, cY)) {
            System.out.println("Указанные точки лежат на одной прямой");
        } else {
            System.out.println("Указанные точки НЕ лежат на одной прямой");
        }
    }

    private static boolean isAllPointsPlacedOnOneLine(int aX, int aY, int bX, int bY, int cX, int cY) {
        return 0 == aX * (bY - cY) +
                bX * (cY - aY) +
                cX * (aY - bY);
    }

    private static void assertArguments(String[] args) {
        IllegalArgumentException exception = new IllegalArgumentException(
                "Укажите координаты трех точек"
        );

        if (args.length < 6) {
            throw exception;
        }

        try {
            for (int i = 0; i < 5; i++) {
                Integer.parseInt(args[i]);
            }
        } catch (NumberFormatException e) {
            throw exception;
        }
    }
}
