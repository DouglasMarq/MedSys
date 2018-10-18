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
public class Medico extends Funcionario{
	private String cmr;	
	private Agenda agenda;

	public Medico(String crm, long id, String nome, String rg, String dataNascimento, Endereco endereco, EstadoCivil estadoCivil, Sexo sexo) {
		super(id, nome, rg, dataNascimento, endereco, estadoCivil, sexo);
		this.cmr = crm;
	}

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}

	public String getCmr() {
		return cmr;
	}

	public void setCmr(String cmr) {
		this.cmr = cmr;
	}
}
