module com.example.libmanagement {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.libmanagement to javafx.fxml;
    exports com.example.libmanagement;
}