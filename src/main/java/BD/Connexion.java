package main.java.BD;
import java.sql.*;

public class Connexion  {
    private static String url="jdbc:mysql://localhost:3306/suivi_enfant";
    private static String utilisateur="root";
    private static String mot_de_passe="root";
    public static Connection getConexion(){
        try {
            Connection conexion=DriverManager.getConnection(url,utilisateur,mot_de_passe);
            System.out.println("Connecter à la base de données !");
            return connexion;
        } catch (java.lang.Exception e) {
            System.out.println("Il y'a un problème au niveau de la connection à la base de données.");
            return "Impossible";
        }
    }
    public static void main(String[] args)throws Exception{
        Connection con=Connexion.getConexion();
        Statement pont=con.createStatement();
        pont.executeQuery("insert into capacite values (null,'Emotionnelle')");
    }
}
