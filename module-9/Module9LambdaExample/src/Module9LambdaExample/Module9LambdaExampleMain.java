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
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.scene.control.*;

public class Module9LambdaExampleMain extends Application {
    @Override
    public void start(Stage primaryStage){
        Text text1 = new Text (
            "\n" +
            "btX.setOnAction(new EventHandler<ActionEvent>() {" +
                "\n\t@Override" +
                "\n\tpublic void handle(ActionEvent e) {" +
                    "\n\t\ttext.setText(\"You clicked BUTTON X!\");" +
                "\n\t};");
        Text text2 = new Text("Please click to transform the code using lambda formatting.");
        StackPane stackpane1 = new StackPane(text1);
        StackPane stackpane2 = new StackPane(text2);    
        
        Button btLE1 = new Button("Lambda v1");
        Button btLE2 = new Button("Lambda v2");
        Button btLE3 = new Button("Lambda v3");
        Button btLE4 = new Button("Lambda v4");
        HBox hbox = new HBox(btLE1, btLE2, btLE3, btLE4);
        hbox.setSpacing(10);
        hbox.setAlignment(Pos.CENTER);

        BorderPane borderpane = new BorderPane();
        borderpane.setTop(stackpane1);
        borderpane.setCenter(stackpane2);
        borderpane.setBottom(hbox);
        borderpane.setPadding(new Insets(0, 0, 20, 0));

        btLE1.setOnAction((ActionEvent e) -> {
            text2.setText("\n" +
            "The above is equivalent to:" +
            "\n" +
            "\nbtX.setOnAction((ActionEvent e) -> {" +
            "\n\ttext.setText(\"You clicked BUTTON X!\")" +
            "});" +
            "\n");
        });

        btLE2.setOnAction((e) -> {
            text2.setText("\n" +
            "The above is equivalent to:" +
            "\n" +
            "\nbtX.setOnAction((e) -> {" +
            "\n\ttext.setText(\"You clicked BUTTON X!\")" +
            "});" +
            "\n");
        });

        btLE3.setOnAction(e -> {
            text2.setText("\n" +
            "The above is equivalent to:" +
            "\n" +
            "\nbtX.setOnAction(e -> {" +
            "\n\ttext.setText(\"You clicked BUTTON X!\")" +
            "});" +
            "\n");
        });

        btLE4.setOnAction(e -> 
            text2.setText("\n" +
            "The above is equivalent to:" +
            "\n" +
            "\nbtX.setOnAction(e -> " +
            "\n\ttext.setText(\"You clicked BUTTON X!\")" +
            ");" +
            "\n"
        ));

        Scene scene = new Scene(borderpane, 400, 300);
        primaryStage.setTitle("Lambda Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //Main method since I am using VSCode
    public static void main(String[] args) {
        Application.launch(args);
    }
}

