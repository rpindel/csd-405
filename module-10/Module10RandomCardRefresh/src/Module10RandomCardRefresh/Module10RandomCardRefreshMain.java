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
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.image.*;
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
    HBox hbox = new HBox(5);
    hbox.setPadding(new Insets(10, 10, 10, 10));
    
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
