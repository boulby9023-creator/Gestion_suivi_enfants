package main.java.Modele;

import java.util.Objects;


public class Quiz {
   private int tempsLimitGlobal;
   private int scoreMax;
   private String titre;
   private String categorie; 

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

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.tempsLimitGlobal;
        hash = 79 * hash + this.scoreMax;
        hash = 79 * hash + Objects.hashCode(this.titre);
        hash = 79 * hash + Objects.hashCode(this.categorie);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Quiz other = (Quiz) obj;
        if (this.tempsLimitGlobal != other.tempsLimitGlobal) {
            return false;
        }
        if (this.scoreMax != other.scoreMax) {
            return false;
        }
        if (!Objects.equals(this.titre, other.titre)) {
            return false;
        }
        return Objects.equals(this.categorie, other.categorie);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Quiz{");
        sb.append("tempsLimitGlobal=").append(tempsLimitGlobal);
        sb.append(", scoreMax=").append(scoreMax);
        sb.append(", titre=").append(titre);
        sb.append(", categorie=").append(categorie);
        sb.append('}');
        return sb.toString();
    }

    
}
