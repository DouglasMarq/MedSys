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

    public Funcionario(String login, String senha, long id, String nome, String cpf, String rg, String dataNascimento, String telefone, String celular, String email, Endereco endereco, EstadoCivil estadoCivil, Sexo sexo) {
        super(id, nome, cpf, rg, dataNascimento, telefone, celular, email, endereco, estadoCivil, sexo);
        this.login = login;
        this.senha = senha;
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
