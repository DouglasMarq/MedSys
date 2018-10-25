package dao;

import Model.Endereco;
import Model.EstadoCivil;
import Model.Medico;
import Model.Sexo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MedicoDao implements dao<Medico> {

	@Override
	public void create(Medico obj) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pst;

		try {
			pst = con.prepareStatement("insert into d0_Funcionarios (ds_user, ds_pass, nm_Funcionario, sn_Funcionario, cd_cargo, "
				+ "ds_crm, ds_cpf, dt_Nascimento, ds_Telefone,ds_estadocivil, ds_sexo, ds_email, ds_RG, ds_Celular, "
				+ "ds_Logradouro, ds_numerores, ds_Complemento, ds_Bairro, ds_Cidade, ds_cep)"
				+ " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

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

			pst.executeUpdate();

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			throw new RuntimeException("Erro no cadastro do Medico");
		} finally {
			ConnectionFactory.closeConnection(con);
		}
	}

	@Override
	public List<Medico> read() {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;

		try {
			pst = con.prepareStatement("select * from d0_Funcionarios where cd_cargo = 10");
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
			throw new RuntimeException("Erro na Leitura da Tabela Paciente");
		} finally {
			ConnectionFactory.closeConnection(con);
		}
	}

	@Override
	public void update(long idFind, Medico obj) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pst;

		try {
			pst = con.prepareStatement("update d0_Funcionarios"
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
				+ " where cd_Funcionario = ?");

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

			pst.executeUpdate();
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			throw new RuntimeException("Erro na atualização de Cadastro do Paciente");
		} finally {
			ConnectionFactory.closeConnection(con);
		}

	}

	@Override
	public void delete(long idFind, String cpfFind, String nomeFind) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pst;

		try {
			pst = con.prepareStatement("delete from d0_Funcionarios where cd_Funcionario LIKE (?) and nm_Funcionario LIKE(?) and ds_cpf LIKE(?) and cd_Cargo LIKE(10)");
			pst.setLong(1, idFind);
			pst.setString(2, nomeFind);
			pst.setString(3, cpfFind);

			pst.executeUpdate();
		} catch (SQLException ex) {
			ex.getMessage();
		} finally {
			ConnectionFactory.closeConnection(con);
		}
	}

	@Override
	public Medico findOne(long idFind, String cpfFind, String nomeFind) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;

		try {
			pst = con.prepareStatement("select * from d0_Funcionarios where cd_Funcionario LIKE (?) and nm_Funcionario LIKE(?) and ds_cpf LIKE(?) and cd_cargo LIKE (10)");
			rs = pst.executeQuery();


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

			return medico;

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.getStackTrace());
			throw new RuntimeException("Erro na Leitura da Tabela Paciente");
		} finally {
			ConnectionFactory.closeConnection(con);
		}
	}

}
