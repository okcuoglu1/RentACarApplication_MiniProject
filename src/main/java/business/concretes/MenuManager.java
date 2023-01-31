package business.concretes;

import business.abstracts.MenuService;
import core.helpers.Start;
import entities.concretes.Honda;

import java.util.Scanner;

public class MenuManager extends MenuService {








    @Override
    public void getSelectionMenu() {

            HondaMenuManager hondaMenuManager = new HondaMenuManager();
            AudiMenuManager audiMenuService = new AudiMenuManager();
            BmwMenuManager bmwMenuService = new BmwMenuManager();
            Scanner inp = new Scanner(System.in);
            int select;
            System.out.println("Lütfen kiralamak istediğiniz aracın markasını giriniz");
            System.out.println("1-Honda");
            System.out.println("2-Audi");
            System.out.println("3-BMW");
            System.out.println("0-Ana Menü");
            select = inp.nextInt();

            switch (select){
                case 1:
                    hondaMenuManager.hondaMenu();
                    break;
                case 2:
                    audiMenuService.audiMenu();
                    break;
                case 3:
                    bmwMenuService.bmwMenu();
                    break;
                case 0:
                    Start.start();
                default:
                    System.out.println("Geçersiz Giriş");
            }





        }

    }

