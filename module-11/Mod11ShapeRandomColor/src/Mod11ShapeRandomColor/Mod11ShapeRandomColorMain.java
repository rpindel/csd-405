/*Robin Pindel
 * Mod 11 Shape with Random Color Fill Assignment
 * 2/26/2023
 */

package Mod11ShapeRandomColor;

//Define imports
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.image.*;
import javafx.scene.control.*;
import java.util.*;

public class Mod11ShapeRandomColorMain extends Application {
    //Override the start method of the Application class
    @Override
    public void start(Stage primaryStage) {
    }
    
    //Pane to hold shape
    StackPane stackpane = new StackPane();

    //Make all buttons
    RadioButton radioCircle = new RadioButton("Circle");
    RadioButton radioRectangle = new RadioButton("Rectangle");
    RadioButton radioEllipse = new RadioButton("Ellipse");
    CheckBox checkBox = new CheckBox("Random color fill");

    //Make HBox to hold buttons
    HBox hbox = new HBox();

    //Make BorderPane to hold everything
    BorderPane borderpane = new BorderPane();
    
    //Add all buttons to hbox
    hbox.getChildren().addAll(radioCircle, radioRectangle, radioEllipse, checkBox);

    //Add things to borderpane
    BorderPane.setBottom(hbox);
    
    //Main method since I am using VSCode
    public static void main(String[] args) {
       Application.launch(args);
    }

}