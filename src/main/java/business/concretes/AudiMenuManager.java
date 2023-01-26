package business.concretes;

import business.abstracts.MenuService;
import core.helpers.Slow;
import entities.concretes.Audi;

import java.util.Scanner;

public class AudiMenuManager extends MenuService {

    Scanner inp = new Scanner(System.in);


    ReservationManager reservationManager = new ReservationManager();

    CustomersManager customersManager = new CustomersManager();

    Audi audi = new Audi();

    public void audiMenu(){
        audi.fillAudiList();
        String select;
        audi.showAvailableCars(true);
        audi.showInAvailableCars(false);
        System.out.println("========================");
        System.out.println("Rezervasyon işlemini bitirmek için 'Q', devam etmek için herhangi bir tuşa basınız");
        select = inp.nextLine();
        if (select.equalsIgnoreCase("Q")){
            getSelectionMenu();
        }
        System.out.println("Lütfen kiralamak istediğiniz arabanın kodunu giriniz");

        String s ="Müşreti kayıt menüsüne yönlendiriliyorsunuz...\n";
        Slow.slowPrint(s,30);
        customersManager.register();
    }







    @Override
    public void getSelectionMenu() {

    }
}
