package business.concretes;

import business.abstracts.MenuService;
import core.helpers.GetCar;
import core.helpers.Slow;
import entities.concretes.Bmw;

import java.awt.*;
import java.util.Scanner;

public class BmwMenuManager extends MenuManager {

    Scanner inp = new Scanner(System.in);

    ReservationManager reservationManager = new ReservationManager();
    GetCar getCar = new GetCar();

    CustomersManager customersManager = new CustomersManager();

    Bmw bmw = new Bmw();

    public void bmwMenu(){
        bmw.fillBmwList();
        String select;
        bmw.showBmwCars();
        System.out.println("========================");
        System.out.println("Rezervasyon işlemini bitirmek için 'Q', devam etmek için herhangi bir tuşa basınız");
        select = inp.nextLine();
        if (select.equalsIgnoreCase("Q")){
            getSelectionMenu();
        }
        System.out.println("Lütfen kiralamak istediğiniz arabanın kodunu giriniz");
        getCar.getBmw();
        String s ="Müşreti kayıt menüsüne yönlendiriliyorsunuz...\n";
        Slow.slowPrint(s,30);
        customersManager.register();
    }
}


