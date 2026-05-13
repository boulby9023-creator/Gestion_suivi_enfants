
package main.java.BD;

import java.sql.*;

public class Connexion {
   private static String url = "jdbc:mysql://localhost:3306/Suivi_enfant?useSSL=false&serverTimezone=UTC";
   private static String username = "root";
   private  static String mot_de_passe = "Moul@9460";


   public static Connection getConnexion(){
    Connection connexion = null;
        try {
             connexion =  DriverManager.getConnection(url, username, mot_de_passe);
            System.out.println("Connexion etablis avec la base de données");
        } catch ( java.lang.Exception e) {
            System.out.println("Il y a un probleme au niveau de la connexion" + e.getMessage());
        }
        return connexion ;
   }   



     public static void main(String[] args) {
        try {
            Connection con = Connexion.getConnexion();
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

