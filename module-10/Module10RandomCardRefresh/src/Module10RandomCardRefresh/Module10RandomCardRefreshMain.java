/*Robin Pindel
 * Module 8 JaxaFX Random Cards Assignment
 * 2/19/2023
 * 
 * Reference
 * LIANG, Y. D. A. N. I. E. L. (2019). 
 * Introduction to java programming and Data Structures. PRENTICE HALL. 
 * Pages 441 and 586
 */

package Module10RandomCardRefresh;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.image.*;
import javafx.scene.control.*;
import java.util.*;

public class Module10RandomCardRefreshMain extends Application {
 
    //Override the start method of the Application class
    @Override
    public void start(Stage primaryStage) {

    //Store numbers 1-52 to ArrayList
    ArrayList<Integer> cardList = new ArrayList<>();
    for (int i = 1; i <=52; i++){
        cardList.add(i);
    }

    //Random shuffle of ArrayList
    java.util.Collections.shuffle(cardList);

    //Use first 4 numbers in ArrayList [0-3] as the image file names for the cards
    //Create an Image and ImageView for each selected card
    Image card1 = new Image("file:rsc\\cards\\" + cardList.get(0) + ".png");
    Image card2 = new Image("file:rsc\\cards\\" + cardList.get(1) + ".png");
    Image card3 = new Image("file:rsc\\cards\\" + cardList.get(2) + ".png");
    Image card4 = new Image("file:rsc\\cards\\" + cardList.get(3) + ".png");
    ImageView imageView1 = new ImageView(card1);
    ImageView imageView2 = new ImageView(card2);
    ImageView imageView3 = new ImageView(card3);
    ImageView imageView4 = new ImageView(card4);

    //Create HBox to hold card images ImageViews
    HBox hboxCards = new HBox(5);
    hboxCards.setPadding(new Insets(10, 10, 10, 10));
    
    //Add ImagesViews to HBox
    hboxCards.getChildren().addAll(imageView1, imageView2, imageView3, imageView4);

    //Create Refresh and End buttons and their HBox
    Button btRfresh = new Button("Refresh");
    Button btEnd = new Button ("End");
    HBox hboxButtons = new HBox(5);
    hboxButtons.getChildren().addAll(btRfresh, btEnd);
    hboxButtons.setPadding(new Insets(10, 10, 10, 10));
    hboxCards.setAlignment(Pos.CENTER);
    hboxButtons.setAlignment(Pos.CENTER);

    //Define Refresh and End button actions
    btRfresh.setOnAction(e -> {
        System.out.println("Refreshed!");
        
        //New random shuffle of ArrayList
        java.util.Collections.shuffle(cardList);

        //Set a new card image to ImageViews
        imageView1.setImage(new Image("file:rsc\\cards\\" + cardList.get(0) + ".png") );
        imageView2.setImage(new Image("file:rsc\\cards\\" + cardList.get(1) + ".png"));;
        imageView3.setImage(new Image("file:rsc\\cards\\" + cardList.get(2) + ".png"));
        imageView4.setImage(new Image("file:rsc\\cards\\" + cardList.get(3) + ".png"));
    });
    
    btEnd.setOnAction(e -> {
        System.out.println("Ended!");

        //Ends the program with a status code of 0 - Success
        System.exit(0);
    });

    //Create BorderPane and add to it
    BorderPane borderpane = new BorderPane();
    borderpane.setCenter(hboxCards);
    borderpane.setBottom(hboxButtons);
    borderpane.setStyle("-fx-background-color: pink");

    //Create and set the scene then display the stage
    Scene scene = new Scene(borderpane);
    primaryStage.setTitle("Four random cards");
    primaryStage.setScene(scene);
    primaryStage.show(); 
    }    
    
    //Main method since I am using VSCode
    public static void main(String[] args) {
        Application.launch(args);
    }
}
