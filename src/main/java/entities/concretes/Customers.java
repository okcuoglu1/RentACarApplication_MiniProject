package entities.concretes;

import core.helpers.IdMaker;
import entities.abstracts.Users;

public class Customers extends Users implements IdMaker {

    public static int counter = 1000;
    private String tcNo;
    private int age;



    public Customers() {
    }

    public Customers(String tcNo, int age,String id, String firstName, String lastName) {
        this.tcNo = tcNo;
        this.age = age;
        super.setId(id);
        super.setFirstName(firstName);
        super.setLastName(lastName);
    }



    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  "ID: "+getId() +
                ", Name: " + getFirstName() +
                ", Surname: " + getLastName() +
                ", Age: "+ getAge() +
                ", T.C NO: "+getTcNo();
    }

    @Override
    public String idMaker(String number) {
        String suffix= "CUST";

        number = number.substring(number.length()-3);

        return suffix+number+counter;

    }
}