/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.PacienteDao;

/**
 *
 * @author gabri
 */
public class Secretaria extends Funcionario {

	public Secretaria(String login, String senha, long id, String nome, String sobrenome, String cpf, String rg, String dataNascimento, 
		String telefone, String celular, String email, Endereco endereco, EstadoCivil estadoCivil, Sexo sexo) {
		super(login, senha, id, nome, sobrenome, cpf, rg, dataNascimento, telefone, celular, email, endereco, estadoCivil, sexo);
	}

	public void cadastrarPaciente(Paciente paciente) {
		try {
			PacienteDao dao = new PacienteDao();
			dao.create(paciente);
		} catch (Exception xe) {
			throw new RuntimeException("Erro ao cadastrar o Paciente!");
		}

	}

	public void fecharCadastroCliente(Paciente paciente) {
		try {
			PacienteDao dao = new PacienteDao();
			dao.delete(paciente);
		} catch (Exception ex) {
			throw new RuntimeException("Não foi possivel Fechar Cadastro do Paciente");
		}
	}

	public void marcarConsulta(Consulta consulta, Medico medico) {
		try {
			medico.getAgenda().adicionarConsulta(consulta);
		} catch (Exception ex) {
			throw new RuntimeException("Não foi possivel marcar consulta ");
		}

	}

	public void desmarcarConsulta(Consulta consulta, Medico medico) {

	}
}
