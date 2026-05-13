package main.java.variableGlobeaux;

public class variableIdEnfant {
    private static variableIdEnfant instance;
    private int id_enfant;

    private variableIdEnfant() {
        this.id_enfant = 0;
    }

    public static variableIdEnfant getInstance() {
        if (instance == null) {
            instance = new variableIdEnfant();
        }
        return instance;
    }

    public int getId_enfant() {
        return id_enfant;
    }

    public void setId_enfant(int id_enfant) {
        this.id_enfant = id_enfant;
    }
}
