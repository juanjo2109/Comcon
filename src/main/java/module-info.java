module com.example.combinedcontrol {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.combinedcontrol to javafx.fxml;
    exports com.example.combinedcontrol;
}