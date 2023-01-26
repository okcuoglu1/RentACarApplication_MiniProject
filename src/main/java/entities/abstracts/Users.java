package entities.abstracts;

import core.helpers.IdMaker;
import entities.concretes.Customers;

public abstract class Users implements IdMaker {



    private String id;
    private String firstName;
    private String lastName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        Customers customers = new Customers();
        customers.idMaker(id);

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                        ", firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'';
    }
}