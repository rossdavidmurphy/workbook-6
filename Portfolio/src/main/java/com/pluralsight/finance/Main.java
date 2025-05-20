package com.pluralsight.finance;

public class Main {
    public static void main(String[] args) {
        Valuable[] valuables = {new House("House", 100000, 1990, 2000), new Gold("Gold", 35.00), new Jewelry("Diamond", 50.00)};

        for (Valuable thing : valuables) {
            thing.getValue();
        }


    }
}