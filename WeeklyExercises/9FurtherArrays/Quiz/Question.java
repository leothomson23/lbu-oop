public class Question {
    private String question;
    private String correctAnswer;

    public Question(String question, String correctAnswer){
        this.question = question;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion(){
        return question;
    }

    public boolean isCorrect(String answer){
        return answer.equals(correctAnswer);
    }
}