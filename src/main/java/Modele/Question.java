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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id_quest;
        result = prime * result + ((contenu == null) ? 0 : contenu.hashCode());
        result = prime * result + point;
        result = prime * result + ((capaciteEnum == null) ? 0 : capaciteEnum.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Question other = (Question) obj;
        if (id_quest != other.id_quest)
            return false;
        if (contenu == null) {
            if (other.contenu != null)
                return false;
        } else if (!contenu.equals(other.contenu))
            return false;
        if (point != other.point)
            return false;
        if (capaciteEnum != other.capaciteEnum)
            return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Question{");
        sb.append("id_quest=").append(id_quest);
        sb.append(", contenu=").append(contenu);
        sb.append(", point=").append(point);
        sb.append(", capaciteEnum=").append(capaciteEnum);
        sb.append('}');
        return sb.toString();
    }

    

    

}
