package Controller;

import javafx.event.ActionEvent;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.PasswordField;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class LoginController {

    @FXML
    private TextField txtEmail;

    @FXML
    private PasswordField txtSenha;

    @FXML
    private Pane rootPane;

    @FXML
    public void initialize() {
        rootPane.getStylesheets().add(getClass().getResource("/CSS/estilo.css").toExternalForm());
    }

    @FXML
    private void entrar(ActionEvent event) {
        String usuario = txtEmail.getText();
        String senha = txtSenha.getText();

        if ("admin".equals(usuario) && "1234".equals(senha)) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setContentText("Login bem-sucedido!");
            alert.show();
            alert.close();
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/View/tela_principal.fxml"));
                Parent root = fxmlLoader.load();

                Stage stage = new Stage();
                stage.setTitle("Sistema Professores");
                stage.setScene(new Scene(root));
                stage.show();

                // Fecha a tela atual (login)
                ((Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow()).close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setContentText("Usuário ou senha incorretos.");
            alert.show();
        }	
    }
    
    
    @FXML
    private void cadastrar(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/View/TelaCadastro.fxml"));
            Parent root = fxmlLoader.load();

            Stage stage = new Stage();
            stage.setTitle("Cadastro de Professor");
            stage.setScene(new Scene(root));
            stage.show();

            // Fecha a tela atual (login)
            ((Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow()).close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
