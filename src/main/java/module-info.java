module dk.easv.demoproject01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.demoproject01 to javafx.fxml;
    exports dk.easv.demoproject01;
}