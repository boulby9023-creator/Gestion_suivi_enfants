package main.java.BD;
import java.sql.*;

public class Connexion  {

    static {
        System.out.println("Initialisation faite");
    }
    public static Connexion getConnexion() throws Exception {

        return (Connexion) DriverManager.getConnection("jdbc:mysql://localhost:3306/suivi_enfant","root","root");
    }

    static void main(String[] args) throws Exception{
        Connection conn= (Connection) Connexion.getConnexion();
        Statement executeur=conn.createStatement();
        ResultSet donnees=executeur.executeQuery("INSERT INTO recommandations (id_enfant, description, categorie, priorite) \n" +
                "VALUES \n" +
                "(1, 'Encourager des jeux de mémoire visuelle (memoire) 15 min par jour.', 'Cognitif', 'Haute'),");
    }

}
