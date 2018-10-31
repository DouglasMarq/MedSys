
import Model.Consulta;
import Model.Endereco;
import Model.EstadoCivil;
import Model.Paciente;
import Model.Sexo;
import dao.ConsultaDao;



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
		ConsultaDao Consulta = new ConsultaDao();
		Consulta cons = new Consulta("Aberto", "31/10/2018", "sono", "cerebral", "guilhotina", "tomanocu", "douglao", "meister", "douglaisoasi", "meisterieism");
		
		cons.gravar();
	}
}
