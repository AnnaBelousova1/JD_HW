package com.academy.belousova.lesson14;

import java.io.*;

public class Task3 {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir") + "/src/com/academy/belousova/lesson14/";
        String fileName = "input.txt";
        String fullPath = path + fileName;

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(fullPath);
            int b = 0;
            while ((b = fileInputStream.read()) != -1) {
                System.out.print((char) b);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        String fileName2 = "occurrences.txt ";
        String fullPathCalculate = path + fileName2;
        try (DataOutputStream dis = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fullPathCalculate)))) {

            dis.write(calculate(fullPath));
            dis.write(countSymbol(fullPath));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static int calculate(String fullPath) throws IOException {
        FileInputStream in = new FileInputStream(fullPath);
        byte[] array = new byte[(int) in.available()];
        in.read(array);
        String text = new String(array);
        int count = 0;
        for (char ch : text.toCharArray()) {
            if (ch == 'a') {
                count++;
            }
        }
        System.out.println("Число встреченных символов 'a' равно: " + count);
        return count;
    }

    public static int countSymbol(String fullPath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fullPath));
        int count = 0;
        while (reader.ready()) {

            for (char symbol : reader.readLine().toCharArray()) {
                if (symbol == 'a') {
                    count++;
                }
            }
        }
        System.out.println("Число встреченных символов 'a' равно: " + count);
        return count;
    }
}
