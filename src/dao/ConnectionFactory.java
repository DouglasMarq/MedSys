package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionFactory {
<<<<<<< HEAD
    //private static final String url = "jdbc:sqlite:C:\\Users\\gabri\\Documents\\Desenvolvimento\\Projetos\\MedSys\\bd\\MedSysdb.db";
    //private static final String url = "jdbc:sqlite:D:\\Development\\MedSys\\bd\\MedSysdb.db";
    //private static final String url = "jdbc:sqlite:C:\\Users\\Douglas\\Downloads\\Development\\MedSys\\bd\\MedSysdb.db";
    private static final String url = "jdbc:sqlite:C:\\git\\MedSys\\bd\\MedSysdb.db";
    
    
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(url);
        } catch (SQLException ex) {
            throw new RuntimeException("Erro de conexão");
        }
    }
    
   public static void closeConnection(Connection con){
        try {
           if(con != null) con.close();
        } catch (SQLException ex) {
           throw new RuntimeException("Erro de fechamento de conexão");
        }
   } 
=======
	//private static final String url = "jdbc:sqlite:C:\\Users\\gabri\\Documents\\Desenvolvimento\\Projetos\\MedSys\\bd\\MedSysdb.db";

	private static final String url = "jdbc:sqlite:C:\\Users\\gabri\\Documents\\Desenvolvimento\\Projetos\\MedSys\\bd\\MedSysdb.db";
	//private static final String url = "jdbc:sqlite:C:\\Users\\Douglas\\Downloads\\Development\\MedSys\\bd\\MedSysdb.db";

	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(url);
		} catch (SQLException ex) {
			String message = "Erro de conexão";
			String erro = "Erro!!";

			JOptionPane.showMessageDialog(null, message, erro, JOptionPane.ERROR_MESSAGE);
			throw new RuntimeException();
		}
	}

	public static void closeConnection(Connection con) {
		try {
			if (con != null) {
				con.close();
			}
		} catch (SQLException ex) {
			String message = "Erro de fechamento da conexão";
			String erro = "Erro!!";

			JOptionPane.showMessageDialog(null, message, erro, JOptionPane.ERROR_MESSAGE);
			throw new RuntimeException();
		}
	}

	public static void closeConnection(Connection con, PreparedStatement pst) {
		try {
			if (con != null) {
				pst.close();
				closeConnection(con);
			}
			;
		} catch (SQLException ex) {
			String message = "Erro de fechamento da conexão";
			String erro = "Erro!!";

			JOptionPane.showMessageDialog(null, message, erro, JOptionPane.ERROR_MESSAGE);
			throw new RuntimeException();
		}
	}

	public static void closeConnection(Connection con, PreparedStatement pst, ResultSet rs) {
		try {
			if (con != null) {
				closeConnection(con, pst);
				rs.close();
			}

		} catch (SQLException ex) {
			String message = "Erro de fechamento da conexão";
			String erro = "Erro!!";

			JOptionPane.showMessageDialog(null, message, erro, JOptionPane.ERROR_MESSAGE);
			throw new RuntimeException();
		}
	}

>>>>>>> 318d11ae1c85e65e04334273f3e2e4edf8d3c7d3
}
