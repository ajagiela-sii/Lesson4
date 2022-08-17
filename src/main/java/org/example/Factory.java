package org.example;

import java.util.ArrayList;
import java.util.List;

public class Factory {

    public ArrayList<Car> madeObjects() {
        Country poland = new Country("Poland", 'P');
        Country germany = new Country("Germany", 'D');
        Country france = new Country("France", 'F');
        Country netherlands = new Country("Netherlands", 'N');
        Country korea = new Country("Korea", 'K');

        Market business = new Market("business", List.of(new Country[]{poland, germany}));
        Market cargo = new Market("cargo", List.of(new Country[]{france, netherlands, korea}));
        Market transport = new Market("transport", List.of(new Country[]{poland, france, korea}));
        Market taxi = new Market("taxi", List.of(new Country[]{germany, netherlands}));
        Market bus = new Market("bus", List.of(new Country[]{france, germany}));

        Dimension estateWagon = new Dimension(170, 170, 350);
        Dimension sedan = new Dimension(168, 164, 250);
        Dimension hatchback = new Dimension(166, 170, 189);
        Dimension liftback = new Dimension(164, 175, 199);
        Dimension coupe = new Dimension(150, 180, 100);
        Dimension van = new Dimension(200, 200, 600);
        Dimension miniVan = new Dimension(180, 190, 400);
        Dimension pickUp = new Dimension(170, 194, 500);
        Dimension suv = new Dimension(175, 210, 305);
        Dimension cabriolet = new Dimension(145, 185, 175);

        ArrayList<Dimension> businessDimensions = new ArrayList<>();
        businessDimensions.add(sedan);
        businessDimensions.add(hatchback);
        businessDimensions.add(cabriolet);
        businessDimensions.add(coupe);

        ArrayList<Dimension> cargoDimensions = new ArrayList<>();
        cargoDimensions.add(van);
        cargoDimensions.add(miniVan);
        cargoDimensions.add(pickUp);

        ArrayList<Dimension> transportDimensions = new ArrayList<>();
        transportDimensions.add(van);
        transportDimensions.add(miniVan);
        transportDimensions.add(estateWagon);

        ArrayList<Dimension> taxiDimensions = new ArrayList<>();
        taxiDimensions.add(estateWagon);
        taxiDimensions.add(liftback);
        taxiDimensions.add(suv);

        ArrayList<Dimension> busDimensions = new ArrayList<>();
        busDimensions.add(van);
        busDimensions.add(miniVan);

        Producent bmwX5 = new Producent("BMW", "x5");
        Producent toyota = new Producent("Toyota", "Corolla");
        Producent audi = new Producent("Audi", "A4");
        Producent hyundai = new Producent("Hyundai", "h350");
        Producent skoda = new Producent("Skoda", "Octavia");
        Producent bmwX10 = new Producent("BMW", "X10");
        Producent peugeot = new Producent("Peugeot", "Tepee");
        Producent porsche = new Producent("Porsche", "Carrera");
        Producent opel = new Producent("Opel", "Zafira");
        Producent bmwE36 = new Producent("BMW", "e36");

        Car bmw1 = new Car(bmwX5, true, business, Segment.PREMIUM, taxiDimensions);
        Car toyota1 = new Car(toyota, false, taxi, Segment.STANDARD, taxiDimensions);
        Car audi1 = new Car(audi, true, business, Segment.MEDIUM, businessDimensions);
        Car hyundai1 = new Car(hyundai, false, cargo, Segment.STANDARD, transportDimensions);
        Car skoda1 = new Car(skoda, true, taxi, Segment.PREMIUM, taxiDimensions);
        Car bmw2 = new Car(bmwX10, true, transport, Segment.MEDIUM, busDimensions);
        Car peugeot1 = new Car(peugeot, false, bus, Segment.MEDIUM, busDimensions);
        Car porsche1 = new Car(porsche, true, business, Segment.PREMIUM, businessDimensions);
        Car opel1 = new Car(opel, false, bus, Segment.STANDARD, cargoDimensions);
        Car bmw3 = new Car(bmwE36, false, transport, Segment.MEDIUM, transportDimensions);
        Car bmw4 = new Car(bmwX10, true, business, Segment.PREMIUM, businessDimensions);
        Car bmw5 = new Car(bmwE36, true, bus, Segment.PREMIUM, transportDimensions);
        Car bmw6 = new Car(bmwX5, false, cargo, Segment.STANDARD, transportDimensions);
        Car audi2 = new Car(audi, false, taxi, Segment.PREMIUM, taxiDimensions);
        Car bmw7 = new Car(bmwX5, false, transport, Segment.PREMIUM, transportDimensions);

        ArrayList<Car> allCars = new ArrayList<>();
        allCars.add(bmw1);
        allCars.add(toyota1);
        allCars.add(audi1);
        allCars.add(hyundai1);
        allCars.add(skoda1);
        allCars.add(bmw2);
        allCars.add(peugeot1);
        allCars.add(porsche1);
        allCars.add(opel1);
        allCars.add(bmw3);
        allCars.add(bmw4);
        allCars.add(bmw5);
        allCars.add(bmw6);
        allCars.add(audi2);
        allCars.add(bmw7);

        return allCars;
    }
}
