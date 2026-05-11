package main.java.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import main.java.BD.ConnexionDB;
import main.java.Modele.Evaluation;

public class implEvaluationDao implements Repository<Evaluation, Integer> {

    @Override
    public void save(Evaluation entity) {
        Connection con = ConnexionDB.getConexion();
        String sql = "INSERT INTO evaluation VALUES (?,?,?,?,?)";
                try (PreparedStatement pont = con.prepareStatement(sql)) {
                    pont.setInt(1, entity.getScore());
                    pont.setInt(2, entity.getScoreglobal());
                    pont.setDate(3, (Date)entity.getDateEval());
                    pont.setInt(4, entity.getIdEnfant());
                    pont.setInt(5, entity.getIdActivite());

                    boolean b =pont.execute();
                    if(b){
                        System.err.println("Evaluation inserer avec succès");
                    }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Evaluation findById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<Evaluation> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
