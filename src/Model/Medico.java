package Model;

import Model.Endereco;
import Model.EstadoCivil;
import Model.Funcionario;
import Model.Sexo;
import dao.MedicoDao;
import java.util.List;
import javax.swing.JOptionPane;

public class Medico extends Funcionario {

    private String crm;
     /**
     * Construtor vazio para apenas instancia da classe.
     */
    public Medico() {
    }
/**
 * Construtor feito para passagens de tais dados por parametro:
 * @param crm
 * @param login
 * @param senha
 * @param cargo
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
    public Medico(String crm, String login, String senha, int cargo, long id, String nome, String sobrenome, String rg, String cpf, String dataNascimento, Endereco endereco, String celular, String telefone, String email, EstadoCivil estadocivil, Sexo sexo)
    {
        super(login, senha, cargo, id, nome, sobrenome, rg, cpf, dataNascimento, endereco, celular, telefone, email, estadocivil, sexo);
        this.crm = crm;
    }
/**
 * Construtor feito para passagens de tais dados por parametro:
 * @param crm
 * @param login
 * @param senha
 * @param cargo
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
    public Medico(String crm, String login, String senha, int cargo, String nome, String sobrenome, String rg, String cpf, String dataNascimento, Endereco endereco, String celular, String telefone, String email, EstadoCivil estadocivil, Sexo sexo) {
        super(login, senha, cargo, nome, sobrenome, rg, cpf, dataNascimento, endereco, celular, telefone, email, estadocivil, sexo);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    // DAO's na view
     /**
     * Passa o comando "create" para a classe DAO para gravação de dados no bd.
     */
    public void gravar() {
        MedicoDao dao = new MedicoDao();
        int valida = dao.create(this);

        if (valida != 1) {

            String message = "Cadastro não Concluido";
            String erro = "Erro!!";

            JOptionPane.showMessageDialog(null, message, erro, JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, "Ocorreu um erro durante o cadastro,verifique...");

        } else {
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        }
    }
    /**
     * Passa o comando "delete" para a classe DAO para a exclusão de dados no bd.
     */
    public void deletar() {
        MedicoDao dao = new MedicoDao();
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
        MedicoDao dao = new MedicoDao();
        int valida = dao.update(this.getId(), this);

        if (valida != 1) {
            String message = "Recadastro não concluido";
            String erro = "Erro!!";

            JOptionPane.showMessageDialog(null, message, erro, JOptionPane.ERROR_MESSAGE);
        }
    }
    /**
     * Busca os operadores e retonar uma list com todos eles.
     * @return 
    */
    public List<Medico> buscar() {
        MedicoDao dao = new MedicoDao();
        return dao.read();
    }

}
