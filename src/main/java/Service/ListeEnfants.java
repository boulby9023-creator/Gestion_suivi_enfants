package main.java.Service;

import java.util.List;
import java.util.Scanner;

import main.java.Modele.Enfant;
import main.java.Service.interfaces.EnfantService;
import main.java.Service.interfaces.ProfileEnfant;

public class ListeEnfants {
    private EnfantService enfantService = new EnfantImplService();
    private final Scanner scanner = new Scanner(System.in);
    private ProfileEnfant profileEnfant = new ProfileimplEnfant();

    public void menu() {
        boolean runing = true;
        List<Enfant> enfants = enfantService.ListeEnfant();
        while (runing) {
            System.out.println("===== Liste des enfant ======");
            for (Enfant enfant : enfants) {
                System.out.println(enfant.getId() +" "+ enfant.getPrenom() );
            }
            int choix = scanner.nextInt();

    }
    }


    public List<Enfant> listEnfants(){
        return null;
    }

    
}
