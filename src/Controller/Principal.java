package Controller;

import View.Login;
import dao.login;

public class Principal {
    public static void main(String[] args){
        
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
