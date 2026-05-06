package main.java.Modele;
import java.util.Scanner;
public class Corporelle {
    private  double poids;
    private double taille;
    private double imc;
    private java.util.Date date;

   

    public Corporelle() {
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