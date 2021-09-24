public abstract class Question {
    protected String question;
    public abstract void displayQuestion();
    public abstract void displayAnswer();
    public abstract boolean isCorrectAnswer(String userInput);
    public void addQuestions(String question){
        this.question = question;
    }
}
