 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Endereco;
import Model.EstadoCivil;
import Model.Paciente;
import Model.Sexo;
import dao.PacienteDao;
import java.util.List;

/**
 *
 * @author gabri
 */
public class PacienteCt {

	public boolean cadastrarPaciente(String convenio, String nome, String sobrenome, String rg, String cpf, String dataNascimento, String logradouro, String numero, String complemento, String bairro, String cidade, int cep, String celular, String telefone, String email, EstadoCivil estadocivil, Sexo sexo) {

		try {

			Endereco endereco = new Endereco(logradouro, numero, complemento, bairro, cidade, cep);
			Paciente paciente = new Paciente(convenio, nome, sobrenome, rg, cpf, dataNascimento, endereco, celular, telefone, email, estadocivil, sexo);
			PacienteDao dao = new PacienteDao();
			dao.create(paciente);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	public boolean removePaciente(long id, String nome, String cpf) {

		try {
			PacienteDao dao = new PacienteDao();
			dao.delete(id, cpf, nome);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean renovarPaciente(String convenio, long id, String nome, String sobrenome, String rg, String cpf, String dataNascimento, String logradouro, String numero, String complemento, String bairro, String cidade, int cep, String celular, String telefone, String email, EstadoCivil estadocivil, Sexo sexo) {

		try {
			Endereco endereco = new Endereco(logradouro, numero, complemento, bairro, cidade, cep);
			Paciente paciente = new Paciente(convenio, id, nome, sobrenome, rg, cpf, dataNascimento, endereco, celular, telefone, email, estadocivil, sexo);
			PacienteDao dao = new PacienteDao();
			dao.update(id, paciente);
			return true;
		} catch (Exception ex) {

			return false;
		}
	}

	public Paciente procuraPacienteOne(long id, String nome, String cpf) {
		try {
			PacienteDao dao = new PacienteDao();
			return dao.findOne(id, cpf, nome);

		} catch (Exception ex) {

			return null;
		}
	}

	public List<Paciente> procuraPacientes() {
		PacienteDao dao = new PacienteDao();
		return dao.read();
	}
}
