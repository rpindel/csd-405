package MainJavaFXWorkspace;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btOK = new Button("OK");
        StackPane stack = new StackPane();
        Circle circle = new Circle(5, 50, 50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.PINK);
        stack.getChildren().addAll(circle,btOK);
        Scene scene = new Scene(stack, 200, 200);
        primaryStage.setTitle("JavaFXTest");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

public static void main(String[] args) {
    Application.launch(args);
    }
}
