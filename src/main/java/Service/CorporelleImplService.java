package main.java.Service;

import java.util.Scanner;
import main.java.DAO.ImplcorporelleDao;
import main.java.Modele.Corporelle;
import main.java.Service.interfaces.CorporelleService;
import main.java.variableGlobeaux.VariableIdEnfant;

public class CorporelleImplService implements CorporelleService {
    private  final Scanner scanner = new Scanner(System.in);
    private final  VariableIdEnfant variableIdEnfant = VariableIdEnfant.getInstance();
    private final ImplcorporelleDao corporelleDao = new ImplcorporelleDao();

   

    @Override
    public void ajouterCorporelle() {
        System.out.print("Donner le poids de ton enfant : ");
        String poids = scanner.nextLine();
        System.out.print("Donner la taille de ton enfant : ");
        String taille = scanner.nextLine();
        
        Corporelle corporelle = new Corporelle();

        corporelle.setId_enfant(variableIdEnfant.getId_enfant());
        corporelle.setPoids(Double.parseDouble(poids));
        corporelle.setTaille(Double.parseDouble(taille));
        double imc = Double.parseDouble(poids) / (Double.parseDouble(taille) * Double.parseDouble(taille));
        corporelle.setImc(imc);

        corporelleDao.save(corporelle);
    }
    
}
