package main.java.Service;

import java.util.Scanner;

import main.java.Service.interfaces.EnfantService;

public class MenuParent {
    private final  Scanner scanner = new Scanner(System.in);
    private final EnfantService enfantService = new EnfantImplService();
    boolean runing = true;


    public void menu(){
         while (runing) { 
            System.out.println("===== Menu Parent ======");
            System.out.println("1 Ajouter Enfant");
            System.out.println("2 Listes enfant");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1 -> enfantService.ajouter();
                case 2 -> enfantService.ListeEnfant();
                default -> System.out.println("Vous n'avez rien choisi");
                    
            }
    }
    }
}
