package main.java;

import main.java.Modele.Question;
import main.java.enumeration.CapaciteEnum;

public class main {
    
   public static void main(String[] args) {
    Question q = new  Question();
    q.setId_quest(1);
    q.setContenu("bonjour");
    q.setCapaciteEnum(CapaciteEnum.ATTENTION);
    System.out.println(q.toString());
       
   }
}
