import java.util.Scanner;

public class QuizRunner {

    public static void main(String [] args){

        int grade = 0;

        Scanner input = new Scanner(System.in);

        MultipleChoice multipleChoice = new MultipleChoice();
        multipleChoice.addQuestions("Question Question Question ");
        multipleChoice.addAnswer("Answer one", false);
        multipleChoice.addAnswer("Answer two", true);
        multipleChoice.addAnswer("Answer three", false);

        multipleChoice.displayQuestion();
        multipleChoice.displayAnswer();

        System.out.println("Enter Correct Answer ");
        String userAnswer = input.nextLine();

        if(multipleChoice.isCorrectAnswer(userAnswer)){
            grade += 1;
        }
        System.out.println("You Answer is : " + multipleChoice.isCorrectAnswer(userAnswer));

        System.out.println("You grade is : " + grade);

        Checkbox checkbox = new Checkbox();
        checkbox.addQuestions("Check box Question ");
        checkbox.addAnswer("CBA1",false);
        checkbox.addAnswer("CBA2",true);
        checkbox.addAnswer("CBA3",false);
        checkbox.addAnswer("CBA4",true);


        checkbox.displayQuestion();
        checkbox.displayAnswer();


    }
}
