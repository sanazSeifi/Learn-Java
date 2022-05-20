module com.example.learn_java {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.learn_java to javafx.fxml;
    exports com.example.learn_java;
}