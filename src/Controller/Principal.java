package Controller;

import View.Login;
import dao.login;
import dao.registrar;

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
    public boolean registrarMedico(String nome,String sobrenome,String CRM,String CPF,String Nascimento,String Telefone,String estadocivil,String Sexo){
        registrar r = new registrar(nome, sobrenome, CRM, CPF, Nascimento, Telefone, estadocivil, Sexo);
        r.registrar_usuario(nome, sobrenome, CRM, CPF, Nascimento, Telefone, estadocivil, Sexo);
        return true;
    }
}
