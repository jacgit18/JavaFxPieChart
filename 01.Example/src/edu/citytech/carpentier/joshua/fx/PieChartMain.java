package edu.citytech.carpentier.joshua.fx;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class PieChartMain extends Application {

	public static void main(String[] args) {

		Application.launch(PieChartMain.class, args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("PieChartView.fxml"));
		stage.setTitle("Pie Chart for Products");
		stage.setScene(new Scene(root));
		stage.show();

		
		
		
		
		
		
	
		
     
		
		
		
		
	}

}
