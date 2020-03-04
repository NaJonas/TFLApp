package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Test extends Application {

    private Scene scene;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        primaryStage.setTitle("Test");
        scene = new Scene(root);
        scene.getStylesheets().add(
                getClass().getResource("css/style.css").toExternalForm()
        );
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();









    }
    public static void main(String[] args){
        launch(args);
    }
}
