package main.java.variableGlobeaux;

public class VariableQuestion {
    private static VariableQuestion instance;
    private int id_question;

    private VariableQuestion() {
        // Constructeur privé pour empêcher l'instanciation directe
    }

    public static VariableQuestion getInstance() {
        if (instance == null) {
            instance = new VariableQuestion();
        }
        return instance;
    }

    public int getId_question() {
        return id_question;
    }

    public void setId_question(int id_question) {
        this.id_question = id_question;
    }
}
