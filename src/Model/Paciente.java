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
/**
 * Construtor utilizado para passagem de dados por meio dos paramentos :
 * @param convenio
 * @param id
 * @param nome
 * @param sobrenome
 * @param rg
 * @param cpf
 * @param dataNascimento
 * @param endereco
 * @param celular
 * @param telefone
 * @param email
 * @param estadocivil
 * @param sexo 
 */
    public Paciente(String convenio, long id, String nome, String sobrenome, String rg, String cpf, String dataNascimento, Endereco endereco, String celular, String telefone, String email, EstadoCivil estadocivil, Sexo sexo) {
        super(id, nome, sobrenome, rg, cpf, dataNascimento, endereco, celular, telefone, email, estadocivil, sexo);
        this.convenio = convenio;
    }

    /**
     * Construtor utilizado para passagem de dados por meio dos paramentos :
     * @param convenio
     * @param nome
     * @param sobrenome
     * @param rg
     * @param cpf
     * @param dataNascimento
     * @param endereco
     * @param celular
     * @param telefone
     * @param email
     * @param estadocivil
     * @param sexo 
     */
    public Paciente(String convenio, String nome, String sobrenome, String rg, String cpf, String dataNascimento, Endereco endereco, String celular, String telefone, String email, EstadoCivil estadocivil, Sexo sexo) {
        super(nome, sobrenome, rg, cpf, dataNascimento, endereco, celular, telefone, email, estadocivil, sexo);
        this.convenio = convenio;
    }
/**
 * Construtor utilizado para instanciar a classe sem nenhuma passagem de parametro
 */
    public Paciente() {
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    // DAO's na view
    /**
     * Passa o comando "create" para a classe DAO para gravação de dados no bd.
     */
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
    /**
     * Passa o comando "delete" para a classe DAO para a exclusão de dados no bd.
     */
    public void deletar() {
        PacienteDao dao = new PacienteDao();
        int valida = dao.delete(this.getId());

        if (valida != 1) {
            String message = "Exclusão não Concluida";
            String erro = "Erro!!";

            JOptionPane.showMessageDialog(null, message, erro, JOptionPane.ERROR_MESSAGE);
        }
    }
    /**
     * Passa o comando "update" para a classe DAO para atualização de dados no bd.
     */
    public void regravar() {
        PacienteDao dao = new PacienteDao();
        int valida = dao.update(this.getId(), this);

        if (valida != 1) {
            String message = "Recadastro não concluido";
            String erro = "Erro!!";

            JOptionPane.showMessageDialog(null, message, erro, JOptionPane.ERROR_MESSAGE);
        }
    }
/**
 * Busca os pacientes e os armazena em uma List que é passada como retorno da função.
 * @return 
 */
    public List<Paciente> buscar() {
        PacienteDao dao = new PacienteDao();
        return dao.read();
    }
/**
 * Busca apenas um paciente em especifico pelo CPF do paciente.
 * @param cpf
 * @return 
 */
    public Paciente buscaUm(String cpf) {
        PacienteDao dao = new PacienteDao();
        return dao.findOne(cpf);
    }
}
