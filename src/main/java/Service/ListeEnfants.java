package main.java.Service;

import java.util.List;
import java.util.Scanner;
import main.java.Modele.Enfant;
import main.java.Service.interfaces.EnfantService;
import main.java.Service.interfaces.ProfileEnfant;
import main.java.variableGlobeaux.variableIdEnfant;

public class ListeEnfants {
    private final  EnfantService enfantService = new EnfantImplService();
    private final Scanner scanner = new Scanner(System.in);
    private final  ProfileEnfant profileEnfant = new ProfileimplEnfant();
    private final variableIdEnfant variable = variableIdEnfant.getInstance();

    public void menu() {
        boolean runing = true;
        List<Enfant> enfants = enfantService.ListeEnfant();
        while (runing) {
            System.out.println("===== Liste des enfant ======");
            for (Enfant enfant : enfants) {
                System.out.println(enfant.getId() +" "+ enfant.getPrenom() );
            }
            System.out.println("Choissez un enfant par son ID pour voir son profile");
            int choix = scanner.nextInt();
            
            Enfant enfant = enfantService.findEnfantById(choix);

            if(enfant != null){
                variable.setId_enfant(enfant.getId());
                profileEnfant.menu();
            }else{
                System.out.println("Aucun enfant trouvé avec cet ID.");
            }



    }
    }


    
}
