package com.academy.belousova.lesson15;

public class Printer implements Runnable {

    private String text;

    public Printer(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        print(text + " вывел " + Thread.currentThread().getName());

    }

    public void print(String text) {
        System.out.println(text);
    }
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
