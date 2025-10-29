package com.pluralsight;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle() {
    }

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public Vehicle(String makeModel, int year, int odometer) {
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        double value = getOriginalCost();
        int currentYear = 2025;
        int carAge = currentYear - year;

        if (carAge <= 3) {
            value -= value*(0.03 * carAge);
        } else if (carAge <= 6) {
            value -= value*(0.06 * carAge);

        } else if (carAge <= 10) {
            value -= value*(0.08 * carAge);

        } else {
            value = 1000.00;
        }
        if (odometer > 100000 && !(makeModel.contains("honda" + "toyota"))) {
            value -= value * 0.25;
        }
        return value;
    }
}
