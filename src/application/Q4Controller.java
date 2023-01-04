package application;

import java.net.URL;
import java.util.ResourceBundle;

import application.util.Score;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class Q4Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblQuestionNum;

    @FXML
    private Label lblAnswer;

    @FXML
    private Button btnNext;

    @FXML
    private ImageView imgvQuestion;

    @FXML
    private Label lblQuestion;

    @FXML
    private AnchorPane lblQue;

    @FXML
    private TextField txtfAnswer;
    
    
    public void OnclickedBtnNext(ActionEvent event) {//正答チェックと画面遷移
    	//正答チェック
    	Score.checkAnswer4(txtfAnswer.getText());
    	
    	//画面遷移処理
    	btnNext.getScene().getWindow().hide();
    	Screen screen = new Screen();
    	//引数（次画面の.fxml,"画面名"）
    	screen.transitionScreen("Question5.fxml", "Question5");
    }
    
    

    @FXML
    void initialize() { //初期化
        assert lblQuestionNum != null : "fx:id=\"lblQuestionNum\" was not injected: check your FXML file 'Sample3.fxml'.";
        assert lblAnswer != null : "fx:id=\"lblAnswer\" was not injected: check your FXML file 'Sample3.fxml'.";
        assert btnNext != null : "fx:id=\"btnNext\" was not injected: check your FXML file 'Sample3.fxml'.";
        assert imgvQuestion != null : "fx:id=\"imgvQuestion\" was not injected: check your FXML file 'Sample3.fxml'.";
        assert lblQuestion != null : "fx:id=\"lblQuestion\" was not injected: check your FXML file 'Sample3.fxml'.";
        assert lblQue != null : "fx:id=\"lblQue\" was not injected: check your FXML file 'Sample3.fxml'.";
        assert txtfAnswer != null : "fx:id=\"txtfAnswer\" was not injected: check your FXML file 'Sample3.fxml'.";

    }
}

