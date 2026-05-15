package main.java.Service;

import java.util.List;
import main.java.DAO.ImplQuizDao;
import main.java.Modele.Activite;
import main.java.Modele.Quiz;
import main.java.Service.interfaces.QuizService;

public class QuizImplService implements QuizService {
    private final ImplQuizDao quizDao = new ImplQuizDao();

    @Override
    public void menu() {

    }

    @Override
    public List<Quiz> findAll() {
        return List.of();
    }

    @Override
    public Quiz findById(int id) {
        return quizDao.findById(id);
    }

    @Override
    public List<Activite> findQuizByAgeEnfant(int ageEnfant) {
        return quizDao.findByAge(ageEnfant);
    }

}  
    


