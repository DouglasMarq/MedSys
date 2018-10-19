package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gabri
 */
public abstract class Pessoa {

	private long id;
	private String nome;
	private String sobrenome;
	private String cpf;
	private String rg;
	private String dataNascimento;
	private String telefone;
	private String celular;
	private String email;
	private Endereco endereco;
	private EstadoCivil estadoCivil;
	private Sexo sexo;

	public Pessoa(long id, String nome, String sobrenome, String cpf, String rg, String dataNascimento, String telefone, String celular, 
		String email, Endereco endereco, EstadoCivil estadoCivil, Sexo sexo) {
		
		setId(id);
		setNome(nome);
		setSobrenome(sobrenome);
		setCpf(cpf);
		setRg(rg);
		setDataNascimento(dataNascimento);
		setTelefone(telefone);
		setCelular(celular);
		setEmail(email);
		setEndereco(endereco);
		setEstadoCivil(estadoCivil);
		setSexo(sexo);
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
