package main.java.Service;

import main.java.Modele.Quiz;
import main.java.Service.interfaces.QuizService;

import java.util.List;

public class QuizImplService implements QuizService {
    @Override
    public void menu() {

    }

    @Override
    public List<Quiz> findAll() {
        return List.of();
    }


}
