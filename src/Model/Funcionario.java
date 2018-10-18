/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author gabri
 */
public abstract class  Funcionario extends Pessoa{
	private String login;
	private String senha;

	public Funcionario(long id, String nome, String rg, String dataNascimento, Endereco endereco, EstadoCivil estadoCivil, Sexo sexo) {
		super(id, nome, rg, dataNascimento, endereco, estadoCivil, sexo);
	}


	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
