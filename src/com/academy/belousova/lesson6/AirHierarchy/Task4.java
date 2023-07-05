package com.academy.belousova.lesson6.AirHierarchy;

public class Task4 {
    public static void main(String[] args) {

        AirCompany airCompany = new AirCompany();
        airCompany.addPlanes(Plane.of(5));
        airCompany.addPlanes(Helicopter.of(3));

        System.out.println("----- Список воздушных судов авиакомпании -----");
        airCompany.printPlanes();

        System.out.println("Общая вместимость : " + airCompany.totalFuelRate());

        System.out.println("Общая грузоподъемность : " + airCompany.totalCarrying());

        System.out.println("Средняя дальность полета: " + airCompany.average());

        airCompany.sortPlane();
        System.out.println();
        System.out.println("-- Список воздушных судов по дальности полета --");
        airCompany.printPlanes(plane -> plane.getMaxDistance() >= 700 && plane.getMaxDistance() <= 720, Plane::toString);

    }
}
