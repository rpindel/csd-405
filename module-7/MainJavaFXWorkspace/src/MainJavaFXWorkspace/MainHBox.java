/*Robin Pindel
 * Module 7 JaxaFX Examples for Essay
 * 2/9/2023
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
    //Override the start method of the Application class
    @Override
    public void start(Stage primaryStage) {
        //Create and set basic config for the HBox
        //Then create a StackPane to use with the HBox
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(10, 10, 10, 10));
        hbox.setAlignment(Pos.CENTER);
        StackPane stack = new StackPane();
        
        //Create the children nodes that will be added to the HBox and StackPane
        //These nodes will form the flag body, border, and label
        Rectangle r1 = new Rectangle(0, 0, 50, 100);
        Rectangle r2 = new Rectangle(50, 0, 50, 100);
        Rectangle r3 = new Rectangle(100, 0, 50, 100);
        Rectangle border = new Rectangle(0, 0, 150, 100);
        Text text = new Text("Ireland");
        
        //Set color properties for the flag body Rectangles
        //Then set color properties for the border Rectangle
        r1.setFill(Color.ORANGE);
        r2.setFill(Color.WHITE);
        r3.setFill(Color.GREEN);
        border.setStroke(Color.BLACK);
        border.setFill(null);
        
        //Add flag body Rectangles to the HBox
        //Then add the HBox, border Rectangle, and label to StackPane
        hbox.getChildren().addAll(r1, r2, r3);
        stack.getChildren().addAll(hbox, border, text);

        //Create and set the scene in the stage then display the stage
        Scene scene = new Scene(stack, 220, 170);
        primaryStage.setTitle("JavaFXTest");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
//Main method since I am using VSCode
public static void main(String[] args) {
    Application.launch(args);
    }
}
