package main.java.variableGlobeaux;

public class VariableQuiz {
        private static VariableQuiz instance;

    private int IdQuiz ;

       private VariableQuiz() {
        this.IdQuiz = 0;
    }

    public static VariableQuiz getInstance() {
      if (instance == null) {
            instance = new VariableQuiz();
        }
        return instance ;
    }

    public int getIdQuiz() {
        return IdQuiz;
    }

    public void setIdQuiz(int idQuiz) {
        IdQuiz = idQuiz;
    }




}
