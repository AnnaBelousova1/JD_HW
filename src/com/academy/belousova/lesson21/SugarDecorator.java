package com.academy.belousova.lesson21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SugarDecorator extends Decorator {
    public SugarDecorator(Drink component) {
        super(component);
    }

    @Override
    public void afterMake() {
        System.out.println("Добавляется сахар");
    }

    public boolean customerWantsCondiments() {

        String answer;
        boolean yn;

        while (true) {
            answer = getUserInput().trim().toLowerCase();
            if (answer.equals("y")) {
                yn = true;
                break;
            } else if (answer.equals("n")) {
                yn = false;
                break;
            } else {
                System.out.println("Sorry, I didn't catch that. Please answer y/n");
            }
        }
        return yn;
    }

    private String getUserInput() {
        String answer = null;
        System.out.print("Would you like sugar with your drink (y/n)? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}