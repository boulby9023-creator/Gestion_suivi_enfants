package main.java.Service.interfaces;

import java.util.List;
import main.java.Modele.Activite;
import main.java.Modele.Quiz;

public interface QuizService {
    public void menu();
    public List<Quiz> findAll();
    public Quiz findById(int id);
    public  Activite findActiviteById(int id);
    public List<Activite> findQuizByAgeEnfant(int ageEnfant);
}
