package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Controller1 extends QuestionController {
    public Label questionlabel;
    public TextField AnswerBox;
    public Label ScoreBox;
    public Label correctorincorrect;
    public Label Playernumber;
    public Button one;
    public Button two;
    public Button three;
    public Button four;
    public TextField helpbox;
    public Button scoreshow;
    public Label getscore;
    public Button twentyfive;
    public Button twentyfivehelp;
    public Button askhelp;
    public Button fiftyhelp;
    int totalscore = 0;
    public TextField displayQuestion;
    private ArrayList<Question> questions = new ArrayList<>();

    
    public void displayGeneralKnowledge(ActionEvent event) throws QuestionNotFoundException {
        QuestionController qc = new QuestionController();
        Question gr1 = new Question(5,"How Many Colours Are In The Rainbow","8","11","7","15");
        qc.addQuestions(gr1);
        Question gr2 = new Question(2,"When did 2Pac Die?","2012","2002","1996","1999");
        qc.addQuestions(gr2);
        Question gr3 = new Question(1,"What number president is Joe Biden","12","45","46","50");
        qc.addQuestions(gr3);
        Question gr4 = new Question(10,"What Elemet is Sodium","S","SO","NA","RH");
        qc.addQuestions(gr4);
        Question gr5 = new Question(8,"How many oscars did titanic win","7","3","10","0");
        qc.addQuestions(gr5);
        Question gr6 = new Question(6,"How old is the queen?","100","80","93","97");
        qc.addQuestions(gr6);
        Question gr7 = new Question(3,"WHat year did WW2 end","1914","1965","1945","1977");
        qc.addQuestions(gr7);
        displayQuestion.setText(qc.printModules());


}

    public void DisplaySport(ActionEvent event) throws QuestionNotFoundException {
        QuestionController qc = new QuestionController();
        Question s1 = new Question(4,"How Old Is Messi","22","27","33","19");
        qc.addQuestions(s1);
        Question s2 = new Question(2,"Who Won the 2019 Masters","Dustin Johnson","Rory Mcilroy","Tiger Woods","Jordan Spieth");
        qc.addQuestions(s2);
        Question s3 = new Question(8,"Who won the 1998 Word Cup","Brazil","Germany","France","England");
        qc.addQuestions(s3);
        Question s4 = new Question(9,"How Many League Championships have WIgan won ","10","7","22","14");
        qc.addQuestions(s4);
        Question s5 = new Question(6,"Who won the 2019 French Open?","Roger Federer","Novak Djocovic","Rafael Nadal","Gael Monfils");
        qc.addQuestions(s5);
        displayQuestion.setText(qc.printModules());
    }

    public void DisplayGeog(ActionEvent event) throws QuestionNotFoundException {
        QuestionController qc = new QuestionController();
        Question g1 = new Question(8,"Capital Of Latvia","Paris","Berlin","Riga","Madrid");
        qc.addQuestions(g1);
        Question g2 = new Question(10,"What year was America Founded","1200","1934","1492","1607");
        qc.addQuestions(g2);
        Question g3 = new Question(1,"WHat Continent is China in?","Europe","Africa","Asia","South America");
        qc.addQuestions(g3);
        displayQuestion.setText(qc.printModules());
    }

    public void display50(ActionEvent actionEvent) {
        helpbox.setText("Choice 1 or Choice 3");
    }

    public void displayaskpublic(ActionEvent actionEvent) {
        helpbox.setText("Public Says Choice 2");

    }

    public void AddAnotherPlayer(ActionEvent actionEvent) throws IOException {
        FXMLLoader Load = new FXMLLoader(getClass().getResource("Player2.fxml"));

        Scene inputScene = new Scene(Load.load());

        Controller2 controller = Load.getController();

        Stage inputStage = new Stage();
        inputStage.setScene(inputScene);
        inputStage.initModality(Modality.APPLICATION_MODAL);
        inputStage.show();
    }


    public void Submit(ActionEvent event) {
        displayQuestion.setText("");
        correctorincorrect.setText("");
        ScoreBox.setText("");
        helpbox.setText("");
    }

    public void displayscore(ActionEvent event) {
        getscore.setText("Your Score Is "+ totalscore);
    }

    public void display25(ActionEvent event) {
        helpbox.setText("Choice 1, 3 or 4");
    }

    public void Choice1(ActionEvent event) {
        correctorincorrect.setText("Incorrect");
    }

    public void Choice2(ActionEvent event) {
        correctorincorrect.setText("Incorrect");
    }

    public void Choice3(ActionEvent event) {
        QuestionController qc = new QuestionController();
        Question gr1 = new Question(5,"How Many Colours Are In The Rainbow","8","11","7","15");
        qc.addQuestions(gr1);
        Question gr2 = new Question(2,"When did 2Pac Die?","2012","2002","1996","1999");
        qc.addQuestions(gr2);
        Question gr3 = new Question(1,"What number president is Joe Biden","12","45","46","50");
        qc.addQuestions(gr3);
        Question gr4 = new Question(10,"What Elemet is Sodium","S","SO","NA","RH");
        qc.addQuestions(gr4);
        Question gr5 = new Question(8,"How many oscars did titanic win","7","3","10","0");
        qc.addQuestions(gr5);
        Question gr6 = new Question(6,"How old is the queen?","100","80","93","97");
        qc.addQuestions(gr6);
        Question gr7 = new Question(3,"WHat year did WW2 end","1914","1965","1945","1977");
        qc.addQuestions(gr7);
        Question s1 = new Question(4,"How Old Is Messi","22","27","33","19");
        qc.addQuestions(s1);
        Question s2 = new Question(2,"Who Won the 2019 Masters","Dustin Johnson","Rory Mcilroy","Tiger Woods","Jordan Spieth");
        qc.addQuestions(s2);
        Question s3 = new Question(8,"Who won the 1998 Word Cup","Brazil","Germany","France","England");
        qc.addQuestions(s3);
        Question s4 = new Question(9,"How Many League Championships have WIgan won ","10","7","22","14");
        qc.addQuestions(s4);
        Question s5 = new Question(6,"Who won the 2019 French Open?","Roger Federer","Novak Djocovic","Rafael Nadal","Gael Monfils");
        qc.addQuestions(s5);
        Question g1 = new Question(8,"Capital Of Latvia","Paris","Berlin","Riga","Madrid");
        qc.addQuestions(g1);
        Question g2 = new Question(10,"What year was America Founded","1200","1934","1492","1607");
        qc.addQuestions(g2);
        Question g3 = new Question(1,"WHat Continent is China in?","Europe","Africa","Asia","South America");
        qc.addQuestions(g3);

        correctorincorrect.setText("Correct");
        totalscore += 100;

    }

    public void Choice4(ActionEvent event) {
        correctorincorrect.setText("Incorrect");
    }
}