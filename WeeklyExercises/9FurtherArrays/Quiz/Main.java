public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        Question q1 = new Question("What is 1+1?", "2");
        Question q2 = new Question("What is 2 + 2?", "4");

        quiz.addQuestion(q1);
        quiz.addQuestion(q2);

        quiz.giveQuiz();
    }
}