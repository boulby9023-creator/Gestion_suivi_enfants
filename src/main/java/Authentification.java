package main.java;

import java.util.Scanner;
import main.java.Service.ConnexionService;
import main.java.Service.UtilisateurImplService;
import main.java.Service.interfaces.ConnexionInService;
import main.java.Service.interfaces.UtilisateurInService;

public class Authentification {
    private final  Scanner scanner = new Scanner(System.in);
    private final  UtilisateurInService utilisateurInService = new  UtilisateurImplService();
    private final ConnexionInService connexionInService = new ConnexionService();

    public void start() {
        boolean runing = true;
        while (runing) { 
            System.out.println("===== Authentification ======");
            System.out.println("1 Inscription");
            System.out.println("2 connexion");
            System.out.println("3 connexion en tant que admin");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1 -> utilisateurInService.menu();
                case 2 -> connexionInService.connexion();
                case 3 -> System.out.println("En cours de développement...");
                default -> { 
                    System.out.println("Choix invalide. Veuillez réessayer.");
                    runing = false;
                }
                    
            }
        }
        
    }

}
