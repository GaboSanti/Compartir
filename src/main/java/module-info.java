module com.example.integradora1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.integradora1 to javafx.fxml;
    exports com.example.integradora1;
}