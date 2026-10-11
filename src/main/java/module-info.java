module edu.utj.evnd.poo.tablas {
    requires javafx.controls;
    requires javafx.fxml;

    opens edu.utj.evnd.poo.tablas to javafx.fxml, javafx.base;
    exports edu.utj.evnd.poo.tablas;
}
