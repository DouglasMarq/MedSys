package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionFactory {

    //private static final String url = "jdbc:sqlite:/home/gabriel/Documentos/projetos/MedSys/bd/MedSysdb.db";
    //private static final String url = "jdbc:sqlite:D:\\Development\\MedSys\\bd\\MedSysdb.db";
    //private static final String url = "jdbc:sqlite:D:\\Development\\MedSys\\bd\\MedSysdb.db";
    //private static final String url = "jdbc:sqlite:C:\\Users\\Douglas\\Downloads\\Development\\MedSys\\bd\\MedSysdb.db";
    //private static final String url = "jdbc:sqlite:C:\\git\\MedSys\\bd\\MedSysdb.db"; //Caminho do lucão;
    private static final String url = "jdbc:sqlite:D:/home/linux/NetbeansProjects/MedSys/bd/MedSysdb.db"; //caminho do drudi
    
/**
 * Retorna uma conexão com o banco de dados com a url de conexão e o driver especifico do banco utilizado
 * @return 
 */
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
/**
 * Fecha a conexão com o banco de dados, a conexão a ser fechada deve ser passada como parametro.
 * @param con 
 */
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
/**
 * Fecha a conexão com o banco de dados, a conexão e o PreparedStatement a serem fechados devem ser passados como parametro.
 * @param con
 * @param pst 
 */
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
/**
 * Fecha a conexão com o banco de dados, a conexão, PreparedStatement e o ResultSet a serem fechados devem ser passados como parametro.
 * @param con
 * @param pst
 * @param rs 
 */
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
