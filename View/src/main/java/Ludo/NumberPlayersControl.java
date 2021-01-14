package Ludo;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class NumberPlayersControl {

    GameFrameControl controller = new GameFrameControl();

    public void Number2PlayersControl(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/GameFrame.fxml"));
//        controller.setGamePlayers(2);
//        loader.setController(controller);
//        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setTitle("Chińczyk");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void Number4PlayersControl(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/GameFrame.fxml"));
//        controller.setGamePlayers(4);
//        loader.setController(controller);
//        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setTitle("Chińczyk");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
