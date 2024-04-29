import java.util.Scanner;

public class Quiz {
    private int score;
    private Question[] questions;
    private int numQuestions;

    public Quiz(){
        questions = new Question[25];
        numQuestions = 0;
        score = 0;
    }

    public void addQuestion(Question question){
        if (numQuestions < 25) {
            questions[numQuestions] = question;
            numQuestions++;
        }
        else{
            System.out.println("Maximum number of questions reached");
        }
    }

    public void giveQuiz(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Beginning the quiz - enter the correct answer to the questions presented to you.");
        for (int i = 0; i < numQuestions; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i].getQuestion());
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (questions[i].isCorrect(userAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect.");
            }
        }

        System.out.println("All questions answered");
        System.out.println("Score: " + score + "/" + numQuestions);
    }
}