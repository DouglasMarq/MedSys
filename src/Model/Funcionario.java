package Model;

public abstract class Funcionario extends Pessoa {

	private String login;
	private String senha;
	private int cargo;
/**
 * Utilizado para instanciar a classe sem nenhum parametro
 */
	public Funcionario() {
	}
/**
 * Construtor feito para passagens de tais dados por parametro:
 * @param login
 * @param senha
 * @param cargo
 * @param id
 * @param nome
 * @param sobrenome
 * @param rg
 * @param cpf
 * @param dataNascimento
 * @param endereco
 * @param celular
 * @param telefone
 * @param email
 * @param estadocivil
 * @param sexo 
 */
	public Funcionario(String login, String senha, int cargo, long id, String nome, String sobrenome, String rg, String cpf, String dataNascimento, Endereco endereco, String celular, String telefone, String email, EstadoCivil estadocivil, Sexo sexo) {
		super(id, nome, sobrenome, rg, cpf, dataNascimento, endereco, celular, telefone, email, estadocivil, sexo);
		this.login = login;
		this.senha = senha;
		this.cargo = cargo;
	}
/**
 * Construtor feito para passagens de tais dados por parametro:
 * @param login
 * @param senha
 * @param cargo
 * @param nome
 * @param sobrenome
 * @param rg
 * @param cpf
 * @param dataNascimento
 * @param endereco
 * @param celular
 * @param telefone
 * @param email
 * @param estadocivil
 * @param sexo 
 */
	public Funcionario(String login, String senha, int cargo, String nome, String sobrenome, String rg, String cpf, String dataNascimento, Endereco endereco, String celular, String telefone, String email, EstadoCivil estadocivil, Sexo sexo) {
		super(nome, sobrenome, rg, cpf, dataNascimento, endereco, celular, telefone, email, estadocivil, sexo);
		this.login = login;
		this.senha = senha;
		this.cargo = cargo;
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

	public int getCargo() {
		return cargo;
	}

	public void setCargo(int cargo) {
		this.cargo = cargo;
	}


}
