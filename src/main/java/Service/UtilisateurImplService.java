package main.java.Service;

import java.util.Scanner;
import main.java.DAO.ImplAdmin;
import main.java.DAO.ImplParentDAO;
import main.java.DAO.ImplUtilisateurDao;
import main.java.Modele.Admins;
import main.java.Modele.Parent;
import main.java.Modele.Utilisateur;
import main.java.Service.interfaces.UtilisateurInService;
import main.java.enumeration.RoleEnum;
import main.java.variableGlobeaux.Variable;

public class UtilisateurImplService implements UtilisateurInService {
    private final  ImplUtilisateurDao implUtilisateurDao;
    private final ImplParentDAO implParentDAO ;
    private  final  ImplAdmin adminImpl;
    private final MenuParent menuParent;
    private final  Scanner scanner = new Scanner(System.in);
    private final Variable variable = Variable.getInstance();

    private int id_parent;
    

    public int getId_parent() {
        return id_parent;
    }

    public void setId_parent(int id_parent) {
        this.id_parent = id_parent;
    }

    public UtilisateurImplService() {
        this.implUtilisateurDao = new ImplUtilisateurDao();
        this.adminImpl = new ImplAdmin();
        this.implParentDAO= new  ImplParentDAO();
        this.menuParent= new MenuParent();
    }

    @Override
    public void menu() {
        boolean runing = true;
        while (runing) { 
            System.out.println("===== Inscription ======");
            System.out.println("1 Parent");
            System.out.println("2 spécialiste");
            System.out.println("3 Retour");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1 -> inscriptionParent();
                case 2 -> System.err.println("Le specialiste est en cour de developpement");
                default -> runing=false;
                    
            }
    }
    }


  


    @Override
    public void inscriptionAdmin(Admins admin) {
        Utilisateur admin1 = new  Admins();
        admin1.setNom(admin.getNom());
        admin1.setPrenom(admin.getPrenom());
        admin1.setRole(RoleEnum.ADMIN);
        admin1.setMail(admin.getMail());
        admin1.setTel(admin.getTel());
        admin1.setMotDePasse(admin.getMotDePasse());

        implUtilisateurDao.save(admin1);
        System.out.println(admin1.toString());

        Utilisateur utilisateur = implUtilisateurDao.findByMail(admin1.getMail());
        System.out.println(utilisateur.toString());

        Admins a = new Admins();
        a.setId(utilisateur.getId());

        adminImpl.save(a);
        



        

    }



    @Override
    public void inscriptionParent() {
        System.out.print("donnez votre nom : ");
        String nom = scanner.next();
        System.out.print("donnez votre prenom  : ");
        String prenom = scanner.next();
        System.out.print("donnez votre email  : ");
        String mail = scanner.next();
        System.out.print("donnez votre telephone  : ");
        String tel = scanner.next();
        System.out.print("donnez votre mot de passe  : ");
        String motDePasse = scanner.next();
        System.out.print("Veuillez donner le genre pere ou mere  : ");
        String genre = scanner.next();


       Utilisateur parent = new  Parent();
        parent.setNom(nom);
        parent.setPrenom(prenom);
        parent.setRole(RoleEnum.PARENT);
        parent.setMail(mail);
        parent.setTel(tel);
        parent.setMotDePasse(motDePasse);

        implUtilisateurDao.save(parent);

        Utilisateur utilisateur = implUtilisateurDao.findByMail(mail);

        Parent p = new  Parent();
        p.setGenre(genre);
        p.setId_parent(utilisateur.getId());

        implParentDAO.save(p);

        variable.setId_parent(utilisateur.getId());

        menuParent.menu();



    }





    
    
}