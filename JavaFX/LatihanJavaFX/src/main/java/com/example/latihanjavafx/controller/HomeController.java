package com.example.latihanjavafx.controller;

import com.example.latihanjavafx.utils.Helpers;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class HomeController extends Helpers {
    @FXML
    private void logout(ActionEvent event) {
        changePage(event, "hello-view");
    }

    @FXML
    private void calculatorPage(ActionEvent event) {
        changePage(event, "calculator");
    }
}
