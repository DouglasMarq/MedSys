/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Endereco;
import Model.EstadoCivil;
import Model.Operador;
import Model.Sexo;
import dao.OperadorDao;
import java.util.List;

/**
 *
 * @author gabri
 */
public class OperadorCt {

	public boolean cadastrarOperador(String login, String senha, int cargo, String nome, String sobrenome, String rg, String cpf, String dataNascimento, String logradouro, String numero, String complemento, String bairro, String cidade, int cep, String celular, String telefone, String email, EstadoCivil estadocivil, Sexo sexo) {

		try {
			Endereco endereco = new Endereco(logradouro, numero, complemento, bairro, cidade, cep);
			Operador operador = new Operador(login, senha, cargo, nome, sobrenome, rg, cpf, dataNascimento, endereco, celular, telefone, email, estadocivil, sexo);
			OperadorDao dao = new OperadorDao();
			dao.create(operador);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	public boolean removerOperador(long idFind, String CpfFind, String nomeFind) {
		try {
			OperadorDao dao = new OperadorDao();
			dao.delete(idFind, CpfFind, nomeFind);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	public boolean renovarOperador(String login, String senha, int cargo, long id, String nome, String sobrenome, String rg, String cpf, String dataNascimento, String logradouro, String numero, String complemento, String bairro, String cidade, int cep, String celular, String telefone, String email, EstadoCivil estadocivil, Sexo sexo) {

		try {
			Endereco endereco = new Endereco(logradouro, numero, complemento, bairro, cidade, cep);
			Operador operador = new Operador(login, senha, cargo, id, nome, sobrenome, rg, cpf, dataNascimento, endereco, celular, telefone, email, estadocivil, sexo);
			OperadorDao dao = new OperadorDao();
			dao.update(id, operador);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public Operador procurarOperadorOne(long idFind, String cpfFind, String nomeFind) {
		try {
			OperadorDao dao = new OperadorDao();
			return dao.findOne(idFind, cpfFind, nomeFind);
		}catch(Exception ex){
			return null;
		}

	}

	public List<Operador> procurarMedicos() {
		try {
			OperadorDao dao = new OperadorDao();
			return dao.read();
		} catch (Exception e) {
			return null;
		}
	}
}
