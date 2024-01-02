package org.geekbrains.lessons.lesson2.hw;

public class Motorcycle extends Vehicle {
    private final String company;
    private final String model;
    private final int yearRelease;
    private final int numWheels;
    private int speed;

    public Motorcycle(String company, String model, int year) {
        this.company = company;
        this.model = model;
        this.yearRelease = year;
        this.numWheels = 2;
        this.speed = 0;
    }

    public void testDrive() {
        this.speed = 75;
    }

    public void park() {
        this.speed = 0;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public int getSpeed() {
        return speed;
    }

    public String toString() {
        return "This motorcycle is a “ + year + “ “ + make + “ “ + model + “;";
    }
}