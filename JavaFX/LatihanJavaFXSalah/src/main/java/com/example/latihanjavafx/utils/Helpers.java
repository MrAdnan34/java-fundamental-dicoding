package com.example.latihanjavafx.utils;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Helpers {
    protected void changePage(ActionEvent event, String page) {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();

        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("..../resources/com.example.latihanjavafx.view/" + page + ".fxml"));
        } catch (IOException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }

        stage.setScene(new Scene(root, 1280, 720));
        stage.show();
    }
}
