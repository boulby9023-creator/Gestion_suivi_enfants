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


    public void sinscrir(){
        
    }
    public void creerProfilEnfant(){

    }
    public void consulterProfilEnfant(){

    }
    public void modifierProfilEnfant(){

    }
    public void supprimerProfilEnfant(){

    }
    public void voirRecommandation(){

    }
    public void consulterConseil(){

    }
    public void ajouterDonneesCorporelles(){

    }
    public void voirHistoriqueEnfant(){

    }
    public void voirSuggestionPedagogique(){

    }
}