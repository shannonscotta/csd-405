// scott shannon                15 May 2022             Module 11 assignment
// The purpose of this code is to display shapes from radio button selections and then change the color based on checkboxes

package com.example.test;

import java.io.IOException;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class ShapesAndColors extends javafx.application.Application {
        @Override
        public void start(Stage primaryStage) throws IOException {

                // create toggle group
                ToggleGroup shapeRadioButtons = new ToggleGroup();

                // create circle obj
                Circle circleOne = new Circle(50, 50, 25);

                // select random color for circle
                circleOne.setFill(Color.color(Math.random(), Math.random(), Math.random()));

                // create circle label
                Label circleLabel = new Label("", circleOne);

                // set node position
                circleLabel.setContentDisplay(ContentDisplay.BOTTOM);

                // set fill to black
                circleLabel.setTextFill(Color.BLACK);

                // radio button for circle
                RadioButton circleRadioButton = new RadioButton("Circle");

                //set circle radio button to toggle group
                circleRadioButton.setToggleGroup(shapeRadioButtons);

                //set circle to false 
                circleOne.setVisible(false);


                // create rectangle same steps as circle
                Rectangle rectangleOne = new Rectangle(50, 50);
                rectangleOne.setFill(Color.color(Math.random(), Math.random(), Math.random()));
                Label rectangleLabel = new Label("", rectangleOne);
                rectangleLabel.setContentDisplay(ContentDisplay.BOTTOM);
                rectangleLabel.setTextFill(Color.BLACK);
                rectangleOne.setVisible(false);
                RadioButton rectangleRadioButton = new RadioButton("Rectangle");
                rectangleRadioButton.setToggleGroup(shapeRadioButtons);

                // create ellipse same steps as circle
                Ellipse ellipseOne = new Ellipse(25, 25);
                ellipseOne.setFill(Color.color(Math.random(), Math.random(), Math.random()));
                Label ellipseLabel = new Label("", ellipseOne);
                ellipseLabel.setContentDisplay(ContentDisplay.BOTTOM);
                ellipseLabel.setTextFill(Color.BLACK);
                ellipseOne.setVisible(false);
                RadioButton ellipseRadioButton = new RadioButton("Ellipse");
                ellipseRadioButton.setToggleGroup(shapeRadioButtons);


                // create checkboxes 
                CheckBox redCheckBox = new CheckBox("RED");
                CheckBox blueCheckBox = new CheckBox("BLUE");
                CheckBox greenCheckbox = new CheckBox("GREEN");
                CheckBox randomCheckbox = new CheckBox("RANDOM");

                // create Hbox and args to paneTwo
                HBox paneTwo = new HBox();
                paneTwo.getChildren().addAll(redCheckBox, blueCheckBox, greenCheckbox, randomCheckbox);

                // create VBox and args to pane
                VBox pane = new VBox();
                pane.getChildren().addAll(circleRadioButton, circleLabel, rectangleRadioButton, rectangleLabel,
                                ellipseRadioButton, ellipseLabel, paneTwo);

                // create, set, and display scene
                Scene scene = new Scene(pane, 600, 300);
                primaryStage.setTitle("Module 11 Assignment");
                primaryStage.setScene(scene);
                primaryStage.show();

                // event listener for redCheckBox
                redCheckBox.selectedProperty().addListener(new ChangeListener<Boolean>() {
                        @Override
                        public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue,
                                        Boolean newValue) {

                                if (redCheckBox.isSelected()) {
                                        circleOne.setFill(Color.RED);
                                        rectangleOne.setFill(Color.RED);
                                        ellipseOne.setFill(Color.RED);

                                        blueCheckBox.setSelected(false);
                                        greenCheckbox.setSelected(false);
                                        randomCheckbox.setSelected(false);
                                }
                        }
                });

                blueCheckBox.selectedProperty().addListener(new ChangeListener<Boolean>() {
                        @Override
                        public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue,
                                        Boolean newValue) {

                                if (blueCheckBox.isSelected()) {
                                        circleOne.setFill(Color.BLUE);
                                        rectangleOne.setFill(Color.BLUE);
                                        ellipseOne.setFill(Color.BLUE);

                                        redCheckBox.setSelected(false);
                                        greenCheckbox.setSelected(false);
                                        randomCheckbox.setSelected(false);
                                }
                        }
                });

                greenCheckbox.selectedProperty().addListener(new ChangeListener<Boolean>() {
                        @Override
                        public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue,
                                        Boolean newValue) {

                                if (greenCheckbox.isSelected()) {
                                        circleOne.setFill(Color.GREEN);
                                        rectangleOne.setFill(Color.GREEN);
                                        ellipseOne.setFill(Color.GREEN);

                                        blueCheckBox.setSelected(false);
                                        redCheckBox.setSelected(false);
                                        randomCheckbox.setSelected(false);
                                }
                        }
                });

                randomCheckbox.selectedProperty().addListener(new ChangeListener<Boolean>() {
                        @Override
                        public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue,
                                        Boolean newValue) {

                                if (randomCheckbox.isSelected()) {
                                        circleOne.setFill(Color.color(Math.random(), Math.random(), Math.random()));
                                        rectangleOne.setFill(Color.color(Math.random(), Math.random(), Math.random()));
                                        ellipseOne.setFill(Color.color(Math.random(), Math.random(), Math.random()));

                                        blueCheckBox.setSelected(false);
                                        redCheckBox.setSelected(false);
                                        greenCheckbox.setSelected(false);

                                }
                        }
                });

                // event listener for circle radio button
                circleRadioButton.selectedProperty().addListener(new ChangeListener<Boolean>() {
                        @Override
                        public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue,
                                        Boolean newValue) {

                                if (circleRadioButton.isSelected()) {
                                        circleOne.setVisible(true);
                                        rectangleOne.setVisible(false);
                                        ellipseOne.setVisible(false);
                                }
                        }
                });

                rectangleRadioButton.selectedProperty().addListener(new ChangeListener<Boolean>() {
                        @Override
                        public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue,
                                        Boolean newValue) {

                                if (rectangleRadioButton.isSelected()) {
                                        circleOne.setVisible(false);
                                        rectangleOne.setVisible(true);
                                        ellipseOne.setVisible(false);
                                }
                        }
                });

                ellipseRadioButton.selectedProperty().addListener(new ChangeListener<Boolean>() {
                        @Override
                        public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue,
                                        Boolean newValue) {

                                if (ellipseRadioButton.isSelected()) {
                                        circleOne.setVisible(false);
                                        rectangleOne.setVisible(false);
                                        ellipseOne.setVisible(true);
                                }
                        }
                });

        }

        // launch args
        public static void main(String args[]) {
                launch(args);
        }
}
