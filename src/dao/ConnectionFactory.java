package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String url = "jdbc:sqlite:D:\\Development\\MedSys\\bd\\MedSysdb.db";
    
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
}
