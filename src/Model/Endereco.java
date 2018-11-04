package Model;

public class Endereco {

	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private int cep;
    /**
    * Construtor sem parametros apenas para isntancia da classe
    */
	public Endereco() {
	}
/**
 * Construtor feito para passagens de tais dados por parametro:
 * @param logradouro
 * @param numero
 * @param complemento
 * @param bairro
 * @param cidade
 * @param cep 
 */
	public Endereco(String logradouro, String numero, String complemento, String bairro, String cidade, int cep) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

}
