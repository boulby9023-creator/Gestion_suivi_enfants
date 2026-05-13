package main.java.Service.interfaces;

import main.java.Modele.Quiz;

import java.util.List;

public interface QuizService {
    public void menu();
    public List<Quiz> findAll();
}
