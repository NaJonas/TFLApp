package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();

        Text welcome = new Text("Hello, Circle Line:");

        // Set welcome text to center
        BorderPane.setAlignment(welcome, Pos.CENTER);

        // Welcome text
        welcome.setFont(new Font(40));
        welcome.setFill(Color.LIGHTGRAY);
        root.setTop(welcome);


        root.setBackground(new Background(new BackgroundFill(Color.GREY, null, null)));

        // Primary stage
        primaryStage.setTitle("TFL");
        primaryStage.setScene(new Scene(root, 700, 500));
        primaryStage.show();

        // HTTP request object
        UrlConnectionReader test = new UrlConnectionReader();

        // Get status
        String statusText = test.read("circle");

        // Status text
        Text status = new Text(statusText);
        status.setFill(Color.LIGHTGRAY);
        status.setFont(new Font(40));
        root.setCenter(status);
    }




    public static void main(String[] args) {
        launch(args);
    }
}
