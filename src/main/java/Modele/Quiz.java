package main.java.Modele;



public class Quiz {
  
   private int id_quiz;
   private int tempsLimitGlobal;
   private int scoreMax;

    public int getId_quiz() {
            return id_quiz;
    }

    public void setId_quiz(int id_quiz) {
            this.id_quiz = id_quiz;
    }
    public Quiz() {
    }

    public int getTempsLimitGlobal() {
        return tempsLimitGlobal;
    }

    public void setTempsLimitGlobal(int tempsLimitGlobal) {
        this.tempsLimitGlobal = tempsLimitGlobal;
    }

    public int getScoreMax() {
        return scoreMax;
    }

    public void setScoreMax(int scoreMax) {
        this.scoreMax = scoreMax;
    }

    @Override
    public String toString() {
        return "Quiz [id_quiz=" + id_quiz + ", tempsLimitGlobal=" + tempsLimitGlobal + ", scoreMax=" + scoreMax + "]";
    }

 

   

   

    

    
}
