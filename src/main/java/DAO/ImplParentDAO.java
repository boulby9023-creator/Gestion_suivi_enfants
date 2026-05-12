package main.java.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import main.java.BD.ConnexionDB;
import main.java.Modele.Parent;

public class ImplParentDAO implements Repository<Parent, Integer> {

    Connection con = ConnexionDB.getConexion();
    @Override
    public void save(Parent entity) {
        String sql = "INSERT INTO parents VALUES (?,?)";
        try (PreparedStatement pont = con.prepareStatement(sql)) {
            pont.setInt(1, entity.getId_parent());
            pont.setString(2, entity.getGenre());

            int b =pont.executeUpdate();
            if(b>0){
                        System.err.println("Parent inserer avec succès");
            }
            con.close();
        } catch (SQLException e) {
            System.err.println("Probleme d'insertion de parent");
            System.err.println("Erreur sql: "+e.getSQLState());
            System.err.println("Erreur message: "+e.getMessage());
        }

    }
    @Override
    public Parent findById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }
    @Override
    public List<Parent> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    @Override
    public void update(Integer id, Parent entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    } 
}