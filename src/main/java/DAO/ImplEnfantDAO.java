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
        stm1.setInt(7, entity.getIdParent());

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
    public Enfant findById(Integer id_enfants) {
        Connection con = ConnexionDB.getConexion();
        String sql2 = "SELECT * FROM enfants where id_enfants = ?";
        try {
            
        PreparedStatement stm2 = con.prepareStatement(sql2);
        stm2.setInt(1, id_enfants);
        ResultSet result = stm2.executeQuery(); 
            int identifiant;
            String nom;
            String prenom;
            Date date_naissance;
            String sexe;
        while(result.next()){
            identifiant=result.getInt("id_enfants");
            nom=result.getString("nom");
            prenom=result.getString("prenom");
            date_naissance=result.getDate("date_naissance");
            // System.out.println("Le nom " + nom + "son prenom " + prenom);
        

        }
      


        }
        catch(SQLException e){
            System.out.println("Aucun enfant trouvé !");

        }
        return null;
    }

    @Override
    public List<Enfant> findAll(){
        try {
        List <Enfant>enfants=new ArrayList<>();
        int id_enfants;
        String nom, prenom, sexe;
        Date date_naissance;
        int id_activite;
        int id_parent;
        Connection con = ConnexionDB.getConexion();
        String sql3 = "SELECT * FROM enfant";

        java.sql.Statement stm3 = con.createStatement();
        
        ResultSet resultat = stm3.executeQuery(sql3);

        while(resultat.next()){
            id_enfants = resultat.getInt("id_enfants");
            nom = resultat.getString("nom");
            prenom = resultat.getString("prenom");
            date_naissance=resultat.getDate("date_naissance");
            sexe=resultat.getString("sexe");
            id_activite=resultat.getInt("id_activite");
            id_parent=resultat.getInt("id_parent");
            Enfant en = new Enfant();

            en.setId(id_enfants);
            en.setNom(nom);
            en.setPrenom(prenom);
            en.setDate_naissance(date_naissance);
            en.setSexe(sexe);
            en.setIdParent(id_parent);
            en.setActivite(id_activite);
            enfants.add(en);

        }  
         return enfants;
        } catch (Exception e) {
            System.out.println("Une erreur est survenue !!!");
            return null;
        }
        

       

    }

    @Override
    public void delete(Integer id) {
        try {
            Connection con = ConnexionDB.getConexion();
            String sql4 = "delete from enfants where id_enfants = ?";

            PreparedStatement stm4 = con.prepareStatement(sql4);
            stm4.setInt(1,id);
            stm4.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }

    @Override
    public void updtae(Integer id, Enfant entity) {

        int id_enfants = entity.getId();
        String nom = entity.getNom();
        String prenom = entity.getPrenom();
        Date date_naissance = entity.getDate_naissance();
        int id_activite = entity.getIdActivite();
        int id_parent = entity.getIdParent();

        try {
            Connection con = ConnexionDB.getConexion();
            String sql5 = "update table enfant set id_enfant = ?, nom = ?, prenom = ?, date_naissance = ?, id_activite = ?, id_parent = ? where id_enfants = ?";
            PreparedStatement stm5 = con.prepareStatement(sql5);
            stm5.setInt(1, id_enfants);
            stm5.setString(2, nom);
            stm5.setString(3, prenom);
            stm5.setDate(4, java.sql.Date.valueOf(date_naissance.toString()));
            stm5.setInt(5, id_activite);
            stm5.setInt(6, id_parent);
            int result=stm5.executeUpdate();
            if (result>0) {
                System.out.println("ligne modifiée avec succèss !");
            }
            
        } catch (Exception e) {
            System.out.println("une erreur est survenue lors de la modif !!!");
        
    }
}

}
