package main.java.BD;
import java.sql.Connection;
import java.sql.DriverManager;


public class ConnexionDB {
//     private static String  url = "jdbc:mysql://localhost:3306/suivi_enfant?useSSL=false&serverTimezone=UTC&characterEncoding=UTF-8";
//     private static String utilisateur = "root";
//     private static String mot_de_passe = "6240";

//     private static  ConnexionDB instance = null;
//     private  Connection connection= null;

//     public ConnexionDB() {
//         try {
//             this.connection = DriverManager.getConnection(url, utilisateur, mot_de_passe);
//             System.out.println("Connexion MySQL établie avec succès.");
//         } catch(SQLException e){
//             System.err.println("Erreur de connexion à la base de données.");
//             System.err.println("Code SQL  : " + e.getErrorCode());
//             System.err.println("Message   : " + e.getMessage());
//         }
//     }

//     public static ConnexionDB getInstance() {
//        try {
//            if (instance == null ){
//                 instance = new  ConnexionDB();
//             }
//        } catch (Exception e) {
//           System.err.println("probleme de connection : " + e.getMessage());
//        }

//        return  instance;
//     }


//     public  Connection getconnection() {
//        try {
//            if (instance == null | connection.isClosed()){
//                 System.out.println("Reconnexion en cours...");
//                 instance = new  ConnexionDB();
//             }
//        } catch (SQLException e) {
//          System.err.println("Erreur lors de la vérification de la connexion : " + e.getMessage());
//        }

//        return  connection;
//     }

//     public void fermer() {
//         try {
//             if (connection != null && !connection.isClosed()) {
//                 connection.close();
//                 instance = null;
//                 System.out.println("Connexion fermée.");
//             }
//         } catch (SQLException e) {
//             System.err.println("Erreur lors de la fermeture : " + e.getMessage());
//         }
//     }}


    private static String url = "jdbc:mysql://localhost:3306/suivi_enfant?useSSL=false&serverTimezone=UTC&characterEncoding=UTF-8";
    private static String utilisateur = "root";
    private static String mot_de_passe = "Moul@9460";

    public static Connection getConexion() {
        try {
            Connection conexion = DriverManager.getConnection(url, utilisateur, mot_de_passe);
            System.out.println("Connecté à la base de données !");
            return conexion;
        } catch (Exception e) {
            System.out.println("Erreur de connexion : " + e.getMessage());
            return null;
        }
    }

    
}
