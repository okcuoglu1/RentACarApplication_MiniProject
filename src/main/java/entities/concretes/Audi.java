package entities.concretes;

import entities.abstracts.Cars;

import java.util.ArrayList;
import java.util.List;

public class Audi extends Cars {

    public List<Audi> audiList = new ArrayList<>();

    private String model;

    public Audi() {
    }

    public Audi(String brandName, String model, String id, int modelYear, boolean gear, String fuelType, double dailyPrice,boolean isActive) {
        super.setBrandName(brandName);
        super.setModel(model);
        super.setId(id);
        super.setModelYear(modelYear);
        super.setGear(gear);
        super.setFuelType(fuelType);
        super.setDailyPrice(dailyPrice);
        super.setActive(isActive);
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return
                "Id: " + getId() +
                        ", Model: "+ getModel() +
                        ", Model Year: "+ getModelYear() +
                        ", Automatic Gear: "+ isGear() +
                        ", Fuel Type: " + getFuelType() +
                        ", Daily Price: " + getDailyPrice()
                ;
    }

    public void fillAudiList(){
        Audi audi  = new Audi("Audi","A1","AA12020100",2020,true,"gasoline",75.90,true);
        Audi audi2 = new Audi("Audi","A1","AA12022101",2022,false,"electric",55.90,true);
        Audi audi3 = new Audi("Audi","A2","AA22021100",2021,true,"diesel",65.90,true);
        Audi audi4 = new Audi("Audi","A3","AA32022100",2022,true,"gasoline",65.90,true);
        Audi audi5 = new Audi("Audi","A4","AA42022100",2022,false,"hybrid",75.90,true);
        Audi audi6 = new Audi("Audi","A5","AA52023100",2023,true,"gasoline",85.90,true);
        Audi audi7 = new Audi("Audi","Q7","AQ72021100",2021,true,"diesel",95.90,false);
        Audi audi8 = new Audi("Audi","Q7","AQ72020101",2020,true,"electric",105.90,true);
        audiList.add(audi);
        audiList.add(audi2);
        audiList.add(audi3);
        audiList.add(audi4);
        audiList.add(audi5);
        audiList.add(audi6);
        audiList.add(audi7);
        audiList.add(audi8);

    }

    public void showAvailableCars(boolean isActive){

        System.out.printf("%-7s  %-10s  %-10s  %-10s  %-14s  %-10s %-15s\n","Marka","Model","ID","Model Yılı","Otomatik Vites","Yakıt Tipi","Günlük Fiyat");
        System.out.printf("%-7s  %-10s  %-10s  %-10s  %-14s  %-10s %-15s\n","-----","-----","--","----------","--------------","----------","------------");



        for (Audi w:audiList){

            if(w.isActive()==isActive){
                System.out.printf("%-7s  %-10s  %-10s  %-10s  %-14s  %-10s $%-14s\n","Honda",w.getModel(),w.getId(),w.getModelYear(),w.isGear(),w.getFuelType(),w.getDailyPrice());
            }


        }

    }

    @Override
    public void showSelectedCar(boolean isActive) {

    }

    @Override
    public void showInactiveCars(boolean isActive) {

    }


    public void showInAvailableCars(boolean isActive){

        System.out.printf("%-7s  %-10s  %-10s  %-10s  %-14s  %-10s %-15s\n","Marka","Model","ID","Model Yılı","Otomatik Vites","Yakıt Tipi","Günlük Fiyat");
        System.out.printf("%-7s  %-10s  %-10s  %-10s  %-14s  %-10s %-15s\n","-----","-----","--","----------","--------------","----------","------------");



        for (Audi w:audiList){

            if(w.isActive()!=isActive){
                System.out.printf("%-7s  %-10s  %-10s  %-10s  %-14s  %-10s $%-14s\n","Honda",w.getModel(),w.getId(),w.getModelYear(),w.isGear(),w.getFuelType(),w.getDailyPrice());
            }


        }

    }


}
