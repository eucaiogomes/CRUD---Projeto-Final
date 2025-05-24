package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DTO.Turma;
import empresa.ConexaoBD;

public class TurmaDAO {
	
	public static void inserirTurma(Integer idProfessor, String nmTurma, String dsTurma) {
		Turma t = new Turma();
		t.cadastrarTurma(idProfessor,nmTurma, dsTurma);
		
		String sql = "INSERT INTO banco_escola.turma(Professor_idProfessor, nm_turma, ds_turma) VALUES (?, ?, ?)";
;
		
		try(Connection conn= ConexaoBD.conectar();
				PreparedStatement ps = conn.prepareStatement(sql)){
			
			ps.setInt(1, t.getIdProfessor());
			ps.setString(2, t.getNmTurma());
			ps.setString(3, t.getDsTurma());

			ps.execute();
			ps.close();	
		}catch(SQLException erro)
		{
			System.out.println("Erro ao cadastrar turma"+erro.getMessage());
		}
	}
	
	

}
