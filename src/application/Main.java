package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox();
			root.getChildren().add(new Label("Abil's Label"));
			root.getChildren().add(new Label("Abil's branch"));
			root.getChildren().add(new Label("Arsalan's branch"));  // There was an issue with the label, fixed it
			Scene scene = new Scene(root,400,400);
			primaryStage.setTitle("Arsalan's Project");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
