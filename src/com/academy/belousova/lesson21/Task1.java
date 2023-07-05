package com.academy.belousova.lesson21;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Если вы видите то же значение, значит, синглтон был использован повторно (Ура!).\n" +
                "Если вы видите разные значения, значит, были созданы 2 синглтона (booo!!)");

        Sun sun = Sun.getInstance("Sun");
        Sun anotherSun = Sun.getInstance("anotherSun");
        System.out.println(sun.value);
        System.out.println(anotherSun.value);

        Moon moon = Moon.getInstance("Moon");
        Moon anotherMoon = Moon.getInstance("anotherMoon");
        System.out.println(moon.value);
        System.out.println(anotherMoon.value);

        Earth earth = Earth.getInstance("Earth");
        Earth anotherEarth = Earth.getInstance("anotherEarth");
        System.out.println(earth.value);
        System.out.println(anotherEarth.value);

    }
}
