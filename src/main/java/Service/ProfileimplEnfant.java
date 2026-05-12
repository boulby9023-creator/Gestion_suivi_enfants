package main.java.Service;

import main.java.Modele.Enfant;
import main.java.Service.interfaces.ProfileEnfant;

import java.util.Scanner;

public class ProfileimplEnfant implements ProfileEnfant {
    OptionQuiz OptionQuiz = new OptionQuiz();
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void menu() {
        boolean runing = true;
        while (runing) {
            System.out.println("===== Menu Parent ======");
            System.out.println("1   Details enfants");
            System.out.println("2 Quiz");
            System.out.println("3 Jeux");
            System.out.println("4 Evaluation");
            System.out.println("5 Historique");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1 -> DetailsEnfant();
                case 2 -> OptionQuiz.menu();
                default -> System.out.println("Vous n'avez rien choisi");

            }
        }
    }

    @Override
    public Enfant DetailsEnfant() {
        return null;
    }
}
