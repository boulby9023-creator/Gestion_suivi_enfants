package main.java.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import main.java.BD.ConnexionDB;
import main.java.Modele.Utilisateur;

public class ImplUtilisateurDao implements Repository<Utilisateur, Integer>{
    Connection con = ConnexionDB.getConexion();
    @Override
    public void save(Utilisateur entity) {
        entity.toString();
        String sql = "INSERT INTO utilisateurs VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement prepare = con.prepareStatement(sql);
            prepare.setNull(1, 0);
            prepare.setString(2, entity.getNom());
            prepare.setString(3, entity.getPrenom());
            prepare.setString(4, entity.getTel());
            prepare.setString(5, entity.getMail());
            prepare.setString(6, entity.getMotDePasse());
            prepare.setString(7, "parent");

            int test = prepare.executeUpdate();
            if (test >0 ){
                System.out.println("Utilisateur ajouter avec sucess!!!" + test);
            }
        } catch (SQLException e) {
            System.err.println("Un probleme est survenu lors de l'insertion");
            System.err.println("Erreur sql: "+e.getSQLState());
            System.err.println("Erreur message: "+e.getMessage());

        }

    }

    @Override
    public Utilisateur findById(Integer integer) {
        return null;
    }

    @Override
    public List<Utilisateur> findAll() {
        return List.of();
    }

    @Override
    public void delete(Integer integer) {
    }

    @Override
    public void updtae(Integer id, Utilisateur entity) {
        throw new UnsupportedOperationException("Unimplemented method 'updtae'");
    }

    public Utilisateur findByMail(String mail){
        String sql = "SELECT * FROM utilisateurs WHERE mail = ?";
        try (PreparedStatement pont = con.prepareStatement(sql)) {
            pont.setString(1, mail);
            ResultSet rs = pont.executeQuery();
            if (rs.next()) {
                Utilisateur utilisateur = new Utilisateur();
                utilisateur.setId(rs.getInt("id"));
                utilisateur.setNom(rs.getString("nom"));
                utilisateur.setPrenom(rs.getString("prenom"));
                utilisateur.setRole(null);
                utilisateur.setMail(rs.getString("mail"));
                utilisateur.setTel(rs.getString("tel"));
                utilisateur.setMotDePasse(rs.getString("mot_de_passe"));
                return utilisateur;
            }
        } catch (SQLException e) {
            System.err.println("Probleme de recuperation d'utilisateur");
            System.err.println("Erreur sql: "+e.getSQLState());
            System.err.println("Erreur message: "+e.getMessage());
        }
        return null;
    }



}


