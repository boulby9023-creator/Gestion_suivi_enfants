package main.java.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import main.java.BD.ConnexionDB;
import main.java.Modele.Admin;
import main.java.Modele.Utilisateur;

public class ImplAdminDao implements Repository <Admin , Integer> {
    
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
        String sql = " SELECT * FROM admins a JOIN utilisateurs u ON a.idAdmin = u.id WHERE a.idAdmin = ? ";

    try (PreparedStatement pont = con.prepareStatement(sql)) {

        pont.setInt(1, id);

        ResultSet rs = pont.executeQuery();
        Admin admin = new Admin();

        if (rs.next()) {

            admin.setIdAdmin(rs.getInt("idAdmin"));
            admin.setNom(rs.getString("nom"));
            admin.setPrenom(rs.getString("prenom"));
            admin.setTel(rs.getString("tel"));
            admin.setMail(rs.getString("mail"));
            admin.setMotDePasse(rs.getString("mot_de_passe"));
            admin.setRole(rs.getString("role"));

            return admin;
        }

    } catch (SQLException e) {

       System.err.println("Erreur lors de la recherche de l'admin");
    }

    return null;
}
    

    @Override
    public List<Admin> findAll() {
        List<Admin> liste = new ArrayList<>();

    String sql = " SELECT * FROM admins a JOIN utilisateurs u ON a.idAdmin = u.id";

    try (PreparedStatement pont = con.prepareStatement(sql)) {

        ResultSet rs = pont.executeQuery();
        Admin admin = new Admin();

        while (rs.next()) {

            admin.setIdAdmin(rs.getInt("idAdmin"));
            admin.setNom(rs.getString("nom"));
            admin.setPrenom(rs.getString("prenom"));
            admin.setTel(rs.getString("tel"));
            admin.setMail(rs.getString("mail"));
            admin.setMotDePasse(rs.getString("mot_de_passe"));
            admin.setRole(rs.getString("role"));

            liste.add(admin);
        }

    } catch (SQLException e) {

        System.err.println("Erreur lors de la recherche de l'admin");
    }

    return liste;
}
    



    @Override
    public void delete(Integer id) {
        

    String sql = "DELETE FROM admins WHERE idAdmin=?";

    try (PreparedStatement pont = con.prepareStatement(sql)) {

        pont.setInt(1, id);

        int b = pont.executeUpdate();

        if (b > 0) {
            System.out.println("Admin supprimé");
        }

    } catch (SQLException e) {

        System.err.println("Erreur lors de la suppression de l'admin");
    }

}

    @Override
    public void updtae(Integer id, Admin entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
