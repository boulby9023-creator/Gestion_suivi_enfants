package main.java.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import main.java.DAO.ImplEnfantDAO;
import main.java.Modele.Enfant;
import main.java.Service.interfaces.EnfantService;

public class EnfantImplService implements EnfantService {
    private final Scanner scanner = new Scanner(System.in);
    private final ImplEnfantDAO enfantDAO = new ImplEnfantDAO();
    



    @Override
    public void menu() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'menu'");
    }

    @Override
    public void ajouter() {
        System.out.print("Donner le nom de ton enfant : ");
        String nom = scanner.nextLine();
        System.out.print("Donner le prenom de ton enfant : ");
        String prenom = scanner.nextLine();
        System.out.print("Donner la date de naissance de ton enfant  : ");
        String dateDeNaissance = scanner.next();
        System.out.print("Ton enfant est un garçon ou une fille  : ");
        String sexe = scanner.next();

        Enfant enfant = new Enfant();

        enfant.setNom(nom);
        enfant.setPrenom(prenom);
        LocalDate localDate = LocalDate.parse(dateDeNaissance);

        enfant.setDate_naissance(localDate);
        enfant.setSexe(sexe);
        enfant.setParent(1);

        enfantDAO.save(enfant);



    }

    @Override
    public List<Enfant> ListeEnfant() {
        return enfantDAO.findAll();
    }

    
    
}
