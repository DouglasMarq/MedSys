/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class Agenda {
	private ArrayList<Consulta> consulta; 	

	public ArrayList<Consulta> getConsulta() {
		return consulta;
	}

	public void setConsulta(ArrayList<Consulta> consulta) {
		this.consulta = consulta;
	}
	
	public void adicionarConsulta(Consulta consulta) {
		this.consulta.add(consulta);
	}
	
	public void removerConsulta(Consulta consulta) {
		this.consulta.remove(consulta);
	}
	
	

}
