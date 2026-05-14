package main.java.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import main.java.Modele.Activite;
import main.java.Modele.Enfant;
import main.java.Modele.Quiz;
import main.java.Service.interfaces.QuizService;
import main.java.variableGlobeaux.VariableIdEnfant;

public class OptionQuiz {
    private final Scanner scanner = new Scanner(System.in);
    private final QuizService quizService = new QuizImplService();
    private final VariableIdEnfant variableIdEnfant = VariableIdEnfant.getInstance();
    private final EnfantImplService enfantService = new EnfantImplService();
    private final ListQuestionsParQuiz listQuestionsParQuiz = new ListQuestionsParQuiz();
    boolean runing = true;
    

    public void  menu(){
        while (runing) {
            System.out.println("===== La liste des differents quiz par rapport a l'age de l'enfant  ======");

            Enfant enfant= enfantService.findEnfantById(variableIdEnfant.getId_enfant());
            int ageEnfant = calculerAgeEnfant(enfant.getDate_naissance()) ;
            List<Activite> quizList = quizService.findQuizByAgeEnfant(ageEnfant);
            for (Activite quiz: quizList){
                System.out.println("{ id : "+quiz.getIdActivite() +", titre : "+ quiz.getTitre()+" type activité : "+ quiz.getTypeActivites() +", age : "+ quiz.getAgeMin() + " - "+ quiz.getAgeMax() + " }");
            }

            if(quizList.isEmpty()){
                System.out.println("Aucun quiz trouvé.");
                return;
            }else{
                System.out.println("Choissez un quiz par son ID pour le faire");
                int choix = scanner.nextInt();

                Quiz selectedQuiz = quizService.findById(choix);
                if (selectedQuiz != null) {
                    listQuestionsParQuiz.menu();
                    
                }
                
            }
           

            


        }
    }


    public int calculerAgeEnfant(LocalDate age) {
        LocalDate currentDate = LocalDate.now();
        int ageEnfant = currentDate.getYear() - age.getYear();
        return ageEnfant; // Retournez l'âge calculé
    }
}
