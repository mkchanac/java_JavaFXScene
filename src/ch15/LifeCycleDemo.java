package ch15;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LifeCycleDemo extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void init() throws Exception {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("In init() method");
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Life Cycle Demo");
		StackPane root = new StackPane();
		primaryStage.setScene(new Scene(root,300,75));
		primaryStage.show();
		System.out.println("In start() method");
		
	}

	@Override
	public void stop() throws Exception {
		// TODO Auto-generated method stub
		super.stop();
		System.out.println("In stop() method");
	}
	
	
}
