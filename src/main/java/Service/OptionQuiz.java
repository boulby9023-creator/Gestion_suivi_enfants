package main.java.Service;

import java.util.List;
import java.util.Scanner;
import main.java.Modele.Quiz;
import main.java.Service.interfaces.QuizService;

public class OptionQuiz {
    private final Scanner scanner = new Scanner(System.in);
    private final QuizService quizService = new QuizImplService();
    boolean runing = true;
    List<Quiz> quizList = quizService.findAll();

    public void  menu(){
        while (runing) {
            System.out.println("===== La liste des differents quiz ======");
            for (Quiz quiz: quizList){
                System.out.println(quiz.getId_quiz() +" "+ quiz.getTitre());
            }
            int choix = scanner.nextInt();

            


        }
    }
}
