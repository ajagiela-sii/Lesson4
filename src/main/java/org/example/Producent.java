package org.example;

public class Producent {
    private final String model;
    private final String type;

    public Producent(String model, String type) {
        this.model = model;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public void printModelAndType() {
        System.out.println(getModel() + " " + getType());
    }
}
