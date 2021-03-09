package org.serieznyi.branching;

import org.jetbrains.annotations.NotNull;

public class Task4 {

    public static void main(String @NotNull [] args) {
        assertArguments(args);

        int holeWidth = Integer.parseInt(args[0]);
        int holeHeight = Integer.parseInt(args[1]);
        int brickHeight = Integer.parseInt(args[2]);
        int brickWidth = Integer.parseInt(args[3]);
        int brickLength = Integer.parseInt(args[4]);

        System.out.printf("Отверстие: ширина = %s, высота = %s\n", holeWidth, holeHeight);

        System.out.printf("Кирпич: ширина = %s, высота = %s, длина = %s\n", brickWidth, brickHeight, brickLength);

        int minBrickSide = Math.min(brickWidth, Math.min(brickHeight, brickLength));
        int minHoleSide = Math.min(holeWidth, holeHeight);

        // Минимальная сторона кирпича меньше или равна минимальной стороне отверстия
        if (minBrickSide <= minHoleSide) {
            System.out.println("Указанный кирпич может пройти в отверстие");
        } else {
            System.out.println("Указанный кирпич НЕ может пройти в отверстие");
        }
    }

    private static void assertArguments(String[] args) {
        IllegalArgumentException exception = new IllegalArgumentException(
                "Укажите ширину и высоту отверстия, и ширину, высоту и глубину кирпича"
        );

        if (args.length < 5) {
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
