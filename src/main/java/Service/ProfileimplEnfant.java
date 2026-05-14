package main.java.Service;

import java.time.LocalDate;
import java.util.Scanner;
import main.java.Modele.Enfant;
import main.java.Service.interfaces.EnfantService;
import main.java.Service.interfaces.ProfileEnfant;
import main.java.variableGlobeaux.VariableIdEnfant;

public class ProfileimplEnfant implements ProfileEnfant {
    OptionQuiz OptionQuiz = new OptionQuiz();
    private final Scanner scanner = new Scanner(System.in);
    private final  EnfantService enfantService = new EnfantImplService();
    private final VariableIdEnfant variable = VariableIdEnfant.getInstance();

    @Override
    public void menu() {
        boolean runing = true;
        while (runing) {
            System.out.println("===== Profile de l'enfant ======");
            System.out.println("1 Details enfants");
            System.out.println("2 Quiz");
            System.out.println("3 Jeux");
            System.out.println("4 Evaluation");
            System.out.println("5 Historique");
            System.out.println("6 retour");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1 -> {
                    Enfant enfant = DetailsEnfant(variable.getId_enfant());
                    if (enfant != null) {
                        System.out.println("ID: " + enfant.getId());
                        System.out.println("Nom: " + enfant.getNom());
                        System.out.println("Prénom: " + enfant.getPrenom());
                        System.out.println("Âge: " + CalculAge(enfant.getDate_naissance()));
                    } else {
                        System.out.println("Aucun enfant trouvé avec cet ID.");
                    }
                }
                    
                case 2 -> OptionQuiz.menu();
                case 6 -> runing = false;
                default -> System.out.println("Vous n'avez rien choisi");

            }
        }
    }

    @Override
    public Enfant DetailsEnfant(int id) {
        return enfantService.findEnfantById(id);
    }

    public static int CalculAge(LocalDate date_naissance) {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear() - date_naissance.getYear();
    }
}
