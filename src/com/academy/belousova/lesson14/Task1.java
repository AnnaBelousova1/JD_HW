package com.academy.belousova.lesson14;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + "/src/com/academy/belousova/lesson14/";
        String fileName = "matrix.txt";
        String fullPath = path + fileName;

        int[][] array = new int[6][4];
        try (PrintWriter printWriter = new PrintWriter(fullPath)) {

            for (int i = 0; i < array.length; ++i) {
                for (int j = 0; j < array[i].length; ++j) {
                    array[i][j] = (int) (Math.random() * (15 - (-15) + 1) - 15);
                    printWriter.write(array[i][j] + " ");
                    System.out.printf("%3d%s", array[i][j], " ");
                }
                printWriter.write("\r\n");
                System.out.println();
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
