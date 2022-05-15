//Write a program that displays various figures such as a Circle, a Rectangle, or an Ellipse.
//Include radio buttons selections for changing the display figure to the one selected.
//Include a checkbox for filling and clearing the displayed figure with a random color.

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

                circleRadioButton.setToggleGroup(shapeRadioButtons);

                //
                circleOne.setVisible(false);

                // rectangle
                Rectangle rectangleOne = new Rectangle(50, 50);

                rectangleOne.setFill(Color.color(Math.random(), Math.random(), Math.random()));

                Label rectangleLabel = new Label("", rectangleOne);

                rectangleLabel.setContentDisplay(ContentDisplay.BOTTOM);

                rectangleLabel.setTextFill(Color.BLACK);

                rectangleOne.setVisible(false);

                RadioButton rectangleRadioButton = new RadioButton("Rectangle");

                rectangleRadioButton.setToggleGroup(shapeRadioButtons);

                // ellipse
                Ellipse ellipseOne = new Ellipse(25, 25);

                ellipseOne.setFill(Color.color(Math.random(), Math.random(), Math.random()));

                Label ellipseLabel = new Label("", ellipseOne);

                ellipseLabel.setContentDisplay(ContentDisplay.BOTTOM);

                ellipseLabel.setTextFill(Color.BLACK);

                ellipseOne.setVisible(false);

                RadioButton ellipseRadioButton = new RadioButton("Ellipse");

                ellipseRadioButton.setToggleGroup(shapeRadioButtons);

                CheckBox redCheckBox = new CheckBox("RED");

                CheckBox blueCheckBox = new CheckBox("BLUE");

                CheckBox greenCheckbox = new CheckBox("GREEN");

                HBox paneTwo = new HBox();
                paneTwo.getChildren().addAll(redCheckBox, blueCheckBox, greenCheckbox);

                VBox pane = new VBox();
                pane.getChildren().addAll(circleRadioButton, circleLabel, rectangleRadioButton, rectangleLabel,
                                ellipseRadioButton, ellipseLabel, paneTwo);

                Scene scene = new Scene(pane, 600, 300);
                primaryStage.setTitle("Module 11 Assignment");
                primaryStage.setScene(scene);
                primaryStage.show();

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
                                }
                        }
                });

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

        public static void main(String args[]) {
                launch(args);
        }
}
