package dao;

import Model.Endereco;
import Model.EstadoCivil;
import Model.Paciente;
import Model.Sexo;
import dao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PacienteDao implements dao<Paciente> {
/**
 * Executa a instrução sql insert na tabela de Pacientes, requer um objeto do tipo Paciente com as informaçoes para serem inseridas na instrução.
 * @param obj
 * @return 
 */
	@Override
	public int create(Paciente obj) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pst = null;
		final String sql = "insert into d1_Pacientes (nm_Paciente, sn_Paciente, ds_Convenio, ds_cpf, dt_Nascimento,"
			+ "ds_Telefone, ds_estadocivil, ds_sexo, ds_email, ds_RG, ds_Celular, ds_Logradouro, ds_numerores, ds_Complemento,"
			+ " ds_Bairro, ds_Cidade, ds_Cep)  values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		try {
			pst = con.prepareStatement(sql);

			pst.setString(1, obj.getNome());
			pst.setString(2, obj.getSobrenome());
			pst.setString(3, obj.getConvenio());
			pst.setString(4, obj.getCpf());
			pst.setString(5, obj.getDataNascimento());
			pst.setString(6, obj.getTelefone());
			pst.setString(7, obj.getEstadocivil().toString());
			pst.setString(8, obj.getSexo().toString());
			pst.setString(9, obj.getEmail());
			pst.setString(10, obj.getRg());
			pst.setString(11, obj.getCelular());
			pst.setString(12, obj.getEndereco().getLogradouro());
			pst.setString(13, obj.getEndereco().getNumero());
			pst.setString(14, obj.getEndereco().getComplemento());
			pst.setString(15, obj.getEndereco().getBairro());
			pst.setString(16, obj.getEndereco().getCidade());
			pst.setInt(17, obj.getEndereco().getCep());

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
/**
 * Executa a instrução sql select no banco de dados, retorna uma ArrayList com todos os objetos do tipo Paciente e com todos os campos registrados na tabela.
 * @return 
 */
	@Override
	public List<Paciente> read() {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;
		final String sql = "select * from d1_Pacientes";

		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			List pacientes = new ArrayList();

			while (rs.next()) {
				Long id = rs.getLong("cd_paciente");
				String nome = rs.getString("nm_paciente");
				String sobrenome = rs.getString("sn_Paciente");
				String cpf = rs.getString("ds_cpf");
				String dataNascimento = rs.getString("dt_nascimento");
				String rg = rs.getString("ds_rg");
				String telefone = rs.getString("ds_Telefone");
				String celular = rs.getString("ds_Celular");
				String email = rs.getString("ds_Email");
				String convenio = rs.getString("ds_Convenio");
				String lougradouro = rs.getString("ds_Logradouro");
				String numeroEndereco = rs.getString("ds_numerores");
				String complemento = rs.getString("ds_Complemento");
				String bairro = rs.getString("ds_Bairro");
				String cidade = rs.getString("ds_Cidade");
				int cep = rs.getInt("ds_Cep");
				String sexo = rs.getString("ds_sexo");
				String estadoCivil = rs.getString("ds_estadocivil");

				Endereco endereco = new Endereco(lougradouro, numeroEndereco, complemento, bairro, cidade, cep);
				Paciente paciente = new Paciente(convenio, id, nome, sobrenome, rg, cpf, dataNascimento, endereco, celular, telefone, email, EstadoCivil.valueOf(estadoCivil), Sexo.valueOf(sexo));
				pacientes.add(paciente);
			}

			return pacientes;

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.getStackTrace());
			String message = "Erro no Banco de Dados";
			String erro = "Erro!!";

			JOptionPane.showMessageDialog(null, message, erro, JOptionPane.ERROR_MESSAGE);
			throw new RuntimeException();
		} finally {
			ConnectionFactory.closeConnection(con, pst, rs);

		}

	}
