package Model;

import dao.MedicoDao;
import java.util.List;
import javax.swing.JOptionPane;

public class Medico extends Funcionario {

	private String crm;

	public Medico() {
	}

	public Medico(String crm, String login, String senha, int cargo, long id, String nome, String sobrenome, String rg, String cpf, String dataNascimento, Endereco endereco, String celular, String telefone, String email, EstadoCivil estadocivil, Sexo sexo) {
		super(login, senha, cargo, id, nome, sobrenome, rg, cpf, dataNascimento, endereco, celular, telefone, email, estadocivil, sexo);
		this.crm = crm;
	}

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
	
	public void gravar() {
		MedicoDao dao = new MedicoDao();
		int valida = dao.create(this);

		if (valida != 1) {
			
			String message = "Cadastro não Concluido";
			String erro = "Erro!!";

			JOptionPane.showMessageDialog(null, message, erro, JOptionPane.ERROR_MESSAGE);
                        JOptionPane.showMessageDialog(null, "Ocorreu um erro durante o cadastro,verifique...");
		} else JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
	}

	public void deletar() {
		MedicoDao dao = new MedicoDao();
		int valida = dao.delete(this.getId(), this.getCpf(), this.getNome());
		
		if (valida != 1) {
			String message = "Exclusão não Concluida";
			String erro = "Erro!!";

			JOptionPane.showMessageDialog(null, message, erro, JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void regravar() {
		MedicoDao dao = new MedicoDao();
		int valida = dao.update(this.getId(), this);
		
		if (valida != 1) {
			String message = "Recadastro não concluido";
			String erro = "Erro!!";

			JOptionPane.showMessageDialog(null, message, erro, JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public List<Medico> buscar() {
		MedicoDao dao = new MedicoDao();
		return dao.read();	
	}
	
	public Medico buscaUm(){
		MedicoDao dao = new MedicoDao();
		return dao.findOne(this.getId(), this.getCpf(), this.getNome());
	}

}
