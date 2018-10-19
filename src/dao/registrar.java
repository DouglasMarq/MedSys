
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class registrar {
    
    private String nome;
    private String sobrenome;
    private String CRM;
    private String CPF;
    private String Nascimento;
    private String Telefone;
    private String estadocivil;
    private String Sexo;
    private String Email;
    private String Celular;
    private String RG;
    
    public boolean registrar_medico(String nome,String sobrenome,String CRM,String CPF,String Nascimento,String Telefone,String estadocivil,String Sexo, String Email, String Celular, String RG){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("INSERT INTO d0_Funcionarios (nm_Funcionario,sn_Funcionario,cd_crm,ds_cpf,dt_Nascimento,ds_Telefone,ds_estadocivil,ds_sexo,ds_email,ds_Celular,ds_RG) VALUES ('"+ nome +"','"+ sobrenome +"','"+ CRM +"','"+ CPF +"','"+ Nascimento +"','"+ Telefone +"','"+ estadocivil +"','"+ Sexo +"','"+ Email +"','"+ Celular +"','"+ RG +"')");
            stmt.executeUpdate();
        } catch (SQLException ex){
            throw new RuntimeException("Erro ao registrar");
        } finally {
            stmt = null;
            ConnectionFactory.closeConnection(con);
            return false;
        }
    }
    
    public boolean registrar_paciente(String nome,String sobrenome,String CPF,String Nascimento,String Telefone,String estadocivil,String Sexo, String Email, String Celular, String RG){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("INSERT INTO d1_Pacientes (nm_Paciente,sn_Paciente,ds_cpf,dt_Nascimento,ds_Telefone,ds_estadocivil,ds_sexo,ds_email,ds_Celular,ds_RG) VALUES ('"+ nome +"','"+ sobrenome +"','"+ CPF +"','"+ Nascimento +"','"+ Telefone +"','"+ estadocivil +"','"+ Sexo +"','"+ Email +"','"+ Celular +"','"+ RG +"')");
            stmt.executeUpdate();
        } catch (SQLException ex){
            throw new RuntimeException("Erro ao registrar");
        } finally {
            stmt = null;
            ConnectionFactory.closeConnection(con);
            return false;
        }
    }

    public registrar(String nome,String sobrenome,String CRM,String CPF,String Nascimento,String Telefone,String estadocivil,String Sexo, String Email, String Celular, String RG) {
        setNome(nome);
        setSobrenome(sobrenome);
        setCRM(CRM);
        setCPF(CPF);
        setNascimento(Nascimento);
        setTelefone(Telefone);
        setEstadocivil(estadocivil);
        setSexo(Sexo);
        setCelular(Celular);
        setEmail(Email);
        setRG(RG);
    }
    
    public registrar(String nome,String sobrenome,String CPF,String Nascimento,String Telefone,String estadocivil,String Sexo, String Email, String Celular, String RG) {
        setNome(nome);
        setSobrenome(sobrenome);
        setCPF(CPF);
        setNascimento(Nascimento);
        setTelefone(Telefone);
        setEstadocivil(estadocivil);
        setSexo(Sexo);
        setCelular(Celular);
        setEmail(Email);
        setRG(RG);
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the CRM
     */
    public String getCRM() {
        return CRM;
    }

    /**
     * @param CRM the CRM to set
     */
    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the Nascimento
     */
    public String getNascimento() {
        return Nascimento;
    }

    /**
     * @param Nascimento the Nascimento to set
     */
    public void setNascimento(String Nascimento) {
        this.Nascimento = Nascimento;
    }

    /**
     * @return the Telefone
     */
    public String getTelefone() {
        return Telefone;
    }

    /**
     * @param Telefone the Telefone to set
     */
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    /**
     * @return the estadocivil
     */
    public String getEstadocivil() {
        return estadocivil;
    }

    /**
     * @param estadocivil the estadocivil to set
     */
    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param sobrenome the sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * @return the Sexo
     */
    public String getSexo() {
        return Sexo;
    }

    /**
     * @param Sexo the Sexo to set
     */
    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the Celular
     */
    public String getCelular() {
        return Celular;
    }

    /**
     * @param Celular the Celular to set
     */
    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    /**
     * @return the RG
     */
    public String getRG() {
        return RG;
    }

    /**
     * @param RG the RG to set
     */
    public void setRG(String RG) {
        this.RG = RG;
    }
}
