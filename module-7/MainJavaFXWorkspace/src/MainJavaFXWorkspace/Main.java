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

    /*@Override
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
    }*/

    @Override
    public void start(Stage primaryStage) {
        Pane hbox = new HBox();
        Circle circle1 = new Circle(5, 50, 50);
        Circle circle2 = new Circle(5, 50, 50);
        Circle circle3 = new Circle(5, 50, 50);
        circle1.setStroke(Color.BLACK);
        circle1.setFill(Color.ORANGE);
        circle2.setStroke(Color.BLACK);
        circle2.setFill(Color.WHITE);
        circle3.setStroke(Color.BLACK);
        circle3.setFill(Color.GREEN);
        hbox.getChildren().addAll(circle1, circle2, circle3);
        Scene scene = new Scene(hbox, 310, 110);
        primaryStage.setTitle("JavaFXTest");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

public static void main(String[] args) {
    Application.launch(args);
    }
}
