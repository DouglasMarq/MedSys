package dao;

import Model.Endereco;
import Model.EstadoCivil;
import Model.Medico;
import Model.Sexo;
import dao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MedicoDao implements dao<Medico> {
/**
 * Executa a instrução sql insert na tabela de Medicos, requer um objeto do tipo Medico com as informaçoes para serem inseridas na instrução.
 * @param obj
 * @return 
 */
	@Override
	public int create(Medico obj) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pst = null;
		final String sql = "insert into d0_Funcionarios (ds_user, ds_pass, nm_Funcionario, sn_Funcionario, cd_cargo, "
			+ "ds_crm, ds_cpf, dt_Nascimento, ds_Telefone,ds_estadocivil, ds_sexo, ds_email, ds_RG, ds_Celular, "
			+ "ds_Logradouro, ds_numerores, ds_Complemento, ds_Bairro, ds_Cidade, ds_cep)"
			+ " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			pst = con.prepareStatement(sql);

			pst.setString(1, obj.getLogin());
			pst.setString(2, obj.getSenha());
			pst.setString(3, obj.getNome());
			pst.setString(4, obj.getSobrenome());
			pst.setInt(5, obj.getCargo());
			pst.setString(6, obj.getCrm());
			pst.setString(7, obj.getCpf());
			pst.setString(8, obj.getDataNascimento());
			pst.setString(9, obj.getTelefone());
			pst.setString(10, obj.getEstadocivil().toString());
			pst.setString(11, obj.getSexo().toString());
			pst.setString(12, obj.getEmail());
			pst.setString(13, obj.getRg());
			pst.setString(14, obj.getCelular());
			pst.setString(15, obj.getEndereco().getLogradouro());
			pst.setString(16, obj.getEndereco().getNumero());
			pst.setString(17, obj.getEndereco().getComplemento());
			pst.setString(18, obj.getEndereco().getBairro());
			pst.setString(19, obj.getEndereco().getCidade());
			pst.setInt(20, obj.getEndereco().getCep());

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
 * Executa a instrução sql select no banco de dados, retorna uma ArrayList com todos os objetos do tipo Medico e com todos os campos registrados na tabela.
 * @return 
 */
	@Override
	public List<Medico> read() {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;
		final String sql = "select * from d0_Funcionarios where cd_cargo = 10";

		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();

			List medicos = new ArrayList();

			while (rs.next()) {
				long id = rs.getLong("cd_funcionario");
				String login = rs.getString("ds_user");
				String senha = rs.getString("ds_pass");
				String nome = rs.getString("nm_Funcionario");
				String sobrenome = rs.getString("sn_Funcionario");
				int cargo = rs.getInt("cd_cargo");
				String crm = rs.getString("ds_crm");
				String cpf = rs.getString("ds_cpf");
				String dataNascimento = rs.getString("dt_nascimento");
				String rg = rs.getString("ds_rg");
				String telefone = rs.getString("ds_Telefone");
				String celular = rs.getString("ds_Celular");
				String email = rs.getString("ds_Email");
				String lougradouro = rs.getString("ds_Logradouro");
				String numeroEndereco = rs.getString("ds_numerores");
				String complemento = rs.getString("ds_Complemento");
				String bairro = rs.getString("ds_Bairro");
				String cidade = rs.getString("ds_Cidade");
				int cep = rs.getInt("ds_Cep");
				String sexo = rs.getString("ds_sexo");
				String estadoCivil = rs.getString("ds_estadocivil");

				Endereco endereco = new Endereco(lougradouro, numeroEndereco, complemento, bairro, cidade, cep);
				Medico medico = new Medico(crm, login, senha, cargo, id, nome, sobrenome, rg, cpf, dataNascimento, endereco, celular, telefone, email, EstadoCivil.valueOf(estadoCivil), Sexo.valueOf(sexo));
				medicos.add(medico);
			}

			return medicos;

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
 * Executa a instrução update sql no banco de dados, necessita a passagem como parametro do codigo do Medico e do objeto Medico a ser atualizado no banco.
 * @param idFind
 * @param obj
 * @return 
 */
	@Override
	public int update(long idFind, Medico obj) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pst = null;
		final String sql = "update d0_Funcionarios"
			+ " set ds_user = ?,"
			+ " ds_pass = ?,"
			+ " nm_Funcionario = ?,"
			+ " sn_Funcionario = ?,"
			+ " cd_cargo = ?,"
			+ " ds_crm = ?,"
			+ " ds_cpf = ?,"
			+ " dt_Nascimento = ?,"
			+ " ds_Telefone = ?,"
			+ "ds_estadocivil = ?,"
			+ " ds_sexo = ?,"
			+ " ds_email = ?,"
			+ " ds_RG = ?,"
			+ " ds_Celular = ?,"
			+ " ds_Logradouro = ?,"
			+ " ds_numerores = ?,"
			+ " ds_Complemento = ?,"
			+ " ds_Bairro = ?,"
			+ " ds_Cidade = ?,"
			+ " ds_cep = ?"
			+ " where cd_Funcionario = ?";

		try {
			pst = con.prepareStatement(sql);

			pst.setString(1, obj.getLogin());
			pst.setString(2, obj.getSenha());
			pst.setString(3, obj.getNome());
			pst.setString(4, obj.getSobrenome());
			pst.setInt(5, obj.getCargo());
			pst.setString(6, obj.getCrm());
			pst.setString(7, obj.getCpf());
			pst.setString(8, obj.getDataNascimento());
			pst.setString(9, obj.getTelefone());
			pst.setString(10, obj.getEstadocivil().toString());
			pst.setString(11, obj.getSexo().toString());
			pst.setString(12, obj.getEmail());
			pst.setString(13, obj.getRg());
			pst.setString(14, obj.getCelular());
			pst.setString(15, obj.getEndereco().getLogradouro());
			pst.setString(16, obj.getEndereco().getNumero());
			pst.setString(17, obj.getEndereco().getComplemento());
			pst.setString(18, obj.getEndereco().getBairro());
			pst.setString(19, obj.getEndereco().getCidade());
			pst.setInt(20, obj.getEndereco().getCep());
			pst.setLong(21, idFind);

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
 * Executa a instrução delete sql no banco de dados, necessita a passagem do id do Medico a ser deletado do banco de dados.
 * @param idFind
 * @return 
 */
	@Override
	public int delete(long idFind) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pst = null;
		final String sql = "delete from d0_Funcionarios where cd_Funcionario LIKE (?)";

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
