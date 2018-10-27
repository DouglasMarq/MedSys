package Controller;

import View.Login;
import dao.login;


public class Principal {
	
    public static void main(String[] args){
        
        
        Login lg = new Login();
        lg.setVisible(true);
        
    }
    
    
    
    public static boolean validarlogin(String username, String password){
        login l = new login(username, password);
        l.validar_login(username, password);
        if(l.validar_login(username,password)){
            return true;
        } else {
            return false;
        }
    }
    
    /*public static boolean registrarMedico(String nome,String sobrenome,String CRM,String CPF,String Nascimento,String Telefone,String estadocivil,String Sexo, String Email, String Celular, String RG){
        registrar r = new registrar(nome, sobrenome, CRM, CPF, Nascimento, Telefone, estadocivil, Sexo, Email, Celular, RG);
        r.registrar_medico(nome, sobrenome, CRM, CPF, Nascimento, Telefone, estadocivil, Sexo, Email, Celular, RG);
        return true;
    }
    
    public boolean registrarPaciente(String nome,String sobrenome,String CPF,String Nascimento,String Telefone,String estadocivil,String Sexo, String Email, String Celular, String RG){
        registrar r = new registrar(nome, sobrenome, CPF, Nascimento, Telefone, estadocivil, Sexo, Email, Celular, RG);
        r.registrar_paciente(nome, sobrenome, CPF, Nascimento, Telefone, estadocivil, Sexo, Email, Celular, RG);
        return true;
    }*/
}