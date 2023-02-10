/*Robin Pindel
 * Module 7 JaxaFX Examples for Essay
 * Main.java for HBox
 */

package MainJavaFXWorkspace;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class MainHBox extends Application {

    @Override
    public void start(Stage primaryStage) {
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(10, 10, 10, 10));
        hbox.setAlignment(Pos.CENTER);
        StackPane stack = new StackPane();
        
        Rectangle r1 = new Rectangle(0, 0, 50, 100);
        Rectangle r2 = new Rectangle(50, 0, 50, 100);
        Rectangle r3 = new Rectangle(100, 0, 50, 100);
        Rectangle border = new Rectangle(0, 0, 150, 100);
        Text text = new Text("Ireland");
        
        r1.setFill(Color.ORANGE);
        r2.setFill(Color.WHITE);
        r3.setFill(Color.GREEN);
        border.setStroke(Color.BLACK);
        border.setFill(null);
        
        hbox.getChildren().addAll(r1, r2, r3);
        stack.getChildren().addAll(hbox, border, text);
        
        Scene scene = new Scene(stack, 220, 170);
        primaryStage.setTitle("JavaFXTest");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

public static void main(String[] args) {
    Application.launch(args);
    }
}
