package week_1;

import static input.InputUtils.stringInput;


public class Question_2_Quiz_Question {
    
    public static void main(String[] args) {
        
        // Print the quiz question to the user
        System.out.println("Quiz time!");
        System.out.println("What is the name of the classic 1972 arcade game based on table tennis?");
        
        // Get the user's answer as a String
        String answer = stringInput("Enter your answer: ");
        
        // Call method to check if the answer is correct (true or false)
        boolean correct = checkAnswer(answer);
        
        // If correct is true → print correct message
        if (correct) {
            System.out.println("You are correct!");
        } 
        // If false → print the correct answer
        else {
            System.out.println("Sorry, the answer is Pong.");
        }
        
    }
    
    public static boolean checkAnswer(String answer) {
        
     
        return answer.equalsIgnoreCase("Pong");
    }
    
}
