package edu.rico.ejercicios.ejerciciobotonescolores;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField inputTextField;

    @FXML
    private Button reactionButton;

    @FXML
    private Label errorLabel;

    @FXML
    private Button leftButton;

    @FXML
    private Button middleButton;

    @FXML
    private Button rightButton;

    private static final String ERROR_MESSAGE = "No se acepta ninguna entrada distinta de 1, 2 o 3";
    private static final String YELLOW_STYLE = "-fx-background-color: yellow;";
    private static final String GREEN_STYLE = "-fx-background-color: green;";
    private static final String BLUE_STYLE = "-fx-background-color: blue;";

    @FXML
    private void onReactionButtonClick() {
        String input = inputTextField.getText();
        if (input == null) {
            input = "";
        }
        input = input.trim();

        inputTextField.clear();
        resetButtonColors();

        switch (input) {
            case "1":
                errorLabel.setText("");
                leftButton.setStyle(YELLOW_STYLE);
                break;
            case "2":
                errorLabel.setText("");
                middleButton.setStyle(GREEN_STYLE);
                break;
            case "3":
                errorLabel.setText("");
                rightButton.setStyle(BLUE_STYLE);
                break;
            default:
                errorLabel.setText(ERROR_MESSAGE);
                break;
        }
    }

    private void resetButtonColors() {
        leftButton.setStyle("");
        middleButton.setStyle("");
        rightButton.setStyle("");
    }
}
