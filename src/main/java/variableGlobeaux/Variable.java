package main.java.variableGlobeaux;

public class Variable {
    // Instance unique partagée dans toute l'application
    private static Variable instance;
    private int id_parent;

    // Constructeur privé : empêche new Variable() ailleurs
    private Variable() {}

    // Point d'accès unique
    public static Variable getInstance() {
        if (instance == null) {
            instance = new Variable();
        }
        return instance;
    }

    public int getId_parent() {
        return id_parent;
    }

    public void setId_parent(int id_parent) {
        this.id_parent = id_parent;
    }
}