package main.java.Service;

import java.util.Scanner;
import main.java.DAO.ImplUtilisateurDao;
import main.java.Service.interfaces.ConnexionInService;

public class ConnexionService implements  ConnexionInService{
    private final Scanner scanner = new Scanner(System.in);
    boolean runing = true;
     private final MenuParent menuParent = new MenuParent();

    @Override
    public void menu() {
       /* while (runing) {
            System.out.println("===== Page de connection ======");
            System.out.println("1 Ajouter Enfant");
            System.out.println("2 Listes enfant");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1 -> enfantService.ajouter();
                case 2 -> listeEnfants.menu();
                default -> System.out.println("Vous n'avez rien choisi");

            }
        }*/
    }

    @Override
    public void connexion() {
        System.out.print("Donnez votre email : ");
        String mail = scanner.nextLine();
        System.out.print("Donnez votre mot de passe : ");
        String motDePasse = scanner.nextLine();

        boolean estConnecter = ImplUtilisateurDao.seConnecter(mail, motDePasse);
        if (estConnecter){
            System.out.println("*******Connection reussi!!! Vous etes connecter*******");
             menuParent.menu();

        } else {
            System.out.println("******L'email ou mot de passe est incorrecte*******");
        }
    }
    
}
