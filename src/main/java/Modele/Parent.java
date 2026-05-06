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
}