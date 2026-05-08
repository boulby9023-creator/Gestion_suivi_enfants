package main.java.Modele;

public class Utilisateur {

    protected int id;
    protected String nom;
    protected String prenom;
    protected String tel;
    protected String mail;
    protected String password;
    protected String role;

    //constructeur
    public Utilisateur(int id, String nom, String prenom, String tel, String mail, String password, String role ){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.mail = mail;
        this.password = password;
        this.role = role;
    }

    //Setter and Getter
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public String getTel(){
        return this.tel;
    }
    public void setTel(String tel){
        this.tel = tel;
    }
    public String getMail(){
        return this.mail;
    }
    public void setMail(String mail){
        this.mail = mail;
    }

    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getRole(){
        return this.role;
    }
    public void setRole(String role){
        this.role = role;
    }

   

}
