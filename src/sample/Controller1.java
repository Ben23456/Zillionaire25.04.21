package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller1 {
    public Label questionlabel;
    public TextField AnswerBox;
    public Label ScoreBox;
    public Label correctorincorrect;

    public void displayGeneralKnowledge(ActionEvent actionEvent) {
    }

    public void DisplaySport(ActionEvent actionEvent) {
    }

    public void DisplayGeog(ActionEvent actionEvent) {
    }

    public void display50(ActionEvent actionEvent) {
    }

    public void displayaskpublic(ActionEvent actionEvent) {
    }

    public void addplayer(ActionEvent actionEvent) {
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
}
