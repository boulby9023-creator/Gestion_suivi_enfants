package main.java.Modele;

public class Option {
    private int id;
    private String texte;
    private boolean estCorrecte;


    public Option() {
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getTexte() {
        return texte;
    }


    public void setTexte(String texte) {
        this.texte = texte;
    }


    public boolean isEstCorrecte() {
        return estCorrecte;
    }


    public void setEstCorrecte(boolean estCorrecte) {
        this.estCorrecte = estCorrecte;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((texte == null) ? 0 : texte.hashCode());
        result = prime * result + (estCorrecte ? 1231 : 1237);
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
        Option other = (Option) obj;
        if (id != other.id)
            return false;
        if (texte == null) {
            if (other.texte != null)
                return false;
        } else if (!texte.equals(other.texte))
            return false;
        if (estCorrecte != other.estCorrecte)
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "Option [id=" + id + ", texte=" + texte + ", estCorrecte=" + estCorrecte + "]";
    }

    
    
}
