package main.java;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import main.java.BD.ConnexionDB;
import main.java.Modele.Question;
import main.java.enumeration.CapaciteEnum;

public class main {
    
   public static void main(String[] args) {
      
   //Connection connection = ConnexionDB.getInstance().getconnection();

    Question q = new  Question();
    q.setId_quest(1);
    q.setContenu("bonjour");
    q.setCapaciteEnum(CapaciteEnum.ATTENTION);
    System.out.println(q.toString());


    try {
            Connection con = ConnexionDB.getConexion();
            if (con != null) {
                Statement pont = con.createStatement();
                String sql = "INSERT INTO capacite VALUES (NULL, 'Emotionnelle')";
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
