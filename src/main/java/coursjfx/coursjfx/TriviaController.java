package coursjfx.coursjfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;

public class TriviaController implements Initializable {
    @FXML
    private Label question;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button next;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        question.setText("What is the capital of Canada?");
        button1.setText("Montréal");
        button1.setText("Vancouver");
        button1.setText("Ottawa");
        button3.getStyleClass().add("Good");
        button1.setText("Toronto");
        next.setText("Next");
    }

    @FXML
    public void onClickButtonChoix(ActionEvent event){
        Button btn = (Button) event.getSource();
        if(button1.getStyleClass().contains("Good")){
            button1.getStyleClass().add("Green");
        }
        if(button2.getStyleClass().contains("Good")){
            button2.getStyleClass().add("Green");
        }
        if(button3.getStyleClass().contains("Good")){
            button3.getStyleClass().add("Green");
        }
        if(button4.getStyleClass().contains("Good")){
            button4.getStyleClass().add("Green");
        }

        if(btn.getStyleClass().contains("Good")){
            btn.getStyleClass().add("Red");
        }
        button1.setDisable(true);
        button2.setDisable(true);
        button3.setDisable(true);
        button4.setDisable(true);
        next.setDisable(false);
    }

}