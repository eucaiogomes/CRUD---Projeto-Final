package Controller;

import java.io.IOException;

import DAO.ProfessorDAO;
import DTO.Professor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CadastroController {

    @FXML
    private TextField txtNomeProfessor;

    @FXML
    private TextField txtEmailProfessor;

    @FXML
    private PasswordField txtSenhaProfessor;

    @FXML
    public void cadastrar(ActionEvent event) {
        Professor p = new Professor();
        ProfessorDAO.cadastrarProfessor(txtNomeProfessor.getText(),txtEmailProfessor.getText(),txtSenhaProfessor.getText());
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/View/TelaLogin.fxml"));
            Parent root = fxmlLoader.load();

            Stage stage = new Stage();
            stage.setTitle("Login");
            stage.setScene(new Scene(root));
            stage.show();

            // Fecha a tela atual (login)
            ((Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow()).close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
