module com.example.latihanjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.latihanjavafx.controller to javafx.fxml;
    exports com.example.latihanjavafx.controller;
    opens com.example.latihanjavafx.utils to javafx.fxml;
    exports com.example.latihanjavafx.utils;
}