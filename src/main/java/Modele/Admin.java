package main.java.Modele;

public class Admin extends Utilisateur {
    private int idAdmin;

    public Admin(int id, String nom, String prenom, String tel, String mail, String password, String role, int idAdmin){
        this.idAdmin=idAdmin;
        super(id, nom, prenom, tel,mail, password, role );
    }

    public Admin(){}


    public void  creerUtilisateur(Utilisateur moh){
        //
    }
    public void  modifierUtilisateur(Utilisateur utilisateur){

    }
    public void  seConnecter(String mail, String password){

    }
    public void  seDeconnecter(){

    }

}
