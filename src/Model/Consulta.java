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
public class Consulta {
	private long id;	
	private String status;
	private String queixaPaciente;
	private String dataConsulta;
	private Medico medico;
	private String exameFisico;	
	private String sid;
	private String conduta;
	private Paciente paciente;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getQueixaPaciente() {
		return queixaPaciente;
	}

	public void setQueixaPaciente(String queixaPaciente) {
		this.queixaPaciente = queixaPaciente;
	}

	public String getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(String dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public String getExameFisico() {
		return exameFisico;
	}

	public void setExameFisico(String exameFisico) {
		this.exameFisico = exameFisico;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getConduta() {
		return conduta;
	}

	public void setConduta(String conduta) {
		this.conduta = conduta;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
}

