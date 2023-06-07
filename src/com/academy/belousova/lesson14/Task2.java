package com.academy.belousova.lesson14;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task2 {
    private static List<Integer> numbers = new ArrayList<>();
    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + "/src/com/academy/belousova/lesson14/";
        String fileName1 = "in1.txt";
        String fileName2 = "in2.txt";
        String fullPath1 = path + fileName1;
        String fullPath2 = path + fileName2;

        createFileWithNumbers(fullPath1);
        createFileWithNumbers(fullPath2);

        read(fullPath1);
        read(fullPath2);

        String fileName3 = "out.txt";
        String fullPath = path + fileName3;

        Collections.sort(numbers);
        try (DataOutputStream dis = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fullPath)))) {
            for (Integer integer : numbers) {
               dis.write((integer + "\n").getBytes());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void read(String fullPath) {
        try (BufferedReader dis = new BufferedReader(new FileReader(fullPath))) {
            while (dis.ready()) {
                numbers.add(Integer.parseInt(dis.readLine()));
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    private static void createFileWithNumbers(String fullPath) {
        try (DataOutputStream dis = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fullPath)))) {
            Random random = new Random();
            for (int i = 0; i < 1000; i++) {
                dis.write((random.nextInt(1, 100000) + "\n").getBytes());
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}

