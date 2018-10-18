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

    public Medico(String cmr, Agenda agenda, String login, String senha, long id, String nome, String cpf, String rg, String dataNascimento, String telefone, String celular, String email, Endereco endereco, EstadoCivil estadoCivil, Sexo sexo) {
        super(login, senha, id, nome, cpf, rg, dataNascimento, telefone, celular, email, endereco, estadoCivil, sexo);
        this.cmr = cmr;
        this.agenda = agenda;
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
