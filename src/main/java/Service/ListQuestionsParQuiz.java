package main.java.Service;

import java.util.List;
import java.util.Scanner;
import main.java.DAO.ImplOptionDao;
import main.java.DAO.ImplQuestionDAO;
import main.java.Modele.Option;
import main.java.Modele.Question;
import main.java.variableGlobeaux.VariableQuestion;
import main.java.variableGlobeaux.VariableQuiz;

public class ListQuestionsParQuiz {
    VariableQuiz idquiz = VariableQuiz.getInstance();
    private ImplQuestionDAO implQuestionDAO = new ImplQuestionDAO();
    private final VariableQuestion variableQuestion = VariableQuestion.getInstance();
    private  final ImplOptionDao implOptionDAO = new ImplOptionDao();
    private  final Scanner sc = new Scanner(System.in);



    public void menu() {
        System.out.println("===== La liste des questions du quiz choisi ======");
        questions(idquiz.getIdQuiz());
    }


    public void questions(int idQuestion){
        List<Question> questionsList = implQuestionDAO.recuperationQuestionsByIdQuiz(idQuestion);
        for(Question question:questionsList){
            System.out.print(question.getEnonce());
            variableQuestion.setId_question(question.getId_questions());

            List<Option> optionsList = implOptionDAO.findByIdQuestion(question.getId_questions());

            for(Option option:optionsList){
                System.out.println("\t"+ option.getId() +" : "+option.getTexte());
            }

            System.out.print("Choisissez une option (ID) : ");
            int choix = sc.nextInt();

            Option optionChoisie = implOptionDAO.findById(choix);

            if(optionChoisie != null){
                if(optionChoisie.isEstCorrecte()){
                    question.setScore(10);
                    System.out.println("Bonne réponse ! +10 points");
                }else{
                    question.setScore(0);
                    System.out.println("Mauvaise réponse !");
                }
            }else{
                System.out.println("Option invalide !");
            }
        }
    }
    
}
