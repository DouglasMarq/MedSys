package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Paciente;

public class PacienteDao implements dao<Paciente> {

    @Override
    public void create(Paciente obj) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement("insert into d1_Pacientes (cd_Paciente, nm_paciente, ds_cpf, dt_Nascimento, ds_rg, ds_Telefone, ds_Celular, ds_Email,"
                    + " ds_Convenio, ds_logradouro, ds_numeroresidencia, ds_complemento, ds_bairro, ds_cidade, cd_cep, ds_sexo,"
                    + " ds_estadocivil)"
                    + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            pst.setLong(1, obj.getId());
            pst.setString(2, obj.getNome());
            pst.setString(3, obj.getCpf());
            pst.setString(4, obj.getDataNascimento());
            pst.setString(5, obj.getRg());
            pst.setString(6, obj.getTelefone());
            pst.setString(7, obj.getCelular());
            pst.setString(8, obj.getEmail());
            pst.setString(9, obj.getConvenio());
            pst.setString(10, obj.getEndereco().getLogradouro());
            pst.setString(11, obj.getEndereco().getNumero());
            pst.setString(12, obj.getEndereco().getComplemento());
            pst.setString(13, obj.getEndereco().getBairro());
            pst.setString(14, obj.getEndereco().getCidade());
            pst.setLong(15, obj.getEndereco().getCep());
            pst.setString(16, obj.getSexo().toString());
            pst.setString(17, obj.getEstadoCivil().toString());

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
            pst = con.prepareStatement("select * from d1_Pacientes");
            rs = pst.executeQuery();
            List pacientes = new ArrayList();

            while (rs.next()) {
                Long id = rs.getLong("cd_paciente");
                String nome = rs.getString("nm_paciente");
                String cpf = rs.getString("ds_cpf");
                String dataNascimento = rs.getString("dt_nascimento");
                String rg = rs.getString("ds_rg");
                String telefone = rs.getString("ds_Telefone");
                String celular = rs.getString("ds_Celular");
                String email = rs.getString("ds_Email");
                String convenio = rs.getString("ds_Convenio");
                String lougradouro = rs.getString("ds_lougradouro");
                String numeroEndereco = rs.getString("ds_numeroresidencia");
                String complemento = rs.getString("ds_complemento");
                String bairro = rs.getString("ds_bairro");
                String cidade = rs.getString("ds_cidade");
                long cep = rs.getLong("cd_cep");
                String sexo = rs.getString("ds_sexo");
                String estadoCivil = rs.getString("ds_estadocivil");

                Endereco endereco = new Endereco(lougradouro, numeroEndereco, complemento, bairro, cidade, cep);
                Paciente paciente = new Paciente(convenio, id, nome, cpf, rg, dataNascimento, telefone, celular,
                        email, endereco, EstadoCivil.valueOf(estadoCivil), Sexo.valueOf(sexo));
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
            pst = con.prepareStatement("update d1_Paciente"
                    + " set cd_Paciente = ?"
                    + "nm_Paciente = ?,"
                    + "ds_cpf = ?,"
                    + "dt_Nascimento = ?,"
                    + "ds_rg = ?,"
                    + "ds_Telefone = ?,"
                    + "ds_Celular = ?,"
                    + "ds_Email = ?,"
                    + "ds_Convenio = ?,"
                    + "ds_logradouro = ?,"
                    + "ds_numeroresidencia = ?,"
                    + "ds_complemento = ?,"
                    + "ds_bairro = ?,"
                    + "ds_cidade = ?,"
                    + "cd_cep = ?,"
                    + "ds_sexo = ?,"
                    + "ds_estadocivil = ?");

            pst.setLong(1, obj.getId());
            pst.setString(2, obj.getNome());
            pst.setString(3, obj.getCpf());
            pst.setString(4, obj.getDataNascimento());
            pst.setString(5, obj.getRg());
            pst.setString(6, obj.getTelefone());
            pst.setString(7, obj.getCelular());
            pst.setString(8, obj.getEmail());
            pst.setString(9, obj.getConvenio());
            pst.setString(10, obj.getEndereco().getLogradouro());
            pst.setString(11, obj.getEndereco().getNumero());
            pst.setString(12, obj.getEndereco().getComplemento());
            pst.setString(13, obj.getEndereco().getBairro());
            pst.setString(14, obj.getEndereco().getCidade());
            pst.setLong(15, obj.getEndereco().getCep());
            pst.setString(16, obj.getSexo().toString());
            pst.setString(17, obj.getEstadoCivil().toString());
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
    public Paciente findById(long idFind) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            pst = con.prepareStatement("select * from d1_Pacientes where cd_Paciente = ?");
            pst.setLong(1, idFind);
            rs = pst.executeQuery();
            
            Long id = rs.getLong("cd_paciente");
            String nome = rs.getString("nm_paciente");
            String cpf = rs.getString("ds_cpf");
            String dataNascimento = rs.getString("dt_nascimento");
            String rg = rs.getString("ds_rg");
            String telefone = rs.getString("ds_Telefone");
            String celular = rs.getString("ds_Celular");
            String email = rs.getString("ds_Email");
            String convenio = rs.getString("ds_Convenio");
            String lougradouro = rs.getString("ds_lougradouro");
            String numeroEndereco = rs.getString("ds_numeroresidencia");
            String complemento = rs.getString("ds_complemento");
            String bairro = rs.getString("ds_bairro");
            String cidade = rs.getString("ds_cidade");
            long cep = rs.getLong("cd_cep");
            String sexo = rs.getString("ds_sexo");
            String estadoCivil = rs.getString("ds_estadocivil");

            Endereco endereco = new Endereco(lougradouro, numeroEndereco, complemento, bairro, cidade, cep);
            Paciente paciente = new Paciente(convenio, id, nome, cpf, rg, dataNascimento, telefone, celular,
                    email, endereco, EstadoCivil.valueOf(estadoCivil), Sexo.valueOf(sexo));

            return paciente;

        } catch (SQLException ex) {
            throw new RuntimeException("Erro na Leitura da Tabela Paciente");
        } finally {
            ConnectionFactory.closeConnection(con);
        }

    }

}
