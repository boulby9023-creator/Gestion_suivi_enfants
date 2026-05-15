package main.java.Service;

import java.util.List;

import main.java.DAO.ImplQuestionDAO;
import main.java.Modele.Question;
import main.java.variableGlobeaux.VariableQuiz;

public class ListQuestionsParQuiz {
    VariableQuiz IdQuiz = VariableQuiz.getInstance();
    private ImplQuestionDAO implQuestionDAO = new ImplQuestionDAO();
    public void menu() {
        System.out.println("===== La liste des questions du quiz choisi ======");
        questions(IdQuiz.getIdQuiz());
    }


    public void questions(int idQuestion){
        List<Question> questionsList = implQuestionDAO.recuperationQuestionsByIdQuiz(idQuestion);
        for(Question question:questionsList){
            System.out.print(question.getId_questions()+" : "+question.getEnonce());
        }
    }
    
}
