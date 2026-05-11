package main.java.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import main.java.BD.ConnexionDB;
import main.java.Modele.Recommandation;

public class ImplRecommandationDao implements Repository<Recommandation, Integer> {

    @Override
    public void save(Recommandation entity) {

        Connection con = ConnexionDB.getConexion();

        String sql = "INSERT INTO recommandation(description, date_recomm, idEvaluation, idCapacite) VALUES (?,?,?,?)";

        try (PreparedStatement pont = con.prepareStatement(sql)) {

            pont.setString(1, entity.getDescription());

            pont.setDate(2, (Date) entity.getDate_Recomm());

            pont.setInt(3, entity.getIdEvaluation());

            pont.setInt(4, entity.getIdCapacite());

            int lignes = pont.executeUpdate();

            if (b) {
                System.out.println("Recommandation insérée avec succès");
            }
            con.close();

        } catch (SQLException e) {

            System.out.println("Il y a un problème avec l'insertion");
            e.printStackTrace();
        }
    }
}
     

    public ImplRecommandationDao() {
    }
    @Override
    public Recommandation findById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<Recommandation> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}