package entities.abstracts;

import entities.concretes.Honda;

import java.util.List;

public abstract class Cars {

    private String id;
    private int modelYear;
    private boolean gear=false;
    private String fuelType;
    private double dailyPrice;
    private boolean isActive = true;

//    private String colour;
//    private int km;
//    private int seat;
//    private int door;
//    private String ac;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public boolean isGear() {
        return gear;
    }

    public void setGear(boolean gear) {
        this.gear = gear;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(double dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public abstract void showAvailableCars(boolean isActive);
    public abstract void showInAvailableCars(boolean isActive);





    @Override
    public String toString() {
        return "Cars{" +
                "id='" + id + '\'' +
                ", modelYear=" + modelYear +
                ", gear=" + gear +
                ", fuelType='" + fuelType + '\'' +
                ", dailyPrice=" + dailyPrice +
                '}';
    }





}

