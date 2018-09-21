package com.gb.cloud.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private TextField username;

    @FXML
    private PasswordField password;
    @FXML
    private Label loginTitle;


    public void handleLoginButtonAction(ActionEvent actionEvent) {

        System.out.println("Пользователь с именем "+ username.getText() + " пытался залогиниться!");
        //Например при неверном логине
        loginTitle.setText(username.getText());
        loginTitle.setStyle("-fx-background-color: #d32f2f; -fx-text-fill: white");
    }

    public void handleCancelButtonAction(ActionEvent actionEvent) {
        System.out.println("Пользователь с именем "+ username.getText() + " решил выйти(");
        System.exit(0);
    }
}