/**
 * Executa a instrução update sql no banco de dados, necessita a passagem como parametro do codigo do Paciente e do objeto Paciente a ser atualizado no banco
 * @param idFind
 * @param pacienteUpdate
 * @return 
 */
	@Override
	public int update(long idFind, Paciente pacienteUpdate) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pst = null;
		final String sql = "update d1_Pacientes"
			+ " set nm_Paciente = ?,"
			+ "sn_Paciente = ?,"
			+ "ds_Convenio = ?,"
			+ "ds_cpf = ?,"
			+ "dt_Nascimento = ?,"
			+ "ds_Telefone = ?,"
			+ "ds_estadocivil = ?,"
			+ "ds_sexo = ?,"
			+ "ds_email = ?,"
			+ "ds_RG = ?,"
			+ "ds_Celular = ?,"
			+ "ds_Logradouro = ?,"
			+ "ds_numerores = ?,"
			+ "ds_Complemento = ?,"
			+ "ds_Bairro = ?,"
			+ "ds_Cidade = ?,"
			+ "ds_Cep = ?"
			+ " where cd_Paciente = ?";

		try {
			pst = con.prepareStatement(sql);

			pst.setString(1, pacienteUpdate.getNome());
			pst.setString(2, pacienteUpdate.getSobrenome());
			pst.setString(3, pacienteUpdate.getConvenio());
			pst.setString(4, pacienteUpdate.getCpf());
			pst.setString(5, pacienteUpdate.getDataNascimento());
			pst.setString(6, pacienteUpdate.getTelefone());
			pst.setString(7, pacienteUpdate.getEstadocivil().toString());
			pst.setString(8, pacienteUpdate.getSexo().toString());
			pst.setString(9, pacienteUpdate.getEmail());
			pst.setString(10, pacienteUpdate.getRg());
			pst.setString(11, pacienteUpdate.getCelular());
			pst.setString(12, pacienteUpdate.getEndereco().getLogradouro());
			pst.setString(13, pacienteUpdate.getEndereco().getNumero());
			pst.setString(14, pacienteUpdate.getEndereco().getComplemento());
			pst.setString(15, pacienteUpdate.getEndereco().getBairro());
			pst.setString(16, pacienteUpdate.getEndereco().getCidade());
			pst.setInt(17, pacienteUpdate.getEndereco().getCep());
			pst.setLong(18, idFind);

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
 * Executa a instrução delete sql no banco de dados, necessita a passagem do id do Paciente a ser deletado do banco de dados.
 * @param idFind
 * @return 
 */
	@Override
	public int delete(long idFind) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pst = null;
		final String sql = "delete from d1_Pacientes where cd_Paciente LIKE (?)";

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

	/**
         * Executa a instrução select sql no banco de dados, retorna apenas um objeto do tipo Paciente com todos os dados da consulta, necessita do campo CPF do paciente para realizar a consulta.
         * @param cpfFind
         * @return 
         */
	public Paciente findOne(String cpfFind) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;
		final String sql = "select * from d1_Pacientes where ds_cpf LIKE(?)";

		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, cpfFind);

			rs = pst.executeQuery();

			Long id = rs.getLong("cd_paciente");
			String nome = rs.getString("nm_paciente");
			String sobrenome = rs.getString("sn_Paciente");
			String cpf = rs.getString("ds_cpf");
			String dataNascimento = rs.getString("dt_nascimento");
			String rg = rs.getString("ds_rg");
			String telefone = rs.getString("ds_Telefone");
			String celular = rs.getString("ds_Celular");
			String email = rs.getString("ds_Email");
			String convenio = rs.getString("ds_Convenio");
			String lougradouro = rs.getString("ds_Logradouro");
			String numeroEndereco = rs.getString("ds_numerores");
			String complemento = rs.getString("ds_Complemento");
			String bairro = rs.getString("ds_Bairro");
			String cidade = rs.getString("ds_Cidade");
			int cep = rs.getInt("ds_Cep");
			String sexo = rs.getString("ds_sexo");
			String estadoCivil = rs.getString("ds_estadocivil");

			Endereco endereco = new Endereco(lougradouro, numeroEndereco, complemento, bairro, cidade, cep);
			Paciente paciente = new Paciente(convenio, id, nome, sobrenome, rg, cpf, dataNascimento, endereco, celular, telefone, email, EstadoCivil.valueOf(estadoCivil), Sexo.valueOf(sexo));

			return paciente;

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());

			String message = "Erro no Banco de Dados";
			String erro = "Erro!!";
			JOptionPane.showMessageDialog(null, message, erro, JOptionPane.ERROR_MESSAGE);

			throw new RuntimeException();
		} finally {
			ConnectionFactory.closeConnection(con,pst,rs);
		}

	}

}
