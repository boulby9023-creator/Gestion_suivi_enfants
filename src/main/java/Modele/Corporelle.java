package main.java.Modele;
import java.util.Scanner;
public class Corporelle {
    private  double poids;
    private double taille;
    private double imc;
    private java.util.Date date;

    public Corporelle(double poids, double taille) {
        this.poids = poids;
        this.taille = taille;
       
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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez votre poids en kg : ");
        double poids = scanner.nextDouble();
        System.out.println("Votre poids est : " + poids + " kg");
        System.out.print("Entrez votre taille en m : ");
        double taille = scanner.nextDouble();
        System.out.println("Votre taille est : " + taille + " m");
        Corporelle corporelle = new Corporelle(poids, taille);
        System.out.println("Votre IMC est : " + corporelle.getImc(poids, taille));
        scanner.close();

    }