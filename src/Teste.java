
import Model.Endereco;
import Model.EstadoCivil;
import Model.Paciente;
import Model.Sexo;
import dao.PacienteDao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabri
 */
public class Teste {
	public static void main(String[] args) {
		Endereco ed = new Endereco("Rua um", "12", "A", "Vila", "Mogi ", 876);
		Paciente p = new Paciente("M", "Gabriel", "ms", "1", "2", "3", ed, "4", "5", "@", EstadoCivil.CASADO, Sexo.MASCULINO);
		PacienteDao dao = new PacienteDao();
		//dao.create(p);
		
		
		/*for (Paciente paciente : dao.read()) {
			System.out.println(paciente);
		}*/

		//System.out.println(dao.findById(19));
		
		//dao.delete(20);

		dao.update(22,p);

		
	

		
	}
}
