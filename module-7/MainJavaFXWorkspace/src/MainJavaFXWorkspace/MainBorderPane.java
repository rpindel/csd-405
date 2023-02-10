/*Robin Pindel
 * Module 7 JaxaFX Examples for Essay
 * Main.java for BorderPane
 */

package MainJavaFXWorkspace;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;

public class MainBorderPane extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane bPane = new BorderPane();
        bPane.setTop(new CustomPane("Top"));
        bPane.setRight(new CustomPane("Right"));
        bPane.setBottom(new CustomPane("Bottom"));
        bPane.setLeft(new CustomPane("Left"));
        bPane.setCenter(new CustomPane("Center"));
        
        Scene scene = new Scene(bPane);
        primaryStage.setTitle("JavaFXTest");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    class CustomPane extends StackPane {
        public CustomPane(String title) {
            getChildren().add(new Label(title));
            setStyle("-fx-border-color: black");
            setPadding(new Insets(20, 20, 20, 20));
        }
    }

public static void main(String[] args) {
    Application.launch(args);
    }
}
