package main.java.Modele;

import main.java.enumeration.RoleEnum;

public class Admins extends Utilisateur {
    private int idAdmin;

    public Admins(int id, String nom, String prenom, String tel, String mail, String password, RoleEnum role, int idAdmin){
        this.idAdmin=idAdmin;
        super(id, nom, prenom, tel,mail, password, role );
    }

    public Admins(){}

    

    public void  creerUtilisateur(Utilisateur moh){
        //
    }
    public void  modifierUtilisateur(Utilisateur utilisateur){

    }
    public void  seConnecter(String mail, String password){

    }
    public void  seDeconnecter(){

    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

}
