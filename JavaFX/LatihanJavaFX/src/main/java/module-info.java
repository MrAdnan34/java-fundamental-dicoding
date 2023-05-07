module com.example.latihanjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.latihanjavafx to javafx.fxml;
    exports com.example.latihanjavafx;
    exports com.example.latihanjavafx.controller;
    opens com.example.latihanjavafx.controller to javafx.fxml;
    exports com.example.latihanjavafx.dataaccount;
    opens com.example.latihanjavafx.dataaccount to javafx.fxml;
}