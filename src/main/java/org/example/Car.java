package org.example;

import java.util.ArrayList;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Car {
    private final Producent producent;
    private final boolean isAutomaticGear;
    private final Market market;
    private final String segment;
    private final ArrayList<Dimension> dimensions;

    public Car(Producent producent, boolean isAutomaticGear, Market market, Segment segment, ArrayList<Dimension> dimensions) {
        this.producent = producent;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.segment = segment.toString();
        this.dimensions = dimensions;
    }

    public boolean isAutomaticGear() {
        return isAutomaticGear;
    }

    public Producent getProducent() {
        return producent;
    }

    public ArrayList<Dimension> getDimensions() {
        return dimensions;
    }

    public Market getMarket() {
        return market;
    }

    public static void findCarsWithProducentXAndTrunkMinY(ArrayList<Car> cars, String producentName, int minTrankCapacity) {
        Predicate<Dimension> trunkCapacityLimit = dimension -> dimension.getTrankCapacity() > minTrankCapacity;
        Set<Car> carsAfterFiltration = cars.stream()
                .filter(Car::isAutomaticGear)
                .filter(car -> car.getProducent().getModel().equals(producentName))
                .filter(car -> car.getDimensions().stream().anyMatch(trunkCapacityLimit))
                .collect(Collectors.toSet());
        printCarsCountryNameAndSign(carsAfterFiltration);

    }

    private static void printCarsCountryNameAndSign(Set<Car> carsAfterFiltration) {
        carsAfterFiltration
                .forEach(car -> {
                    car.getProducent().printModelAndType();
                    car.getMarket().getCountries().forEach(Country::printCountryNameAndSign);
                });
    }
}
