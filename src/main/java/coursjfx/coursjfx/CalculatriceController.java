package coursjfx.coursjfx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatriceController {
    @FXML
    private Label affichage;

    @FXML
    public void onClickAddOne(ActionEvent event){
        String val = ((Button) event.getSource()).getText();
        if(affichage.getText().compareTo("0") == 0){
            affichage.setText("");
        }
            affichage.setText(affichage.getText() + val);

    }

}