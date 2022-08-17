package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        ArrayList<Car> allCars = factory.madeObjects();

        Car.findCarsWithProducentXAndTrunkMinY(allCars, "BMW", 300);
    }
}