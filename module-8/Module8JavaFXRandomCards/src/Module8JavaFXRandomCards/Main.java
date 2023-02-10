/*Robin Pindel
 * Module 8 JaxaFX Random Cards Assignment
 * 2/9/2023
 * 
 * Reference
 * Borderpane (javafx 8). (2015, February 10). Retrieved February 9, 2023, 
 * from https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/BorderPane.html
 * Page 441
 */
package Module8JavaFXRandomCards;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.image.*;
import java.util.*;


public class Main extends Application {
 
//Override the start method of the Application class
    @Override
    public void start(Stage primaryStage) {
    //Store numbers 1-52 to array list
    ArrayList<Integer> cardList = new ArrayList<>();
    for (int i = 1; i <=52; i++){
        cardList.add(i);
    }

    //Random shuffle of array list 11.12
    //System.out.println(cardList);
    java.util.Collections.shuffle(cardList);
    //System.out.println(cardList);

    //Use first 4 numbers in array list [0-3] as the image file names for the cards
    //Create an Image and ImageView for each selected card
    Image card1 = new Image("C:\\Users\\Coding\\csd\\csd-405\\module-8\\cards\\" + cardList.get(0) + ".png");
    Image card2 = new Image("C:\\Users\\Coding\\csd\\csd-405\\module-8\\cards\\" + cardList.get(1) + ".png");
    Image card3 = new Image("C:\\Users\\Coding\\csd\\csd-405\\module-8\\cards\\" + cardList.get(2) + ".png");
    Image card4 = new Image("C:\\Users\\Coding\\csd\\csd-405\\module-8\\cards\\" + cardList.get(3) + ".png");
    ImageView imageView1 = new ImageView(card1);
    ImageView imageView2 = new ImageView(card2);
    ImageView imageView3 = new ImageView(card3);
    ImageView imageView4 = new ImageView(card4);

    //Create HBox to hold card images ImageViews
    HBox hbox = new HBox();
    hbox.setPadding(new Insets(10, 10, 10, 10));
    hbox.setAlignment(Pos.CENTER);
    
    //Add ImagesViews to HBox
    hbox.getChildren().addAll(imageView1, imageView2, imageView3, imageView4);

    //Create and set the scene then display the stage
    Scene scene = new Scene(hbox);
    primaryStage.setTitle("Four random cards");
    primaryStage.setScene(scene);
    primaryStage.show(); 
    }    
    
    //Main method since I am using VSCode
    public static void main(String[] args) {
        Application.launch(args);
    }
}