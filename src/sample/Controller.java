package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;
import java.io.IOException;

public class Controller {
    @FXML
    public Button bot_rojo;
    @FXML
    public Button bot_amarillo;
    @FXML
    public Button bot_azul;

    @FXML
    public Label label_rojo;
    @FXML
    public Label label_amarillo;
    @FXML
    public Label label_azul;

    @FXML
    public void change_rojo(){
        label_rojo.setTextFill(Color.RED);
        label_rojo.setStyle(" -fx-background-color:#98D5FF;");
    }
    @FXML
    public void change_amarillo(){
        label_amarillo.setTextFill(Color.YELLOW);
        label_amarillo.setStyle(" -fx-background-color:#98D5FF;");
    }
    @FXML
    public void change_azul(){
        label_azul.setTextFill(Color.BLUE);
        label_azul.setStyle(" -fx-background-color:#98D5FF;");
    }
    @FXML
    public void vuelvenormal(){
        label_rojo.setTextFill(Color.BLACK);
        label_rojo.setStyle(" -fx-background-color:white;");
        label_amarillo.setTextFill(Color.BLACK);
        label_amarillo.setStyle(" -fx-background-color:white;");
        label_azul.setTextFill(Color.BLACK);
        label_azul.setStyle(" -fx-background-color:white;");
    }

    @FXML
    public void pantalla2(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("sample2.fxml"));
            Stage primaryStage = new Stage();
            Scene scene = new Scene(root, 300, 275);
            primaryStage.setTitle("Hello World");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
