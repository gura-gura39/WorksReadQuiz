package application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Screen {
	
	public void transitionScreen(String fxmlName,String fxmlTitle) {
		
		try {
			//FXMLからのシーングラフの読み込み
			FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlName));
			Parent root = loader.load();
			
			//シーングラフのルートノードを設定したシーン作成
			Scene scene = new Scene(root,600,400);
			//ステージのシーン設定
			Stage stage = new Stage();
			
			stage.setScene(scene);
			stage.setTitle(fxmlTitle);
			stage.show();
			
		} catch (Exception e) {
		e.printStackTrace();}
	}
	
	
}
