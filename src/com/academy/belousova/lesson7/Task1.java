package com.academy.belousova.lesson7;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) throws CloneNotSupportedException {

        Document document1 = new Document("Account", 1);
        Document document2 = new Document("Book", 105);
        Document document3 = new Document("Dictionary", 1025);

        Document[] documents = {document3, document2, document1};

        System.out.println("до  " + Arrays.toString(documents));
        Arrays.sort(documents);
        System.out.println("после  " + Arrays.toString(documents));

        Document document4 = (Document) document1.clone();

        System.out.println(document4 == document1);
        System.out.println(document4.equals(document1));
        System.out.println(document4.equals(document2));

        Document document5 = (Document) document4.clone();
        document5.print();
    }
}
