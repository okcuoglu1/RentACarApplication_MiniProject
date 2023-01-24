package entities.abstracts;

public abstract class Cars {

    private String id;
    private int modelYear;
    private boolean gear=false;
    private String fuelType;
    private double dailyPrice;

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
