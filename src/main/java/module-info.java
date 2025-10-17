module com.example.kdt_mes_0924 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.kdt_mes_0924 to javafx.fxml;
    exports com.example.kdt_mes_0924;
}