/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import dao.ConnectionFactory;
import dao.PacienteDao;
import java.sql.Connection;

/**
 *
 * @author gabri
 */
public class Teste {

	public static void main(String[] args) {
		/*Endereco ed = new Endereco("Rua 1", "10", "a", "Mogi", "das Cruzes", 999999);
		Paciente p = new Paciente("Amil", 10, "Gabriel", "Martins", "rs", "CPF", "2109", ed, "18273", "8888888", "email@",EstadoCivil.SOLTEIRO,Sexo.MASCULINO);
		
		PacienteDao dao = new PacienteDao();
		dao.create(p);*/

		Connection con = ConnectionFactory.getConnection();

	}
}
