package Studios.FunWithQuizzes;

public class TrueFalse extends Question {
    String question;
    boolean answer;
    boolean userAnswer;
    int score;
    int grade;
    public TrueFalse (String question, boolean answer) {
        super.displayQuestion();
        getAnswers();
    }

    @Override
    public void getAnswers (String question) {

    }
}
