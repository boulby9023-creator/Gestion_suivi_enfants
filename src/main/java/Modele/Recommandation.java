package main.java.Modele;

import java.util.Date;

public class Recommandation{
    private int id;
    private String description;
    private Date date_Recomm;
    private String type_Recomm;

    //constructeur//
    public Recommandation (int id, String description, Date date_Recomm, String type_Recomm){
        this.id=id;
        this.description = description;
        this.date_Recomm = date_Recomm;
        this.type_Recomm = type_Recomm;

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
     public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getTypeRecomm() {
        return type_Recomm;
    }
    public void setTypeRecomm(String description) {
        this.type_Recomm = type_Recomm;
    }
     public Date getDate_Recomm() {
        return date_Recomm;
    }
    public void setDateRecomm(Date date_Recomm) {
        this.date_Recomm = date_Recomm;
    }
}