/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import dao.PacienteDao;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class Operador extends Funcionario {

	public Operador() {
	}

	public Operador(String login, String senha, int departamento, long id, String nome, String sobrenome, String rg, String cpf, String dataNascimento, Endereco endereco, String celular, String telefone, String email, EstadoCivil estadocivil, Sexo sexo) {
		super(login, senha, departamento, id, nome, sobrenome, rg, cpf, dataNascimento, endereco, celular, telefone, email, estadocivil, sexo);
	}

	public Operador(String login, String senha, int departamento, String nome, String sobrenome, String rg, String cpf, String dataNascimento, Endereco endereco, String celular, String telefone, String email, EstadoCivil estadocivil, Sexo sexo) {
		super(login, senha, departamento, nome, sobrenome, rg, cpf, dataNascimento, endereco, celular, telefone, email, estadocivil, sexo);
	}

	public boolean cadastrarPaciente(String convenio, String nome, String sobrenome, String rg, String cpf, String dataNascimento, String logradouro, String numero, String complemento, String bairro, String cidade, int cep, String celular, String telefone, String email, EstadoCivil estadocivil, Sexo sexo) {

		try {

			Endereco endereco = new Endereco(logradouro, numero, complemento, bairro, cidade, cep);
			Paciente paciente = new Paciente(convenio, nome, sobrenome, rg, cpf, dataNascimento, endereco, celular, telefone, email, estadocivil, sexo);
			PacienteDao dao = new PacienteDao();
			dao.create(paciente);
			return true;
		} catch (Exception ex) {
			String message = "Erro no Cadastro do Paciente";
			String erro = "Erro!!";
			JOptionPane.showMessageDialog(null, message, erro, JOptionPane.ERROR_MESSAGE);
			return false;
		}

	}

	public boolean removePaciente(long id, String nome, String cpf) {

		try {

			PacienteDao dao = new PacienteDao();
			dao.delete(id, cpf, nome);
			return true;
		} catch (Exception ex) {
			String message = "Erro na Remoção do Paciente";
			String erro = "Erro!!";
			JOptionPane.showMessageDialog(null, message, erro, JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}

	/*public boolean renovarPaciente(Long id, String login, String senha, int departamento, String nome, String sobrenome, String rg, String cpf, String dataNascimento, Endereco endereco, String celular, String telefone, String email, EstadoCivil estadocivil, Sexo sexo) {

		try {
			
			return true;
		}catch (Exception ex) {
			String message = "Erro na Atualização do Paciente";
			String erro = "Erro!!";
			JOptionPane.showMessageDialog(null, message, erro, JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}
	
	public boolean procuraPaciente(long id, String nome, String cpf) {
		try {
			PacienteDao dao = new PacienteDao();
			System.out.println(dao.findOne(id, cpf, nome));
			return true;
		} catch (Exception ex) {
			String message = "Erro na Procura do Paciente";
			String erro = "Erro!!";
			JOptionPane.showMessageDialog(null, message, erro, JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}*/
}
