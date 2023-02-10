/*Robin Pindel
 * Module 7 JaxaFX Examples for Essay
 * 2/9/2023
 * Main.java for BorderPane
 */

package MainJavaFXWorkspace;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class MainBorderPane extends Application {
    //Override the start method of the Application class
    @Override
    public void start(Stage primaryStage) {
        //Create a BorderPane
        //Then create CustomPanes as defined in the extra non-public class
        //Creating CustomPanes like our textbook (Page 564) allowed me to name and alter their style easier
        BorderPane bPane = new BorderPane();
        CustomPane cPDead = new CustomPane("Is Dead?");
        CustomPane cPMana = new CustomPane("Low Mana?");
        CustomPane cPPoisoned = new CustomPane("Is Poisoned?");
        CustomPane cPHealth = new CustomPane("Low Health?");
        
        //Create final CustomePane and assign all CustomPanes to BorderPane regions
        bPane.setTop(new CustomPane("Character Name"));
        bPane.setRight(cPMana);
        bPane.setBottom(cPDead);
        bPane.setLeft(cPHealth);
        bPane.setCenter(cPPoisoned);
        
        //Manual toggles for character status
        //boolean dead = false;
        //boolean lowMana = false;
        //boolean poisoned = false;
        //boolean lowHealth = false;
        boolean dead = true;
        boolean lowMana = true;
        boolean poisoned = true;
        boolean lowHealth = true;

        //Styles controls for BorderPane regions based on status variable boolean values
        if (dead == true) {
            cPDead.setStyle("-fx-background-color: gray;" + "-fx-border-color: black;" 
            + "-fx-font-weight: bold;");
        }
        if (lowMana == true) {
            cPMana.setStyle("-fx-background-color: aqua blue;" + "-fx-border-color: black;" 
            + "-fx-font-weight: bold;");
        }
        if (poisoned == true) {
            cPPoisoned.setStyle("-fx-background-color: purple;" + "-fx-border-color: black;" 
            + "-fx-font-weight: bold;");
        }
        if (lowHealth == true) {
            cPHealth.setStyle("-fx-background-color: red;" + "-fx-border-color: black;" 
            + "-fx-font-weight: bold;");
        }

        //Create and set the scene in the stage then display the stage
        Scene scene = new Scene(bPane);
        primaryStage.setTitle("JavaFXTest");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //Non-public class to create CustomPane nodes
    class CustomPane extends StackPane {
        public CustomPane(String title) {
            getChildren().add(new Label(title));
            setStyle("-fx-border-color: black;" + "-fx-font-weight: bold;");
            setPadding(new Insets(20, 20, 20, 20));
        }  
    }
//Main method since I am using VSCode
public static void main(String[] args) {
    Application.launch(args);
    }
}
