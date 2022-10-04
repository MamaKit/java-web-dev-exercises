package Studios.FunWithQuizzes;

public abstract class Question {
    String question;
    int score;

        public Question(int score, String question) {
            this.score = score;
            this.question = question;
        }

    protected Question() {
    }

    public void displayQuestion () {
            System.out.println(question);
        }

        public void setScore(int x) {
            this.score = x;
        }

        public int getScore()  {
            return this.score;
        }

        public abstract void displayAnswers ();

        public abstract int getAnswers();
    }

}
