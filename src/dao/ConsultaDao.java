package dao;

import Model.Consulta;
import dao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ConsultaDao implements dao<Consulta> {
    /**
     * Executa a instrução sql insert na tabela de consultas, requer um objeto do tipo Consulta com as informaçoes para serem inseridas na instrução.
     * @param obj
     * @return 
     */
    @Override
	public int create(Consulta obj) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pst = null;
		final String sql = "insert into d3_Consultas (ds_status,dt_consulta,ds_laudomedico,nm_Paciente,nm_Funcionario) values (?,?,?,?,?)"; 

		try {
			pst = con.prepareStatement(sql);

			pst.setString(1, "Aberto");
			pst.setString(2, obj.getDataConsulta());
			pst.setString(3, obj.getLaudoMedico());
			pst.setString(4, obj.getPacienteNome());
                        pst.setString(5, obj.getMedicoNome());
                      
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
    /**
     * Executa a instrução sql select no banco de dados, retorna uma ArrayList com todos os objetos do tipo Consulta e com todos os campos registrados na tabela.
     * @return 
     */
    public List<Consulta> read(){
        Connection con = ConnectionFactory.getConnection();
	PreparedStatement pst = null;
	ResultSet rs = null;
        try {
            pst = con.prepareStatement("Select cd_Consulta,ds_status,dt_consulta,ds_laudomedico,nm_Paciente,nm_Funcionario from d3_Consultas");
            rs = pst.executeQuery();
            List Consultas = new ArrayList();
               while (rs.next()) {
                    String codigoConsulta = rs.getString("cd_Consulta");
                    String status = rs.getString("ds_status");
                    String dataConsulta = rs.getString("dt_consulta");
                    String laudoMedico = rs.getString("ds_laudomedico");
                    String pacienteNome = rs.getString("nm_Paciente");
                    String medicoNome = rs.getString("nm_Funcionario");
                    Consulta consulta = new Consulta(codigoConsulta, status, dataConsulta, laudoMedico, pacienteNome, medicoNome);
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
/**
 * Executa a instrução update sql no banco de dados, necessita a passagem como parametro do codigo da consulta e do objeto consulta a ser atualizado no banco.
 * @param idFind
 * @param ConsultaUpdate
 * @return 
 */
    @Override
	public int update(long idFind, Consulta ConsultaUpdate) {
        
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pst = null;
		final String sql = "update d3_Consultas set ds_status = 'Baixada', ds_laudomedico = ? where cd_Consulta = ?";
                
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, ConsultaUpdate.getLaudoMedico());
			pst.setLong(2, idFind);
                        
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
/**
 * Executa a instrução delete sql no banco de dados, necessita a passagem do id da consulta a ser deletado do banco de dados.
 * @param idFind
 * @return 
 */
    @Override
	public int delete(long idFind) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pst = null;
		final String sql = "delete from d3_Consultas where cd_Consulta LIKE (?)";

		try {
			pst = con.prepareStatement(sql);
			pst.setLong(1, idFind);

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

 }
    
