package main.java.Modele;
public abstract class Activite{
    protected int id;
    protected String titre;
    protected String description;
    protected int ageCible;

    //constructeur//
    public Activite (int id, String titre, String description, int ageCible){
        this.id=id;
        this.titre=titre;
        this.description=description;
        this.ageCible=ageCible;
    }

}