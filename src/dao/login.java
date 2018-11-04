package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class login {
    
    private String password;
    private String username;
    /**
     * Valida se o usuario e senha estão corretos ou presentes no banco de dados, necessita do usuario e da senha para fazer a validação dos mesmos
     * @param username
     * @param password
     * @return 
     */
    public boolean validar_login(String username,String password){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement("SELECT * FROM d0_Funcionarios WHERE ds_user=? AND ds_pass=?");
            stmt.setString(1, username);
            stmt.setString(2, password);
            rs = stmt.executeQuery();
            if (rs.next()){
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex){
            throw new RuntimeException("Erro no login");
        } finally {
            ConnectionFactory.closeConnection(con);
            rs = null;
            stmt = null;
        }
    }
    
    
/**
 * Seta o usuario e a senha nos campos para realizar o login.
 * @param password
 * @param username 
 */
    public login(String password, String username) {
        setPassword(password);
        setUsername(username);
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

}
