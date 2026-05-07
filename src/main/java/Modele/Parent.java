package main.java.Modele;

public class Parent extends Utilisateur{
    String genre;

    public Parent(int id, String nom, String prenom, String tel, String mail, String password, String role, String genre){
        super(id, nom, prenom, tel, mail, password, role);
        this.genre = genre;
    }

    public String getGenre(){
        return genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    @Override
    public void creerUtilisateur(Utilisateur moh) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'creerUtilisateur'");
    }

    @Override
    public void modifierUtilisateur(Utilisateur utilisateur) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifierUtilisateur'");
    }

    @Override
    public void seConnecter(String mail, String password) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'seConnecter'");
    }

    @Override
    public void seDeconnecter() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'seDeconnecter'");
    }
}