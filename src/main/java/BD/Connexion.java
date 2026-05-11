package main.java.BD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connexion {
    private static String url = "jdbc:mysql://localhost:3306/suivi_enfant";
    private static String utilisateur = "root";
    private static String mot_de_passe = "coulib@ly16";

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