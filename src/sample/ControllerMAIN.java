package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerMAIN {
    public Button OnePlayer;
    public Button TwoPlayer;
    public Button ThreePlayer;

    public void Open1Game(ActionEvent actionEvent) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Player1.fxml"));

        Scene inputScene = new Scene(loader.load());

        Controller1 controller = loader.getController();

        Stage inputStage = new Stage();
        inputStage.setScene(inputScene);
        inputStage.initModality(Modality.APPLICATION_MODAL);
        inputStage.show();

    }

    public void Open2Games(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Player1.fxml"));
        FXMLLoader loader2 = new FXMLLoader(getClass().getResource("Player2.fxml"));

        Scene inputScene = new Scene(loader.load());

        Controller1 controller = loader.getController();
        Controller1 controller2 = loader2.getController();



        Stage inputStage = new Stage();
        inputStage.setScene(inputScene);
        inputStage.initModality(Modality.APPLICATION_MODAL);
        inputStage.show();

    }

    public void Open3Games(ActionEvent actionEvent) {
    }
}
