package main.java.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import main.java.BD.ConnexionDB;
import main.java.Modele.Admin;

public class ImplAdmin implements Repository <Admin , Integer> {
    
    Connection con = ConnexionDB.getConexion();

    @Override
    public void save(Admin admin) {
        String sql = "INSERT INTO admins VALUES (?)";
        try (PreparedStatement pont = con.prepareStatement(sql)) {
            pont.setInt(1, admin.getId());
           
            int b =pont.executeUpdate();
            if(b > 0){
                System.err.println("Admin inserer avec succès");
            }
            con.close();
        
        } catch (SQLException e) {
           System.err.println("Erreur lors de l'insertion de l'admin");
        }
        
    }  
    
    @Override
    public Admin findById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<Admin> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
