module ReadQuiz {
	requires javafx.controls;
	requires javafx.fxml;
	requires org.apache.poi.ooxml;
	
	opens application to javafx.graphics, javafx.fxml;
}
