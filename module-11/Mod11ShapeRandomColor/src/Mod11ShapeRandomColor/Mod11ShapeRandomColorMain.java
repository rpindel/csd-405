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
import javafx.scene.control.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import java.util.*;

public class Mod11ShapeRandomColorMain extends Application {
    //Override the start method of the Application class
    @Override
    public void start(Stage primaryStage) {

    //Make all needed buttons
    RadioButton radioCircle = new RadioButton("Circle");
    RadioButton radioRectangle = new RadioButton("Rectangle");
    RadioButton radioEllipse = new RadioButton("Ellipse");
    CheckBox checkBox = new CheckBox("Random Color Fill");

    //Make HBox to hold all buttons
    HBox hbox = new HBox(5);
    hbox.setPadding(new Insets(10, 10, 10, 10));

    //Make VBox to hold radio buttons
    VBox vbox = new VBox();

    //Make BorderPane to hold all nodes
    BorderPane borderpane = new BorderPane();
    
    //Add radio buttons to vbox
    vbox.getChildren().addAll(radioCircle, radioEllipse, radioRectangle);

    //Add vbox and checkbox to hbox    
    hbox.getChildren().addAll(vbox, checkBox);
    hbox.setAlignment(Pos.CENTER);

    //Add all node to borderpane except for shapes and stackpane nodes defined below
    borderpane.setBottom(hbox);
    borderpane.setPadding(new Insets(10, 10, 10, 10));

    //Make and setup ToggleGroup for radio buttons
    ToggleGroup togglegroup = new ToggleGroup();
    radioCircle.setToggleGroup(togglegroup);
    radioEllipse.setToggleGroup(togglegroup);
    radioRectangle.setToggleGroup(togglegroup);

    //Configure togglegroup actions for radio buttons
    //Any shape radio button with and without checkbox selected
    //Default white fill and random color fill
    //Create/redraw shape and add to new stackpane
    radioCircle.setOnAction(e -> {
        Random rand = new Random();
        int r = rand.nextInt(255);
        int g = rand.nextInt(255);
        int b = rand.nextInt(255);
        if (radioCircle.isSelected() && (checkBox.isSelected() == false)) {
            Circle circle = new Circle(50);
            circle.setStroke(Color.BLACK);
            circle.setFill(Color.WHITE);
            StackPane stackpane = new StackPane();
            stackpane.getChildren().addAll(circle);
            borderpane.setCenter(stackpane);
        }
        else {
            Circle circle = new Circle(50);
            circle.setStroke(Color.BLACK);
            circle.setFill(Color.rgb(r, g, b));
            StackPane stackpane = new StackPane();
            stackpane.getChildren().addAll(circle);
            borderpane.setCenter(stackpane);
        }
    });
    radioEllipse.setOnAction(e -> {
        Random rand = new Random();
        int r = rand.nextInt(255);
        int g = rand.nextInt(255);
        int b = rand.nextInt(255);
        if (radioEllipse.isSelected() && (checkBox.isSelected() == false)) {
            Ellipse ellipse = new Ellipse(100, 50);
            ellipse.setStroke(Color.BLACK);
            ellipse.setFill(Color.WHITE);
            StackPane stackpane = new StackPane();
            stackpane.getChildren().addAll(ellipse);
            borderpane.setCenter(stackpane);
        }
        else {
            Ellipse ellipse = new Ellipse(100, 50);
            ellipse.setStroke(Color.BLACK);
            ellipse.setFill(Color.rgb(r, g, b));
            StackPane stackpane = new StackPane();
            stackpane.getChildren().addAll(ellipse);
            borderpane.setCenter(stackpane);
        }
    });
    radioRectangle.setOnAction(e -> {
        Random rand = new Random();
        int r = rand.nextInt(255);
        int g = rand.nextInt(255);
        int b = rand.nextInt(255);
        if (radioRectangle.isSelected()&& (checkBox.isSelected() == false)) {
            Rectangle rectangle = new Rectangle(200, 100);
            rectangle.setStroke(Color.BLACK);
            rectangle.setFill(Color.WHITE);
            StackPane stackpane = new StackPane();
            stackpane.getChildren().addAll(rectangle);
            borderpane.setCenter(stackpane);
        }
        else {
            Rectangle rectangle = new Rectangle(200, 100);
            rectangle.setStroke(Color.BLACK);
            rectangle.setFill(Color.rgb(r, g, b));
            StackPane stackpane = new StackPane();
            stackpane.getChildren().addAll(rectangle);
            borderpane.setCenter(stackpane);
        }
    });

    //Configure checkbox actions
    //Any shape radio button With and without checkbox selected
    //Default white fill and random color fill
    //Create/redraw shape and add to new stackpane
    checkBox.setOnAction(e -> {
        Random rand = new Random();
        int r = rand.nextInt(255);
        int g = rand.nextInt(255);
        int b = rand.nextInt(255);
        if (checkBox.isSelected() && radioCircle.isSelected()) {
            Circle circle = new Circle(50);
            circle.setStroke(Color.BLACK);
            circle.setFill(Color.rgb(r, g, b));
            StackPane stackpane = new StackPane();
            stackpane.getChildren().addAll(circle);
            borderpane.setCenter(stackpane);
        }
        else if (checkBox.isSelected() && radioEllipse.isSelected()) {
            Ellipse ellipse = new Ellipse(100, 50);
            ellipse.setStroke(Color.BLACK);
            ellipse.setFill(Color.rgb(r, g, b));
            StackPane stackpane = new StackPane();
            stackpane.getChildren().addAll(ellipse);
            borderpane.setCenter(stackpane);
        }
        else if (checkBox.isSelected() && radioRectangle.isSelected()) {
            Rectangle rectangle = new Rectangle(200, 100);
            rectangle.setStroke(Color.BLACK);
            rectangle.setFill(Color.rgb(r, g, b));
            StackPane stackpane = new StackPane();
            stackpane.getChildren().addAll(rectangle);
            borderpane.setCenter(stackpane);
        }
        else if ((checkBox.isSelected() == false) && radioCircle.isSelected()) {
            Circle circle = new Circle(50);
            circle.setStroke(Color.BLACK);
            circle.setFill(Color.WHITE);
            StackPane stackpane = new StackPane();
            stackpane.getChildren().addAll(circle);
            borderpane.setCenter(stackpane);
        }
        else if ((checkBox.isSelected() == false) && radioEllipse.isSelected()) {
            Ellipse ellipse = new Ellipse(100, 50);
            ellipse.setStroke(Color.BLACK);
            ellipse.setFill(Color.WHITE);
            StackPane stackpane = new StackPane();
            stackpane.getChildren().addAll(ellipse);
            borderpane.setCenter(stackpane);
        }
        else {
            Rectangle rectangle = new Rectangle(200, 100);
            rectangle.setStroke(Color.BLACK);
            rectangle.setFill(Color.WHITE);
            StackPane stackpane = new StackPane();
            stackpane.getChildren().addAll(rectangle);
            borderpane.setCenter(stackpane);
        }
    });
    
    //Create and set the scene then display the stage
    Scene scene = new Scene(borderpane, 300, 200);
    primaryStage.setTitle("Shape Random Color");
    primaryStage.setScene(scene);
    primaryStage.show(); 
    }

    //Main method since I am using VSCode
    public static void main(String[] args) {
       Application.launch(args);
    }
}