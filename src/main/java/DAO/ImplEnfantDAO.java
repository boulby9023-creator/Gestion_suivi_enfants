package main.java.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import static java.sql.Types.INTEGER;
import java.util.List;
import main.java.BD.Connexion;
import main.java.Modele.Enfant;

public class ImplEnfantDAO implements Repository<Enfant, Integer> {

    @Override
    public void save(Enfant entity) {
        try{
        Connection con = Connexion.getConexion();
        String sql = "INSERT INTO enfants(id_enfants, nom, prenom, date_naissance, sexe, id_activites, id_parent) Values (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stm1 = con.prepareStatement(sql);
        stm1.setNull(1, INTEGER);
        stm1.setString(2, entity.getNom());
        stm1.setString(3, entity.getPrenom());
        stm1.setDate(4, java.sql.Date.valueOf(entity.getDate_naissance())); 
        stm1.setString(5, entity.getSexe());
        stm1.setInt(6, entity.getId());
        stm1.setInt(7, entity.getid_parent());

        stm1.execute();
        con.close();
        }
        catch(SQLException e){
             System.err.println("Probleme d'insertion d'enfant");
            System.err.println("Erreur sql: "+e.getSQLState());
            System.err.println("Erreur message: "+e.getMessage());
        }
    }

    @Override
    public Enfant findById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<Enfant> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public void updtae(Integer id, Enfant entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updtae'");
    }
    
}
