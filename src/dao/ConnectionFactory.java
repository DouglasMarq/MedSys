package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionFactory {

    //private static final String url = "jdbc:sqlite:/home/gabriel/Documentos/projetos/MedSys/bd/MedSysdb.db";
    private static final String url = "jdbc:sqlite:D:\\Development\\MedSys\\bd\\MedSysdb.db";
    //private static final String url = "jdbc:sqlite:C:\\Users\\Douglas\\Downloads\\Development\\MedSys\\bd\\MedSysdb.db";
    //private static final String url = "jdbc:sqlite:C:\\git\\MedSys2\\bd\\MedSysdb.db"; //Caminho do lucão;
    

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
}
