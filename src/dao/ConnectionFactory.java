/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author lucas
 */
public class ConnectionFactory {
    private static final String url = "jdbc:sqlite:D:\\Development\\MedSys\\bd\\MedSysdb.db";
    
    public static Connection getConnection(){
        try {
            System.out.println("Conexão sucedida");
            return DriverManager.getConnection(url);
        } catch (SQLException ex) {
            throw new RuntimeException("Erro de conexão");
        }
    }
    
   public static void closeConnection(Connection con){
        try {
           if(con != null) con.close();
        } catch (SQLException ex) {
           throw new RuntimeException("Erro de conexão");
        }
   } 
}
