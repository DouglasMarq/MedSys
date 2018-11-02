package dao;

import Model.Consulta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ConsultaDao implements dao<Consulta> {
    
    @Override
	public int create(Consulta obj) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pst = null;
		final String sql = "insert into d3_Consultas (ds_status,dt_consulta,ds_queixapaciente,nm_Paciente,sn_Paciente,nm_Medico,sn_Medico) values (?,?,?,?,?,?,?)";

		try {
			pst = con.prepareStatement(sql);

			pst.setString(1, obj.getStatus());
			pst.setString(2, obj.getDataConsulta());
			pst.setString(3, obj.getQueixaPaciente());
			pst.setString(4, obj.getPacienteNome());
			pst.setString(5, obj.getPacienteSobrenome());
			pst.setString(6, obj.getMedicoNome());
			pst.setString(7, obj.getMedicoSobrenome());

			return pst.executeUpdate();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.getStackTrace());

			String message = "Erro no Banco de Dados";
			String erro = "Erro!!";

			JOptionPane.showMessageDialog(null, message, erro, JOptionPane.ERROR_MESSAGE);

			throw new RuntimeException();
		} finally {
			ConnectionFactory.closeConnection(con, pst);
		}

	}
    
    public List<Consulta> read(){
        Connection con = ConnectionFactory.getConnection();
	PreparedStatement pst = null;
	ResultSet rs = null;
        try {
            pst = con.prepareStatement("Select cd_Consulta,ds_status,dt_consulta,nm_Paciente,sn_Paciente,nm_Medico,sn_Medico from d3_Consultas");
            rs = pst.executeQuery();
            List Consultas = new ArrayList();
               while (rs.next()) {
                    String Consulta = rs.getString("cd_Consulta");
                    String Status = rs.getString("ds_status");
                    String DataConsulta = rs.getString("dt_consulta");
                    String PacienteNome = rs.getString("nm_Paciente");
                    String PacienteSobrenome = rs.getString("sn_Paciente");
                    String MedicoNome = rs.getString("nm_Medico");
                    String MedicoSobrenome = rs.getString("sn_Medico");
                    Consulta consulta = new Consulta(Consulta, Status, DataConsulta, PacienteNome, PacienteSobrenome, MedicoNome, MedicoSobrenome);
                    Consultas.add(consulta);
                    //Consulta.addRow(new Object[]{a,b,c,d,d2,e,e2});
                }
		return Consultas;
	} catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(con,pst,rs);
        }
        return null;
    }

    @Override
	public int update(long idFind, Consulta ConsultaUpdate) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pst = null;
		final String sql = "update d0_Consultas"
			+ " set ds_status = ?,"
			+ "ds_queixapaciente = ?,"
			+ "ds_exameFisico = ?,"
			+ "ds_conduta = ?,"
			+ "ds_sid = ?,"
			+ "nm_Medico = ?,"
			+ "sn_Medico = ?,"
			+ " where cd_Paciente = ?";

		try {
			pst = con.prepareStatement(sql);

			pst.setString(1, ConsultaUpdate.getStatus());
			pst.setString(2, ConsultaUpdate.getQueixaPaciente());
			pst.setString(3, ConsultaUpdate.getExameFisico());
			pst.setString(4, ConsultaUpdate.getConduta());
			pst.setString(5, ConsultaUpdate.getSid());
			pst.setString(6, ConsultaUpdate.getMedicoNome());
			pst.setString(7, ConsultaUpdate.getMedicoSobrenome());
			pst.setLong(8, idFind);

			return pst.executeUpdate();
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			String message = "Erro no Banco de Dados";
			String erro = "Erro!!";

			JOptionPane.showMessageDialog(null, message, erro, JOptionPane.ERROR_MESSAGE);
			throw new RuntimeException();
		} finally {
			ConnectionFactory.closeConnection(con, pst);
		}

	}

    @Override
	public int delete(long idFind, String cpfFind, String nomeFind) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pst = null;
		final String sql = "delete from d3_Consultas where cd_Paciente LIKE (?) and nm_Paciente LIKE(?) and sn_Paciente LIKE(?)";

		try {
			pst = con.prepareStatement(sql);
			pst.setLong(1, idFind);
			pst.setString(2, nomeFind);
			pst.setString(3, cpfFind);

			return pst.executeUpdate();
			
		} catch (SQLException ex) {
			ex.getMessage();

			String message = "Erro no Banco de Dados";
			String erro = "Erro!!";

			JOptionPane.showMessageDialog(null, message, erro, JOptionPane.ERROR_MESSAGE);

			throw new RuntimeException();
		} finally {
			ConnectionFactory.closeConnection(con, pst);
		}
	}

    @Override
    public Consulta findOne(long idFind, String cpfFind, String nomeFind) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 }
    
