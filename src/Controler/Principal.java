/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import View.Login;
import dao.ConnectionFactory;
import java.sql.Connection;

/**
 *
 * @author lucas
 */
public class Principal {
    public static void main(String[] args){
        //Connection con = ConnectionFactory.getConnection();
        
        Login lg = new Login();
        lg.setVisible(true);
        
    }
    
}
