module com.example.appjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.appjavafx to javafx.fxml;
    exports com.example.appjavafx;
}