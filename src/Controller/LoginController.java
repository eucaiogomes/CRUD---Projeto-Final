package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class LoginController {

    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField txtSenha;

    @FXML
    private void entrar() {
        String usuario = txtUsuario.getText();
        String senha = txtSenha.getText();

        if ("admin".equals(usuario) && "1234".equals(senha)) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setContentText("Login bem-sucedido!");
            alert.show();
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setContentText("Usuário ou senha incorretos.");
            alert.show();
        }
    }
}
