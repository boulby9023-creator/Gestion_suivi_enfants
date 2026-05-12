package main.java;

import java.util.Scanner;
import main.java.Service.ConnexionService;
import main.java.Service.UtilisateurImplService;
import main.java.Service.interfaces.ConnexionInService;
import main.java.Service.interfaces.UtilisateurInService;

public class Authentification {
    private Scanner scanner = new Scanner(System.in);
    private  UtilisateurInService utilisateurInService = new  UtilisateurImplService();
    private ConnexionInService connexionInService = new ConnexionService();

    public void start() {
        boolean runing = true;
        while (runing) { 
            System.out.println("===== Authentification ======");
            System.out.println("1 Inscription");
            System.out.println("2 connexion");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1: utilisateurInService.menu(); break;
                case 2: connexionInService.connexion();break;
                default: 
                    
            }
        }
        
    }

}
