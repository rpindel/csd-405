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
        CustomPane cPDead = new CustomPane("Is Dead?");
        CustomPane cPMana = new CustomPane("Low Mana?");
        CustomPane cPPoisoned = new CustomPane("Is Poisoned?");
        CustomPane cPHealth = new CustomPane("Low Health?");
        
        bPane.setTop(new CustomPane("Character Name"));
        bPane.setRight(cPMana);
        bPane.setBottom(cPDead);
        bPane.setLeft(cPHealth);
        bPane.setCenter(cPPoisoned);
        
        //boolean dead = false;
        //boolean lowMana = false;
        //boolean poisoned = false;
        //boolean lowHealth = false;
        boolean dead = true;
        boolean lowMana = true;
        boolean poisoned = true;
        boolean lowHealth = true;

        if (dead == true) {
            cPDead.setStyle("-fx-background-color: gray");
        }
        if (lowMana == true) {
            cPMana.setStyle("-fx-background-color: aqua blue");
        }
        if (poisoned == true) {
            cPPoisoned.setStyle("-fx-background-color: purple");
        }
        if (lowHealth == true) {
            cPHealth.setStyle("-fx-background-color: red");
        }

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
