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
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import java.util.*;

public class Mod11ShapeRandomColorMain extends Application {
    //Override the start method of the Application class
    @Override
    public void start(Stage primaryStage) {
    
    //Pane to hold shape
    StackPane stackpane = new StackPane();

    //Make all buttons
    RadioButton radioCircle = new RadioButton("Circle");
    RadioButton radioRectangle = new RadioButton("Rectangle");
    RadioButton radioEllipse = new RadioButton("Ellipse");
    CheckBox checkBox = new CheckBox("Random Color Fill");

    //Make HBox to hold buttons
    HBox hbox = new HBox(5);
    hbox.setPadding(new Insets(10, 10, 10, 10));

    //Make VBox to hold radio buttons
    VBox vbox = new VBox();

    //Make BorderPane to hold everything
    BorderPane borderpane = new BorderPane();
    
    //Add radio buttons to vbxo
    vbox.getChildren().addAll(radioCircle, radioEllipse, radioRectangle);

    //Add vbox and checkbox to hbox    
    hbox.getChildren().addAll(vbox, checkBox);

    //Make and configure ToggleGroup for radio buttons
    ToggleGroup togglegroup = new ToggleGroup();
    radioCircle.setToggleGroup(togglegroup);
    radioEllipse.setToggleGroup(togglegroup);
    radioRectangle.setToggleGroup(togglegroup);

    //Toggle group for selected shape
    Shape shape;
    switch (togglegroup.getSelectedToggle()) {
        case radioCircle:
            Circle circle = new Circle(100);
            circle.setStroke(Color.RED);
            circle.setFill(Color.PINK);
            shape = circle;
            break;
        case radioEllipse:
            Ellipse ellipse = new Ellipse(50, 100);
            ellipse.setStroke(Color.RED);
            ellipse.setFill(Color.PINK);
            shape = ellipse;
            break;
        case radioRectangle:
            Rectangle rectangle = new Rectangle(50, 100);
            rectangle.setStroke(Color.RED);
            rectangle.setFill(Color.PINK);
            shape = rectangle;
            break;
        default:
            break;
    }

    //Testing shape
    //Circle circle = new Circle(100);
    //circle.setStroke(Color.RED);
    //circle.setFill(Color.PINK);

    //Add things to borderpane
    borderpane.setBottom(hbox);
    borderpane.setCenter(shape);
    borderpane.setPadding(new Insets(10, 10, 10, 10));
    
    //Create and set the scene then display the stage
    Scene scene = new Scene(borderpane);
    primaryStage.setTitle("Shape Random Color");
    primaryStage.setScene(scene);
    primaryStage.show(); 
    }

    //Main method since I am using VSCode
    public static void main(String[] args) {
       Application.launch(args);
    }
}