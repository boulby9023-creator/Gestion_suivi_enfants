package main.java.Service;

import java.util.Scanner;
import main.java.DAO.ImplUtilisateurDao;
import main.java.Modele.Utilisateur;
import main.java.Service.interfaces.ConnexionInService;
import main.java.variableGlobeaux.Variable;

public class ConnexionService implements  ConnexionInService{
    private final  ImplUtilisateurDao implUtilisateurDao = new ImplUtilisateurDao();
    private final Scanner scanner = new Scanner(System.in);
    private final Variable variable = Variable.getInstance();
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

        boolean estConnecter = implUtilisateurDao.seConnecter(mail, motDePasse);
        if (estConnecter){
            System.out.println("*******Connection reussi!!! Vous etes connecter*******");
             Utilisateur utilisateur = implUtilisateurDao.findByMail(mail);

            variable.setId_parent(utilisateur.getId());
            System.out.println("Id parent stocker dans variable global : " + variable.getId_parent());
             menuParent.menu();

        } else {
            System.out.println("******L'email ou mot de passe est incorrecte*******");
        }

       

    }
    
}
