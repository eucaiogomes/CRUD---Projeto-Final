package empresa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

	public static Connection conectar(){
		
		String url = "jdbc:mysql://localhost:3306/banco_escola";
		String user = "root";
		String senha = "root";
		Connection conn = null;
		try {
			System.out.println("Conexao bem-sucedida!");
			conn =  DriverManager.getConnection(url,user,senha);

		}catch(SQLException erro) {
			System.out.println("Erro ao conectar"+erro.getMessage());
		}
		return conn;
		
		
		
		
	}
	
	
	
	
	
	
}
