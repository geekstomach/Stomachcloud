package com.gb.cloud.client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    TextField textField;
    @FXML
    TextArea textArea;

    public void btnClickMeReaction() {
        textArea.appendText(textField.getText() + '\n');
        textField.clear();
        textField.requestFocus();

    }
}
