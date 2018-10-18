package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.Paciente;

public class PacienteDao implements dao<Paciente> {

	@Override
	public void create(Paciente obj) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pst = null;

		try {
			pst = con.prepareStatement("insert into Pacientes (id, nome, rg, dataNascimento, logradouro , estadoCivil, sexo, convenio)"
				+ "values (?,?,?,?,?,?,?,?)");

			pst.setLong(1, obj.getId());
			pst.setString(2, obj.getNome());
			pst.setString(3, obj.getRg());
			pst.setString(4, obj.getDataNascimento());
			pst.setString(5, obj.getEndereco().toString());
			pst.setString(6, obj.getEstadoCivil().toString());
			pst.setString(7, obj.getSexo().toString());
			pst.setString(8, obj.getConvenio());

		} catch (SQLException ex) {
			throw new RuntimeException("Erro no Cadastro do Paciente");
		} finally {
			ConnectionFactory.closeConnection(con);
		}

	}

	@Override
	public List<Paciente> read() {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			pst = con.prepareCall("select * from Pacientes");
			rs = pst.executeQuery();

			while (rs.next()) {

				long id = rs.getLong("Id");
				String nome = rs.getString("Nome");
				String rg = rs.getString("Rg");
				String dataNascimento = rs.getString("DataNascimento");
				String estadoCivil = rs.getString("EstadoCivil");
				String sexo = rs.getString("Sexo");
				String convenio = rs.getString("Convenio");

				//String logradouro = //GABRIEL EDITA AQUI DPS
					
					
				//new Endereco(logradouro, numero, complemento, bairro, cidade, cep);
				//new Paciente(convenio, id, nome, rg, dataNascimento, endereco, EstadoCivil.valueOf(estadoCivil), Sexo.valueOf(sexo));
			}

		} catch (SQLException ex) {
			throw new RuntimeException("Erro na Leitura da Tabela Paciente");
		} finally {
			ConnectionFactory.closeConnection(con);
		}
            return null;
	}

	@Override
	public void update(Paciente obj) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pst;
		
			
			
	}

	@Override
	public void delete(Paciente obj) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pst;
		
		try {
			pst = con.prepareStatement("delete from Paciente"
						+ "where id = ?");
			pst.setLong(1, obj.getId());
		} catch (SQLException ex) {
			throw new RuntimeException("Erro ao Deletar Paciente!");
		} finally {
			ConnectionFactory.closeConnection(con);
		}
	}

	@Override
	public Paciente findById(long id) {
		return null;
	}

}
