module com.example.myfirstjavaproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.myfirstjavaproject to javafx.fxml;
    exports com.example.myfirstjavaproject;
}