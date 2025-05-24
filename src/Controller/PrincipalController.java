package Controller;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import DTO.Turma;
import empresa.ConexaoBD;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class PrincipalController {

    @FXML
    private TableView<Turma> tableTurmas;

    @FXML
    private TableColumn<Turma, Integer> colId;

    @FXML
    private TableColumn<Turma, String> colNome;


    private ObservableList<Turma> listaTurmas = FXCollections.observableArrayList();
    
    
    
    public void initialize() {
    	colId.setCellValueFactory(new PropertyValueFactory<>("idTurma"));
    	colNome.setCellValueFactory(new PropertyValueFactory<>("nmTurma"));



        carregarTurmasDoBanco();
    }

    private void carregarTurmasDoBanco() {
     
        try (Connection conn = ConexaoBD.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT idTurma, nm_turma FROM turma")) {

            while (rs.next()) {
                int id = rs.getInt("idTurma");
                String nome = rs.getString("nm_turma");
               

                Turma turma = new Turma(id, nome);
                listaTurmas.add(turma);
            }

            tableTurmas.setItems(listaTurmas);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
	@FXML
	public void sair (ActionEvent event) {
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
