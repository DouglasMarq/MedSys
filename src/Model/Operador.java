package Model;

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


}
