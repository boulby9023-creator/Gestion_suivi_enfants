package main.java.Service.interfaces;

import java.util.List;
import main.java.Modele.Quiz;

public interface QuizService {
    public void menu();
    public List<Quiz> findAll();
    public Quiz findById(int id);
    public List<Quiz> findQuizByAgeEnfant(int ageEnfant);
}
