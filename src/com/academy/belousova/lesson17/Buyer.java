package com.academy.belousova.lesson17;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Buyer {
    private static final Map<String, Integer> map = new HashMap<>() {
        {
            put("Bread", 12);
            put("Milk", 5);
            put("Cheese", 10);
            put("Fish", 2);
            put("Meat", 10);
            put("Banana", 1);
            put("Orange", 2);
        }
    };

    private Map<String, Integer> bucket = new HashMap<>();
    private String name;

    public Buyer(int i) {
        this.name = "Buyer №" + i;
        generateBucket();
    }

    private void generateBucket() {
        Random random = new Random();
        int goodNumber = random.nextInt(3) + 3;
        while (bucket.size() != goodNumber) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if(Math.random() > 0.5) continue;
                bucket.put(entry.getKey(), entry.getValue());
                break;
            }
        }
    }

    public Map<String, Integer> getBucket() {
        return bucket;
    }

    public void setBucket(Map<String, Integer> bucket) {
        this.bucket = bucket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
