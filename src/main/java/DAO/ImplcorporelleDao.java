package main.java.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import main.java.BD.ConnexionDB;
import main.java.Modele.Corporelle;

public class ImplcorporelleDao implements Repository< Corporelle, Integer> {

    @Override
    public void save(Corporelle entity) {
        Connection con = ConnexionDB.getConexion();
        String sql = "INSERT INTO corporelles VALUES (?,?,?,?,?,?)";
                try (PreparedStatement pont = con.prepareStatement(sql)) {
                    pont.setNull(1, java.sql.Types.INTEGER);
                    pont.setInt(2, entity.getId_enfant());
                    pont.setDouble(3, entity.getPoids());
                     pont.setDouble(4, entity.getTaille());
                     pont.setDouble(5, entity.getImc());
                     pont.setDate(6, entity.getDate_mesure() != null ? new java.sql.Date(entity.getDate_mesure().getTime()) : null);

                    int b =pont.executeUpdate();
                    if(b>0){
                        System.err.println("Capacite corporelle inserer avec succès");
                    }

                    con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Corporelle findById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<Corporelle> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public void updtae(Integer id, Corporelle entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    }