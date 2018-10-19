package dao;

import Model.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PacienteDao implements dao<Paciente> {

	@Override
	public void create(Paciente obj) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pst = null;

		try {
			pst = con.prepareStatement("insert into d1_Paciente (nm_Paciente, sn_Paciente, ds_Convenio, ds_cpf,"
				+ " dt_Nascimento, ds_Telefone, ds_estadocivil, ds_sexo, ds_email, ds_RG, ds_Celular, ds_Logradouro, ds_numerores, "
				+ "ds_Complemento, ds_Bairro, ds_Cidade, ds_Cep) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?");

			pst.setString(1, obj.getNome());
			pst.setString(2, obj.getSobrenome());
			pst.setString(3, obj.getConvenio());
			pst.setString(4, obj.getCpf());
			pst.setString(5, obj.getDataNascimento());
			pst.setString(6, obj.getTelefone());
			pst.setString(7, obj.getEstadoCivil().toString());
			pst.setString(8, obj.getSexo().toString());
			pst.setString(9, obj.getEmail());
			pst.setString(10, obj.getRg());
			pst.setString(11, obj.getCelular());
			pst.setString(12, obj.getEndereco().getLogradouro());
			pst.setString(13, obj.getEndereco().getNumero());
			pst.setString(14, obj.getEndereco().getComplemento());
			pst.setString(15, obj.getEndereco().getBairro());
			pst.setString(16, obj.getEndereco().getCidade());
			pst.setLong(17, obj.getEndereco().getCep());

		} catch (SQLException ex) {
			throw new RuntimeException("Erro no Cadastro do Paciente");
		} finally {
			ConnectionFactory.closeConnection(con);
		}

	}

	@Override
	public List<Paciente> read() {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pst;
		ResultSet rs;

		try {
			pst = con.prepareStatement("select * from d1_Paciente");
			rs = pst.executeQuery();
			List pacientes = new ArrayList();

			while (rs.next()) {
				Long id = rs.getLong("cd_Paciente");
				String nome = rs.getString("nm_Paciente");
				String sobrenome = rs.getString("sn_Paciente");
				String cpf = rs.getString("ds_cpf");
				String dataNascimento = rs.getString("dt_Nascimento");
				String rg = rs.getString("ds_RG");
				String telefone = rs.getString("ds_Telefone");
				String celular = rs.getString("ds_Celular");
				String email = rs.getString("ds_email");
				String convenio = rs.getString("ds_Convenio");
				String lougradouro = rs.getString("ds_Lougradouro");
				String numeroEndereco = rs.getString("ds_numerores");
				String complemento = rs.getString("ds_Complemento");
				String bairro = rs.getString("ds_Bairro");
				String cidade = rs.getString("ds_Cidade");
				int cep = rs.getInt("cd_Cep");
				String sexo = rs.getString("ds_sexo");
				String estadoCivil = rs.getString("ds_estadocivil");

				Endereco endereco = new Endereco(lougradouro, numeroEndereco, complemento, bairro, cidade, cep);
				Paciente paciente = new Model.Paciente(convenio, id, nome, sobrenome, rg, cpf, dataNascimento, endereco, celular,
					telefone, email, Model.EstadoCivil.valueOf(estadoCivil), Model.Sexo.valueOf(sexo));
				pacientes.add(paciente);

			}

			return pacientes;

		} catch (SQLException ex) {
			throw new RuntimeException("Erro na Leitura da Tabela Paciente");
		} finally {
			ConnectionFactory.closeConnection(con);
		}

	}

	@Override
	public void update(Paciente obj) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pst;

		try {
			pst = con.prepareStatement("update d1_Paciente set"
				+ "nm_paciente = ?,"
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
				+ "ds_numerores = ?, "
				+ "ds_Complemento = ?,"
				+ "ds_Bairro = ?,"
				+ "ds_Cidade = ?,"
				+ "ds_Cep = ? "
				+ "where cd_paciente = ?");

			pst.setString(1, obj.getNome());
			pst.setString(2, obj.getSobrenome());
			pst.setString(3, obj.getConvenio());
			pst.setString(4, obj.getCpf());
			pst.setString(5, obj.getDataNascimento());
			pst.setString(6, obj.getTelefone());
			pst.setString(7, obj.getEstadoCivil().toString());
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
			pst.setLong(18, obj.getId());

		} catch (SQLException ex) {
			throw new RuntimeException("Erro na atualização dos dados do paciente");
		} finally {
			ConnectionFactory.closeConnection(con);
		}

	}

	@Override
	public void delete(Paciente obj) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pst;

		try {
			pst = con.prepareStatement("delete from d1_Paciente"
				+ "where id = ?");
			pst.setLong(1, obj.getId());
		} catch (SQLException ex) {
			throw new RuntimeException("Erro ao Deletar Paciente!");
		} finally {
			ConnectionFactory.closeConnection(con);
		}
	}

	@Override
	public Paciente findById(long idFind) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;

		try {
			pst = con.prepareStatement("select * from d1_Paciente where cd_Paciente = ?");
			pst.setLong(1, idFind);
			rs = pst.executeQuery();

			Long id = rs.getLong("cd_Paciente");
			String nome = rs.getString("nm_Paciente");
			String sobrenome = rs.getString("sn_Paciente");
			String cpf = rs.getString("ds_cpf");
			String dataNascimento = rs.getString("dt_Nascimento");
			String rg = rs.getString("ds_RG");
			String telefone = rs.getString("ds_Telefone");
			String celular = rs.getString("ds_Celular");
			String email = rs.getString("ds_email");
			String convenio = rs.getString("ds_Convenio");
			String lougradouro = rs.getString("ds_Lougradouro");
			String numeroEndereco = rs.getString("ds_numerores");
			String complemento = rs.getString("ds_Complemento");
			String bairro = rs.getString("ds_Bairro");
			String cidade = rs.getString("ds_Cidade");
			int cep = rs.getInt("cd_Cep");
			String sexo = rs.getString("ds_sexo");
			String estadoCivil = rs.getString("ds_estadocivil");

			Endereco endereco = new Endereco(lougradouro, numeroEndereco, complemento, bairro, cidade, cep);
			Paciente paciente = new Model.Paciente(convenio, id, nome, sobrenome, rg, cpf, dataNascimento, endereco, celular, telefone,
				email, Model.EstadoCivil.valueOf(estadoCivil), Model.Sexo.valueOf(sexo));

			return paciente;

		} catch (SQLException ex) {
			throw new RuntimeException("Erro na Leitura da Tabela Paciente");
		} finally {
			ConnectionFactory.closeConnection(con);
		}

	}

}
