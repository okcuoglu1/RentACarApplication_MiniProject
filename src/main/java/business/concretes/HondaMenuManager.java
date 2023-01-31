package business.concretes;

import business.abstracts.MenuService;
import core.helpers.GetCar;
import core.helpers.Slow;
import entities.concretes.Honda;

import java.util.Scanner;

public class HondaMenuManager extends MenuManager {

    Scanner inp = new Scanner(System.in);

    ReservationManager reservationManager = new ReservationManager();

    CustomersManager customersManager = new CustomersManager();

    GetCar getCar = new GetCar();

    Honda honda = new Honda();

    public void hondaMenu(){

        honda.fillHondaList();
        String select;
        honda.showAvailableCars(true);
        //honda.showInAvailableCars(false);
        System.out.println("========================");
        System.out.println("Rezervasyon işlemini bitirmek için 'Q', devam etmek için herhangi bir tuşa basınız");
        select = inp.nextLine();
        if (select.equalsIgnoreCase("Q")){
            getSelectionMenu();
        }
        System.out.println("Lütfen kiralamak istediğiniz arabanın kodunu giriniz");
        getCar.getHonda();
        String s ="Müşreti kayıt menüsüne yönlendiriliyorsunuz...\n";
        Slow.slowPrint(s,30);
        customersManager.register();
    }






}
