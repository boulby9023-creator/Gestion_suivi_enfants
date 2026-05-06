package main.java.Modele;

import java.util.Date;

public class Evaluation{
    private int id;
    private String typeActivite;
    private int score;
    private int scoreGlobal;
    private Date date_Eval; ert

    //constructeur//
    public Evaluation (int id, String typeActivite, int score, int scoreGlobal, Date date_Eval){
        this.id=id;
        this.typeActivite=typeActivite;
        this.score=score;
        this.scoreGlobal=scoreGlobal;
        this.date_Eval=date_Eval;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String gettypeActivite() {
        return typeActivite;
    }
    public void settypeActivite(String typeActivite) {
        this.typeActivite = typeActivite;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
     public int getScoreglobal() {
        return scoreGlobal;
    }
    public void setScoreglobal(int scoreGlobal) {
        this.scoreGlobal = scoreGlobal;
    }
     public Date getDate() {
        return date_Eval;
    }
    public void setDateEval(Date date_Eval) {
        this.date_Eval = date_Eval;
    }

}