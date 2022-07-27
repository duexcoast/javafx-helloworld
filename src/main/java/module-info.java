module com.example.hellodialog {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;

    opens com.example.hellodialog to javafx.fxml;
    exports com.example.hellodialog;
}