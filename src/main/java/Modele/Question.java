package main.java.Modele;


import main.java.enumeration.CapaciteEnum;

public class Question {
    private int id_quest;
    private String contenu;
    private int point;
    private  CapaciteEnum capaciteEnum;

    public Question() {
    }

    public Question(CapaciteEnum capaciteEnum, String contenu, int id_quest, int point) {
        this.capaciteEnum = capaciteEnum;
        this.contenu = contenu;
        this.id_quest = id_quest;
        this.point = point;
    }

    public int getId_quest() {
        return id_quest;
    }

    public void setId_quest(int id_quest) {
        this.id_quest = id_quest;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public CapaciteEnum getCapaciteEnum() {
        return capaciteEnum;
    }

    public void setCapaciteEnum(CapaciteEnum capaciteEnum) {
        this.capaciteEnum = capaciteEnum;
    }

    

}
