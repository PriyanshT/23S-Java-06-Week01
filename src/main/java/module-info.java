module com.example.week1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week1 to javafx.fxml;
    exports com.example.week1;
}