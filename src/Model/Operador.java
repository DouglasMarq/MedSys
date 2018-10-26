package Model;

import dao.OperadorDao;
import dao.PacienteDao;
import java.util.List;
import javax.swing.JOptionPane;

public class Operador extends Funcionario {

	public Operador() {
	}

	public Operador(String login, String senha, int departamento, long id, String nome, String sobrenome, String rg, String cpf, String dataNascimento, Endereco endereco, String celular, String telefone, String email, EstadoCivil estadocivil, Sexo sexo) {
		super(login, senha, departamento, id, nome, sobrenome, rg, cpf, dataNascimento, endereco, celular, telefone, email, estadocivil, sexo);
	}

	public Operador(String login, String senha, int departamento, String nome, String sobrenome, String rg, String cpf, String dataNascimento, Endereco endereco, String celular, String telefone, String email, EstadoCivil estadocivil, Sexo sexo) {
		super(login, senha, departamento, nome, sobrenome, rg, cpf, dataNascimento, endereco, celular, telefone, email, estadocivil, sexo);
	}

	// DAO's na view
	
	public void gravar() {
		OperadorDao dao = new OperadorDao();
		int valida = dao.create(this);

		if (valida != 1) {
			
			String message = "Cadastro não Concluido";
			String erro = "Erro!!";

			JOptionPane.showMessageDialog(null, message, erro, JOptionPane.ERROR_MESSAGE);
		}
	}

	public void deletar() {
		OperadorDao dao = new OperadorDao();
		int valida = dao.delete(this.getId(), this.getCpf(), this.getNome());
		
		if (valida != 1) {
			String message = "Exclusão não Concluida";
			String erro = "Erro!!";

			JOptionPane.showMessageDialog(null, message, erro, JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void regravar() {
		OperadorDao dao = new OperadorDao();
		int valida = dao.update(this.getId(), this);
		
		if (valida != 1) {
			String message = "Recadastro não concluido";
			String erro = "Erro!!";

			JOptionPane.showMessageDialog(null, message, erro, JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public List<Operador> buscar() {
		OperadorDao dao = new OperadorDao();
		return dao.read();	
	}
	
	public Operador buscaUm(){
		OperadorDao dao = new OperadorDao();
		return dao.findOne(this.getId(), this.getCpf(), this.getNome());
	}
}
