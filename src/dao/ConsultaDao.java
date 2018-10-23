package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultaDao {
    
    private String cdConsulta;
    private String Status;
    private String queixapaciente;
    private String examefisico;
    private String conduta;
    private String sid;
    private String Paciente;
    private String Medico;
    
    public void ListaConsulta(){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement("SELECT * FROM d4_Cargos");
            rs = stmt.executeQuery();
            while (rs.next()){
                
            }
        } catch (SQLException ex){
            throw new RuntimeException("Erro ao pegar dados das consultas");
        } finally {
            ConnectionFactory.closeConnection(con);
            rs = null;
            stmt = null;
        }
        
}
    
}
