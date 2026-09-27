module edu.rico.ejercicios.ejerciciobotonescolores {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.rico.ejercicios.ejerciciobotonescolores to javafx.fxml;
    exports edu.rico.ejercicios.ejerciciobotonescolores;
}