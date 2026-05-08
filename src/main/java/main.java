package main.java;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import main.java.BD.ConnexionDB;
import main.java.Modele.Question;
import main.java.enumeration.CapaciteEnum;

public class main {
    
   public static void main(String[] args) {
      
   Connection connection = ConnexionDB.getInstance().getconnection();
    Question q = new  Question();
    q.setId_quest(1);
    q.setContenu("bonjour");
    q.setCapaciteEnum(CapaciteEnum.ATTENTION);
    System.out.println(q.toString());


     try {
           
             if (connection != null) {
                Statement pont = connection.createStatement();
                String sql = "INSERT INTO capacite VALUES (NULL, 'Logique')";
                int n = pont.executeUpdate(sql); 
                if(n>0){
                    System.out.println("capacites inserer avec succès");
                }
             }
        } catch (SQLException e) {
            System.err.println("Erreur INSERT capacites : " + e.getMessage());
        }
       
   }
}
