package com.academy.belousova.lesson12;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String str = in.nextLine();
        char[] symbols = str.toCharArray();

        Stack<Character> stack = new Stack<>();
        int counter = 0;
        List<Integer> opened = new LinkedList<>();
        List<Integer> closed = new LinkedList<>();

        for(char c : symbols) {
            counter++;

            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
                opened.add(counter);
            }
            if (c == ')' || c == '}' || c == ']') {

                if(!stack.isEmpty()) {
                    char fromStack = stack.peek();
                    if((c == ')' && fromStack == '(') ||
                            (c == '}' && fromStack == '{') ||
                            (c == ']' && fromStack == '[')) {
                        stack.pop();
                    } else {
                        closed.add(counter);
                        break;
                    }
                } else {
                   stack.add(c);
                   closed.add(counter);
                    break;
                }
            }
        }

         if(!stack.isEmpty()) {
            if(!closed.isEmpty()) {
                System.out.println("false");
        } else {
                if(!opened.isEmpty()) {
                    System.out.println("false");
                }
            }
        } else {
            System.out.println("true");
        }
    }
}
