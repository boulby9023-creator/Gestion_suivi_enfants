package main.java.Modele;

import main.java.enumeration.RoleEnum;

public class Admins extends Utilisateur {
    private int idAdmin;

    public Admins(int id, String nom, String prenom, String tel, String mail, String password, RoleEnum role, int idAdmin){
        this.idAdmin=idAdmin;
        super(id, nom, prenom, tel,mail, mot_de_passe, role );
    }

<<<<<<< HEAD:src/main/java/Modele/Admins.java
    public Admins(){}

    
=======
    public Admin(){

    }
    
 
    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }
>>>>>>> c2ca633850a1bf0ffe617298ca340b10bc47aebd:src/main/java/Modele/Admin.java

    public void  creerUtilisateur(Utilisateur moh){
        //
    }
    public void  modifierUtilisateur(Utilisateur utilisateur){

    }
    public void  seConnecter(String mail, String password){

    }
    public void  seDeconnecter(){

    }

<<<<<<< HEAD:src/main/java/Modele/Admins.java
    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }
=======
>>>>>>> c2ca633850a1bf0ffe617298ca340b10bc47aebd:src/main/java/Modele/Admin.java

}
