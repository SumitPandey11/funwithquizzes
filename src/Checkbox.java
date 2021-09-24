//a question with a fixed set of possible answers,
// of which any number may be chosen;
// there is one correct combination of choices

import java.util.ArrayList;

public class Checkbox extends Question {

    private ArrayList<String> answerChoice = new ArrayList<>();
    private ArrayList<String> correctAnswers = new ArrayList<>();


    @Override
    public void displayQuestion() {

    }

    @Override
    public void displayAnswer() {

    }

    @Override
    public boolean isCorrectAnswer(String userInput) {
        if(correctAnswers.contains(userInput)){
            return true;
        }
        else {
            return false;
        }
    }

    public void addAnswer(String answer, boolean isCorrect){
        answerChoice.add(answer);
        if(isCorrect) {
            this.correctAnswers.add(answer);
        }
    }

}
