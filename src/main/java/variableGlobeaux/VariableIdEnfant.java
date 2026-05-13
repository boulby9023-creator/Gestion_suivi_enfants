package main.java.variableGlobeaux;

public class VariableIdEnfant {
    private static VariableIdEnfant instance;
    private int id_enfant;

    private VariableIdEnfant() {
        this.id_enfant = 0;
    }

    public static VariableIdEnfant getInstance() {
        if (instance == null) {
            instance = new VariableIdEnfant();
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
