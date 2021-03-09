package org.serieznyi.branching;

import org.jetbrains.annotations.NotNull;

public class Task1 {

    public static final int TRIANGLE_ANGLE_MAX_SUM = 180;
    public static final int STRAIGHT_ANGLE = 90;

    public static void main(String @NotNull [] args) {
        assertArguments(args);

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        System.out.printf("Вы указали следующие углы: a=%s, b=%s\n", x, y);

        if (!isTriangleCanExists(x, y)) {
            System.out.println("Треугольник с указанными углами не может существовать");
            return;
        }

        System.out.println("Треугольник с указанными углами может существовать");

        if (isTriangleWithStraightAngle(x, y)) {
            System.out.println("Треугольник с указанными углами является прямоугольным");
        } else {
            System.out.println("Треугольник с указанными углами НЕ является прямоугольным");
        }
    }

    private static boolean isTriangleCanExists(int angleOne, int angleTwo) {
        int lastAngle = TRIANGLE_ANGLE_MAX_SUM - angleOne - angleTwo;

        return lastAngle > 0;
    }

    private static boolean isTriangleWithStraightAngle(int angleOne, int angleTwo) {
        int lastAngle = TRIANGLE_ANGLE_MAX_SUM - angleOne - angleTwo;

        return isStraight(lastAngle) || isStraight(angleOne) || isStraight(angleTwo);
    }

    private static boolean isStraight(int angle) {
        return angle == STRAIGHT_ANGLE;
    }

    private static void assertArguments(String[] args) {
        IllegalArgumentException exception = new IllegalArgumentException(
                "Укажите углы треугольника"
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
