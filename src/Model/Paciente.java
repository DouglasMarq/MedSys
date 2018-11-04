package Model;

import Model.Endereco;
import Model.EstadoCivil;
import Model.Pessoa;
import Model.Sexo;
import dao.PacienteDao;
import java.util.List;
import javax.swing.JOptionPane;

public class Paciente extends Pessoa {

    private String convenio;

    public Paciente(String convenio, long id, String nome, String sobrenome, String rg, String cpf, String dataNascimento, Endereco endereco, String celular, String telefone, String email, EstadoCivil estadocivil, Sexo sexo) {
        super(id, nome, sobrenome, rg, cpf, dataNascimento, endereco, celular, telefone, email, estadocivil, sexo);
        this.convenio = convenio;
    }

    public Paciente(String convenio, String nome, String sobrenome, String rg, String cpf, String dataNascimento, Endereco endereco, String celular, String telefone, String email, EstadoCivil estadocivil, Sexo sexo) {
        super(nome, sobrenome, rg, cpf, dataNascimento, endereco, celular, telefone, email, estadocivil, sexo);
        this.convenio = convenio;
    }

    public Paciente() {
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    // DAO's na view
    public void gravar() {
        PacienteDao dao = new PacienteDao();
        int valida = dao.create(this);

        if (valida != 1) {

            String message = "Cadastro não Concluido";
            String erro = "Erro!!";

            JOptionPane.showMessageDialog(null, message, erro, JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, "Ocorreu um erro no cadastro, verifique...");
        } else {
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        }
    }

    public void deletar() {
        PacienteDao dao = new PacienteDao();
        int valida = dao.delete(this.getId());

        if (valida != 1) {
            String message = "Exclusão não Concluida";
            String erro = "Erro!!";

            JOptionPane.showMessageDialog(null, message, erro, JOptionPane.ERROR_MESSAGE);
        }
    }

    public void regravar() {
        PacienteDao dao = new PacienteDao();
        int valida = dao.update(this.getId(), this);

        if (valida != 1) {
            String message = "Recadastro não concluido";
            String erro = "Erro!!";

            JOptionPane.showMessageDialog(null, message, erro, JOptionPane.ERROR_MESSAGE);
        }
    }

    public List<Paciente> buscar() {
        PacienteDao dao = new PacienteDao();
        return dao.read();
    }

    public Paciente buscaUm(String cpf) {
        PacienteDao dao = new PacienteDao();
        return dao.findOne(cpf);
    }
}
