package main.java.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import main.java.DAO.ImplEnfantDAO;
import main.java.Modele.Enfant;
import main.java.Service.interfaces.CorporelleService;
import main.java.Service.interfaces.EnfantService;
import main.java.variableGlobeaux.Variable;
import main.java.variableGlobeaux.VariableIdEnfant;

public class EnfantImplService implements EnfantService {
    private final Scanner scanner = new Scanner(System.in);
    private final ImplEnfantDAO enfantDAO = new ImplEnfantDAO();
    private final Variable variable = Variable.getInstance();
    private final VariableIdEnfant variableIdEnfant = VariableIdEnfant.getInstance();
    private final CorporelleService corporelleImplService = new CorporelleImplService();
    



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
        enfant.setParent(variable.getId_parent());

        Enfant savedEnfant = enfantDAO.saveEnfant(enfant);
        variableIdEnfant.setId_enfant(savedEnfant.getId());


        corporelleImplService.ajouterCorporelle();



    }

    @Override
    public List<Enfant> ListeEnfant() {
        return enfantDAO.findAllByIdParent(variable.getId_parent());
    }

    @Override
    public Enfant findEnfantById(int id) {
        return enfantDAO.findById(id);
    }

    
    
}
