package com.academy.belousova.lesson6.AirHierarchy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Plane implements Comparable<Plane>{
    private final Integer fuelRate;
    private final Integer maxDistance;
    private final Integer carrying;

    public static List<Plane> of(int numb) {
        final List<Plane> planes = new ArrayList<>(numb);
        for (int i = 0; i < numb; i++)
            planes.add(new Plane(random(1,10), random(700,800), random(1,10)));
        return planes;
    }

    public Plane(Integer fuelRate, Integer maxDistance, Integer carrying) {
        this.fuelRate = fuelRate;
        this.maxDistance = maxDistance;
        this.carrying = carrying;
    }

    public Integer getFuelRate() {
        return fuelRate;
    }

    public Integer getMaxDistance() {
        return maxDistance;
    }

    public Integer getCarrying() {
        return carrying;
    }

    private static int random(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    @Override
    public int compareTo(Plane o) {
        return this.maxDistance.compareTo(o.getMaxDistance());
    }

    @Override
    public String toString() {
        return "Fuel rate : " + fuelRate + ", carrying : " + carrying + ", distance : " + maxDistance;
    }
}