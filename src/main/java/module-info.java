module com.example.demoagain {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.demoagain to javafx.fxml;
    exports com.example.demoagain;
}