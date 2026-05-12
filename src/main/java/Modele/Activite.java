package main.java.Modele;


public class Activite{
    protected int id;
    protected String titre;
    protected String description;
    protected int ageCible;
    protected int id_capacite;

    //constructeur//
   public Activite(int id, String titre, String description, int ageCible, int id_capacite) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.ageCible = ageCible;
        this.id_capacite = id_capacite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAgeCible() {
        return ageCible;
    }

    public void setAgeCible(int ageCible) {
        this.ageCible = ageCible;
    }

    public int getId_capacite() {
        return id_capacite;
    }

    public void setId_capacite(int id_capacite) {
        this.id_capacite = id_capacite;
    }

    @Override
    public String toString() {
        return "Activite {id=" + id + ", titre=" + titre + ", description=" + description + ", ageCible=" + ageCible
                + ", id_capacite=" + id_capacite + "}";
    }


    
}