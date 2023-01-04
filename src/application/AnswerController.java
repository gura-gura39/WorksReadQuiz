package application;

import java.net.URL;
import java.util.ResourceBundle;

import application.util.Db;
import application.util.Score;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AnswerController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField answersTitleRow;

    @FXML
    private TextField answer3;

    @FXML
    private TextField answer2;

    @FXML
    private TextField answer5;

    @FXML
    private TextField answer4;

    @FXML
    private TextField txtfScore;

    @FXML
    private Button btbShowAnswer;

    @FXML
    private TextField answer1;

    @FXML
    private TextField txtfComment;
    
    Db db = new Db();

    @FXML
    void showAnswer(ActionEvent event) {
    	//変数.appendするだけ
//    	answersTitleRow.appendText("No.,quiz,ansewer,image");
    	answersTitleRow.appendText(db.getATRNum() + " | " + db.getATRQuestion() + " | " + db.getATRAnswer());
    	answer1.appendText("1," + db.getA1Question() + "," + db.getA1answer());
    	answer2.appendText("2," + db.getA2Question() + "," + db.getA2answer());
    	answer3.appendText("3," + db.getA3Question() + "," + db.getA3answer());
    	answer4.appendText("4," + db.getA4Question() + "," + db.getA4answer());
    	answer5.appendText("5," + db.getA5Question() + "," + db.getA5answer());

		txtfScore.appendText(Score.scoreToString() + "問正解");
		if(Score.score<=1) {
			txtfComment.appendText("残念～");
		}else if(Score.score <= 3) {
			txtfComment.appendText("ナイス！");
		}else {
			txtfComment.appendText("素晴らしい！！！");
		}
    }

    @FXML
    void initialize() {
        assert answersTitleRow != null : "fx:id=\"answersTitleRow\" was not injected: check your FXML file 'Answer.fxml'.";
        assert answer3 != null : "fx:id=\"answer3\" was not injected: check your FXML file 'Answer.fxml'.";
        assert answer2 != null : "fx:id=\"answer2\" was not injected: check your FXML file 'Answer.fxml'.";
        assert answer5 != null : "fx:id=\"answer5\" was not injected: check your FXML file 'Answer.fxml'.";
        assert answer4 != null : "fx:id=\"answer4\" was not injected: check your FXML file 'Answer.fxml'.";
        assert txtfScore != null : "fx:id=\"txtfScore\" was not injected: check your FXML file 'Answer.fxml'.";
        assert btbShowAnswer != null : "fx:id=\"btbShowAnswer\" was not injected: check your FXML file 'Answer.fxml'.";
        assert answer1 != null : "fx:id=\"answer1\" was not injected: check your FXML file 'Answer.fxml'.";
        assert txtfComment != null : "fx:id=\"txtfComment\" was not injected: check your FXML file 'Answer.fxml'.";

    }
}
