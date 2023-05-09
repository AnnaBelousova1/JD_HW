package com.academy.belousova.lesson5;

public class Fraction {
    private int x;
    private int y;

    public Fraction(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void fraction() {
        System.out.println("Дробь: " + x + "/" + y);
    }

    public Fraction sum(Fraction fraction) {
        Fraction temp = new Fraction(0, 0);

        if (this.getY() == fraction.getY()) {
            temp.setX(this.getX() + fraction.getX());
            temp.setY(this.getY());
        } else {
            temp.setX(this.getX() * fraction.getY() + fraction.getX() * this.getY());
            temp.setY(this.getY() * fraction.getY());
        }
        return temp;
    }

    public Fraction mul(int value) {
        return new Fraction(this.getX() * value, this.getY());
    }

    public Fraction div(int value) {
        return new Fraction(this.getX() , this.getY() * value);
    }

    @Override
    public String toString() {
        return x + "/" + y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
