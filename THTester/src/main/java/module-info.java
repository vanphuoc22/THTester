module com.nvp.thtester {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.nvp.thtester to javafx.fxml;
    exports com.nvp.thtester;
}
