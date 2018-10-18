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
public class Paciente extends Pessoa{
	private String convenio;	


	public Paciente(String convenio, long id, String nome, String rg, String dataNascimento, Endereco endereco, EstadoCivil estadoCivil, Sexo sexo) {
		super(id, nome, rg, dataNascimento, endereco, estadoCivil, sexo);
		this.convenio = convenio;
	}
	

	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}
}
