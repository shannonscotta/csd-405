// scott shannon                12 May 2022             Module 8 assignment
// The purpose of this code is to add cards to a sub dir and randomly select and display four with JavaFX
package com.example.test;

import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {

        String[] cardArray = {
                "48.png", "49.png", "b1fv.png", "8.png", "9.png", "14.png", "28.png", "29.png", "15.png", "17.png",
                "16.png", "12.png", "b2fv.png", "13.png", "39.png", "11.png", "10.png", "38.png", "35.png", "21.png",
                "20.png", "34.png", "22.png", "36.png", "37.png", "23.png", "27.png", "33.png", "b2fh.png", "32.png",
                "26.png", "18.png", "30.png", "24.png", "25.png", "31.png", "19.png", "4.png", "42.png", "43.png",
                "5.png", "41.png", "7.png", "54.png", "6.png", "40.png", "44.png", "2.png", "50.png", "3.png", "51.png",
                "45.png", "b1fh.png", "53.png", "1.png", "47.png", "46.png", "52.png"
        };

        // iterate over cardArray
        int cardOne = new Random().nextInt(cardArray.length);
        int cardTwo = new Random().nextInt(cardArray.length);
        int cardThree = new Random().nextInt(cardArray.length);
        int cardFour = new Random().nextInt(cardArray.length);


        GridPane myGridPane = new GridPane();

        myGridPane.setHgap(10);
        myGridPane.setVgap(10);

        Image imageOne = new Image(new FileInputStream("src/main/resources/com/example/test/Cards/" + cardArray[cardOne]));
        Image imageTwo = new Image(new FileInputStream("src/main/resources/com/example/test/Cards/" + cardArray[cardTwo]));
        Image imageThree = new Image(new FileInputStream("src/main/resources/com/example/test/Cards/" + cardArray[cardThree]));
        Image imageFour = new Image(new FileInputStream("src/main/resources/com/example/test/Cards/" + cardArray[cardFour]));

        //Setting the image view
        ImageView imageViewOne = new ImageView(imageOne);
        ImageView imageViewTwo = new ImageView(imageTwo);
        ImageView imageViewThree = new ImageView(imageThree);
        ImageView imageViewFour = new ImageView(imageFour);

        //Setting the position of the image
        imageViewOne.setX(10);
        imageViewOne.setY(20);

        imageViewTwo.setX(85);
        imageViewTwo.setY(20);

        imageViewThree.setX(160);
        imageViewThree.setY(20);

        imageViewFour.setX(235);
        imageViewFour.setY(20);

        //setting the fit height and width of the image view
        imageViewOne.setFitHeight(91);
        imageViewOne.setFitWidth(100);

        imageViewTwo.setFitHeight(91);
        imageViewTwo.setFitWidth(100);

        imageViewThree.setFitHeight(91);
        imageViewThree.setFitWidth(100);

        imageViewFour.setFitHeight(91);
        imageViewFour.setFitWidth(100);

        //Setting the preserve ratio of the image view
        imageViewOne.setPreserveRatio(true);
        imageViewTwo.setPreserveRatio(true);
        imageViewThree.setPreserveRatio(true);
        imageViewFour.setPreserveRatio(true);

        //Creating a Group object
        Group root = new Group(imageViewOne, imageViewTwo, imageViewThree, imageViewFour);

        //Creating a scene object
        Scene scene = new Scene(root, 310, 125);

        //Setting title to the Stage
        stage.setTitle("Your cards are...");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }
    public static void main(String args[]) {
        launch(args);
    }
}