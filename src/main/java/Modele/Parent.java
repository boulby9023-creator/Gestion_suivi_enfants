package main.java.Modele;

public class Parent extends Utilisateur{
    private int idParent;
    private String genre;

    public Parent(int idParent, String nom, String prenom, String tel, String mail, String password, String role, String genre){
        super(idParent, nom, prenom, tel, mail, password, role);
        this.idParent = idParent;
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


    public int getIdParent() {
        return idParent;
    }


    public void setIdParent(int idParent) {
        this.idParent = idParent;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.idParent;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Parent other = (Parent) obj;
        return this.idParent == other.idParent;
    }
}
