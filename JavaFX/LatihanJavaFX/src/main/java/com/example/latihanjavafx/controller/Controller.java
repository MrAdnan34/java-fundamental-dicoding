package com.example.latihanjavafx.controller;

import com.example.latihanjavafx.dataaccount.Account;
import com.example.latihanjavafx.utils.Helpers;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Controller extends Helpers {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

//    @FXML
//    private void loginAction(ActionEvent event) {
//        if (usernameField.getText().equals("user") && passwordField.getText().equals("1234")) {
//            System.out.println("Login Berhasil");
//            changePage(event, "home");
//        } else {
//            System.out.println("Login Gagal awokaowk");
//        }
//    }

    @FXML
    private void loginAction(ActionEvent event) {
        if (isValidLogin(usernameField.getText(), passwordField.getText())) {
            System.out.println("Login Berhasil");
            changePage(event, "home");
        } else {
            System.out.println("Login Gagal awokaowk");
        }
    }

}