package main.java.Modele;




public class Question {
    private int id_questions   ;
    private String enonce;
    private int delai_max;
    private int id_capacite;    


    public Question() {
    }

    public Question(String enonce, int id_questions, int delai_max, int id_capacite) {
        this.enonce = enonce;
        this.id_questions = id_questions;
        this.delai_max = delai_max;
        this.id_capacite = id_capacite;
    }

    public int getId_questions() {
        return id_questions;
    }

    public void setId_questions(int id_questions) {
        this.id_questions = id_questions;
    }

    public String getEnonce() {
        return enonce;
    }

    public void setEnonce(String enonce) {
        this.enonce = enonce;
    }

    public int getDelai_max() {
        return delai_max;
    }

    public void setDelai_max(int delai_max) {
        this.delai_max = delai_max;
    }

    public int getId_capacite() {
        return id_capacite;
    }

    public void setId_capacite(int id_capacite) {
        this.id_capacite = id_capacite;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id_questions;
        result = prime * result + ((enonce == null) ? 0 : enonce.hashCode());
        result = prime * result + delai_max;

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
        if (id_questions != other.id_questions)
            return false;
        if (enonce == null) {
            if (other.enonce != null)
                return false;
        } else if (!enonce.equals(other.enonce))
            return false;
        if (delai_max != other.delai_max)
            return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Question{");
        sb.append("id_questions=").append(id_questions);
        sb.append(", enonce=").append(enonce);
        sb.append(", delai_max=").append(delai_max);
        return sb.toString();
    }
    


}
