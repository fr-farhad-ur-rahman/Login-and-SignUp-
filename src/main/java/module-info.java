module com.example.loginandsignup {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.loginandsignup to javafx.fxml;
    exports com.example.loginandsignup;
}