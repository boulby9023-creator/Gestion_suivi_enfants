package main.java.BD;
import java.sql.*;

public class Connexion {
    private static final String URL = "jdbc:mysql://localhost:3306/gestion_suivi_enfant";

    private static final String USER ="root";
    private static final String PASSWORD = "Obkanadji223";
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connexion réussie !");
            connection.close();
        } catch (SQLException e) {
            System.out.println("Erreur de connexion : " + e.getMessage());
        }
    }
}
