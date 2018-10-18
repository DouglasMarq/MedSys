package Controller;

import View.Login;
import dao.ConnectionFactory;
import dao.login;
import java.sql.Connection;

public class Principal {
    public static void main(String[] args){
        //Connection con = ConnectionFactory.getConnection();
        
        Login lg = new Login();
        lg.setVisible(true);
        
    }
    public boolean validarlogin(String username, String password){
        login l = new login(username, password);
        l.validar_login(username, password);
        if(l.validar_login(username,password)){
                return true;
            } else {
                return false;
            }
    }
    
}
