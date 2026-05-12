package main.java.Modele;

import java.util.Date;

public class Enfant {

    private int id;
    private String nom;
    private String prenom;
    private Date date_naissance;
    private String sexe;
    private int id_activite;
    private int id_parent;

    public Enfant(int id, String nom, String prenom, Date date_naissance, String sexe, int id_activite,int id_parent) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.date_naissance = date_naissance;
        this.sexe = sexe;
        this.id_activite = id_activite;
        this.id_parent = id_parent;
    }
    public Enfant() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    } 
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public Date getDate_naissance() {
        return date_naissance;
    }
    public void setDate_naissance(Date age) {
        this.date_naissance = age;
    }
    public String getSexe() {
        return sexe;
    }
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public int getIdActivite(){
        return id_activite;
    }

    public void setActivite(int id_activite){
        this.id_activite = id_activite;
    }

    public int getIdParent(){
        return id_parent;
    }

    public void setIdParent(int id_parent){
        this.id_parent = id_parent;

    }
}
