module mx.arturogil.css {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens mx.arturogil.css to javafx.fxml;
    exports mx.arturogil.css;
}