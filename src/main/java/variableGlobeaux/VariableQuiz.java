package main.java.variableGlobeaux;

public class VariableQuiz {
    private static VariableQuiz instance;

    private int idQuiz ;

       private VariableQuiz() {
        this.idQuiz = 0;
    }

    public static VariableQuiz getInstance() {
      if (instance == null) {
            instance = new VariableQuiz();
        }
        return instance ;
    }

    public int getIdQuiz() {
        return idQuiz;
    }

    public void setIdQuiz(int idQuiz) {
        this.idQuiz = idQuiz;
    }




}
