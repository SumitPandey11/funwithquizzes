import java.util.ArrayList;

public class MultipleChoice extends Question {


    private ArrayList<String> answerChoice = new ArrayList<>();
    private String correctAnswer;

    @Override
    public void displayQuestion() {
        System.out.println(super.question);
    }

    @Override
    public void displayAnswer() {
        for(String a : answerChoice){
            System.out.println(a);
        }
    }

    @Override
    public boolean isCorrectAnswer(String userInput) {
        if(userInput.equals(correctAnswer)){
            return true;
        }else{
            return false;
        }
    }

 /*   public void addQuestions(String question){
        this.question = question;
    }*/

    public void addAnswer(String answer, boolean isCorrect){
        answerChoice.add(answer);
        if(isCorrect) {
            this.correctAnswer = answer;
        }
    }
}
