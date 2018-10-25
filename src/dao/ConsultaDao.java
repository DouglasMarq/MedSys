package dao;

import Model.Consulta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConsultaDao implements dao<Consulta> {
    
    public List<Consulta> read(){
        Connection con = ConnectionFactory.getConnection();
	PreparedStatement pst = null;
	ResultSet rs = null;
        
        try {
            pst = con.prepareStatement("Select cd_Consulta,ds_status,dt_consulta,nm_Paciente,sn_Paciente,nm_Medico,sn_Medico from d3_Consultas");
            rs = pst.executeQuery();
            List Consulta = new ArrayList();
               while (rs.next()) {
                    String a = rs.getString("cd_Consulta");
                    String b = rs.getString("ds_status");
                    String c = rs.getString("dt_consulta");
                    String d = rs.getString("nm_Paciente");
                    String d2 = rs.getString("sn_Paciente");
                    String e = rs.getString("nm_Medico");
                    String e2 = rs.getString("sn_Medico");
                    //Consulta.addRow(new Object[]{a,b,c,d,d2,e,e2});
                }
		return Consulta;
	} catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(con);
        }
        return null;
    }

    @Override
    public int create(Consulta obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(long id, Consulta obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(long idDel, String cpfDel, String nomeDel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Consulta findOne(long idFind, String cpfFind, String nomeFind) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 }
    
