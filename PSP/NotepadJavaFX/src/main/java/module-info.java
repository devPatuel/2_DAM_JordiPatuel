module com.example.notepadjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.notepadjavafx to javafx.fxml;
    exports com.example.notepadjavafx;
}