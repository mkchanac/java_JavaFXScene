package ch15;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Paint;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ColorChange extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Color Change!");
		Button btn = new Button();
		btn.setText("Color Change");
		btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				btn.setTextFill(Paint.valueOf("Red"));
				btn.setText("Red");
				
			}
			
		});
		
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		primaryStage.setScene(new Scene(root,400,300));
		primaryStage.show();
		
	}
	
	
	
}
