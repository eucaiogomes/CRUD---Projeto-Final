package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Controller.CadastroController;
import DTO.Professor;
import empresa.ConexaoBD;
public class ProfessorDAO {
	
	public static void cadastrarProfessor(String nome, String email, String senha) {
		Professor p = new Professor();
		p.cadastrar(nome, email, senha);
		
		String sql = "INSERT INTO professor(nm_professor, email_professor, senha_professor)VALUES(?,?,?)";
		
		try(Connection conn = ConexaoBD.conectar();
				PreparedStatement ps = conn.prepareStatement(sql)){
					ps.setString(1,p.getNome());
					ps.setString(2,p.getEmail());
					ps.setString(3, p.getSenha());
					
					ps.execute();
					JOptionPane.showMessageDialog(null,"Professor cadastrado com sucesso!");
				}catch (SQLException erro) {
					JOptionPane.showMessageDialog(null,"Erro ao cadastrar Professor"+erro.getMessage());
				}		
			}
	
	
	
	
	

}
