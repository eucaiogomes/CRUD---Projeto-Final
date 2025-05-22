package Controller;

import DAO.ProfessorDAO;
import DTO.Professor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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
    }

}
