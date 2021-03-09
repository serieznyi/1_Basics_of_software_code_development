package org.serieznyi.loop;

import org.jetbrains.annotations.NotNull;

import java.math.BigInteger;

public class Task6 {

    public static void main(String @NotNull [] args) {
        for (int i = 0; i < 255; i++) {
            System.out.printf("Символ %s и его код %d\n", (char) i, i);
        }
    }
}
