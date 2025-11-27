import java.io.*;
import java.util.ArrayList;

public class QuestionBuilder {

    private String question;
    private String answer;
    private String type;
    private final ArrayList<Question> _questions;

    public QuestionBuilder(){
        this._questions = new ArrayList<>();
    }

    private Question createQuestion(){
        Question newQuestion;

        BufferedReader reader = null;

        try {
            String question,answer,type;
            reader = new BufferedReader(new InputStreamReader(System.in));
            boolean hasDone = false;
            while (!hasDone){
                System.out.print("Please enter the question: ");
                question = reader.readLine();
                System.out.println();

                System.out.print("Please enter the answer for the question: ");
                answer = reader.readLine();
                System.out.println();

                System.out.println("If you want to add question type, please enter: ");
                System.out.println("If not, press enter");
                type = reader.readLine();

                newQuestion = new Question(question, answer, type);

                if (newQuestion.checkQuestion()){
                    hasDone = true;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null){
                    reader.close();
                }
            } catch (IOException e){
                System.out.println("Reader has closed to prevent memory leak");
            }
            newQuestion = null;
        }

        return newQuestion;
    }



}
