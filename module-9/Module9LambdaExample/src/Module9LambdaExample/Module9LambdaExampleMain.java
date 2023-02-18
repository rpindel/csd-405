/*Robin Pindel
 * Module 9 Lambda Example
 * 2/18/2023
 */

package Module9LambdaExample;

import javafx.application.*;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.text.*;
import javafx.scene.layout.*;
import javafx.geometry.Insets;
import javafx.scene.control.*;

public class Module9LambdaExampleMain extends Application {
    @Override
    public void start(Stage primaryStage){
        Text text = new Text(25, 25, "Please press a button");
        StackPane stackpane = new StackPane(text);        
        
        Button btUp = new Button("Arrow Up");
        Button btRight = new Button("Arrow Right");
        Button btDown = new Button("Arrow Down");
        Button btLeft = new Button("Arrow Left");
        HBox hbox = new HBox(btUp, btRight, btDown, btLeft);
        hbox.setSpacing(10);
        hbox.setAlignment(Pos.CENTER);

        Button btSpace = new Button("Spacebar");
        StackPane stackpane2 = new StackPane(btSpace);

        BorderPane borderpane = new BorderPane();
        borderpane.setTop(stackpane);
        borderpane.setCenter(hbox);
        borderpane.setBottom(stackpane2);
        borderpane.setPadding(new Insets(0, 0, 20, 0));

        btUp.setOnAction((ActionEvent e) -> {
            text.setText("You pressed UP!");
        });

        btRight.setOnAction((e) -> {
            text.setText("You pressed RIGHT!");
        });

        btDown.setOnAction(e -> {
            text.setText("You pressed DOWN!");
        });

        btLeft.setOnAction(e -> 
            text.setText("You pressed LEFT!"));

        btSpace.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                text.setText("You pressed SPACEBAR!");
            }
        });

        Scene scene = new Scene(borderpane, 400, 100);
        primaryStage.setTitle("Lambda Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //Main method since I am using VSCode
    public static void main(String[] args) {
        Application.launch(args);
    }
}

