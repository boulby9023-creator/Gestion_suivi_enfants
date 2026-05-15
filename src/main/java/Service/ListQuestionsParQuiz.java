package main.java.Service;

import java.util.List;

import main.java.DAO.ImplQuestionDAO;
import main.java.Modele.Question;

public class ListQuestionsParQuiz {
    private ImplQuestionDAO implQuestionDAO;
    public void menu() {
        System.out.println("===== La liste des questions du quiz choisi ======");
        questions(2);
    }


    public void questions(int idQuestion){
        List<Question> questionsList = implQuestionDAO.recuperationQuestionsByIdQuiz(idQuestion);
        for(Question question:questionsList){
            System.out.print(question.getId_questions()+" : "+question.getEnonce());
        }
    }
    
}
