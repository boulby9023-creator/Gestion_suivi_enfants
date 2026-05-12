package main.java.BD;
import java.sql.*;

public class Connexion {
    private static String url = "jdbc:mysql://localhost:3306/suivi_enfant?useSSL=false&serverTimezone=UTC";
    private static String utilisateur = "root";
    private static String mot_de_passe = "ad648258";

    public static Connection getConexion() {
        try {
            Connection conexion = DriverManager.getConnection(url, utilisateur, mot_de_passe);
            System.out.println("Connecté à la base de données !");
            return conexion;
        } catch (Exception e) {
            System.out.println("Erreur de connexion : " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        try {
            Connection con = Connexion.getConexion();
            if (con != null) {
                Statement pont = con.createStatement();
                String sql = "INSERT INTO capacites VALUES (NULL, 'Emotionnelle')";
                int lignesAffectees = pont.executeUpdate(sql);

                System.out.println("Insertion réussie, lignes modifiées : " + lignesAffectees);
                pont.close();
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}