package main.java.Modele;
import java.util.Scanner;
public class Corporelle {
    private int id;
    private  double poids;
    private double taille;
    private double imc;
    private java.util.Date date;

   

    public Corporelle( int id, double poids, double taille, java.util.Date date) {
        this.id = id;
        this.poids = poids;
        this.taille = taille;
        this.date = date;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getPoids() {
        return poids;
    }
    public void setPoids(double poids) {
        this.poids = poids;
       
    }
    public double getTaille() {
        return taille;
    }
    public void setTaille(double taille) {
        this.taille = taille;
       
    }
    public double getImc(double poids, double taille) {
        imc = poids / (taille * taille);
        return imc;
 
    }
   
}