package sample;


import java.util.ArrayList;
import java.util.Collections;

public class QuestionController {
    private ArrayList<Question> questions = new ArrayList<>();
    public Question current;

    public QuestionController(){
    }

    public void addQuestions(Question question){
        current = question;
        this.questions.add(question);
    }

    public String printModules () throws QuestionNotFoundException {
        StringBuilder sb = new StringBuilder();
        Collections.shuffle(questions);
        if (questions.isEmpty ()) {
            throw new QuestionNotFoundException("No Questions found");
        }
        else {
            for (Question s : questions) {
                sb.append(s);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}