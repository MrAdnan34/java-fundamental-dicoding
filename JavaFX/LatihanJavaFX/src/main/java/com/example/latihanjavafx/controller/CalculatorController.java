package com.example.latihanjavafx.controller;

import com.example.latihanjavafx.utils.Helpers;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController extends Helpers {

//    Attribute
    @FXML
    private TextField number1Field;

    @FXML
    private TextField number2Field;

    @FXML
    private Button addButton;

    @FXML
    private Button suubstactButton;

    @FXML
    private Button multiplyButton;

    @FXML
    private Button divideButton;

    @FXML
    private Label resultLabel;

//    Method
    @FXML
    private void add(ActionEvent event) {
        try {
            double number1 = Double.parseDouble(number1Field.getText());
            double number2 = Double.parseDouble(number2Field.getText());
            double result = number1 + number2;
            resultLabel.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            resultLabel.setText("Error: Invalid input");
        }
    }

    @FXML
    private void subtract(ActionEvent event) {
        try {
            double number1 = Double.parseDouble(number1Field.getText());
            double number2 = Double.parseDouble(number2Field.getText());
            double result = number1 - number2;
            resultLabel.setText(String.format("%.2f", result));
        } catch (NumberFormatException e) {
            resultLabel.setText("Error: Invalid input");
        }
    }

    @FXML
    private void multiply(ActionEvent event) {
        try {
            double number1 = Double.parseDouble(number1Field.getText());
            double number2 = Double.parseDouble(number2Field.getText());
            double result = number1 * number2;
            resultLabel.setText(String.format("%.2f", result));
        } catch (NumberFormatException e) {
            resultLabel.setText("Error: Invalid input");
        }
    }

    @FXML
    private void divide(ActionEvent event) {
        try {
            double number1 = Double.parseDouble(number1Field.getText());
            double number2 = Double.parseDouble(number2Field.getText());
            double result = number1 / number2;
            resultLabel.setText(String.format("%.2f", result));
        } catch (NumberFormatException e) {
            resultLabel.setText("Error: Invalid input");
        } catch (ArithmeticException e) {
            resultLabel.setText("Error: Division by zero");
        }
    }

    @FXML
    private void backPage(ActionEvent event) {
        changePage(event, "home");
    }

    @FXML
    private void logout(ActionEvent event) {
        changePage(event, "hello-view");
    }
}