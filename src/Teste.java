
import Model.Endereco;
import Model.EstadoCivil;
import Model.Paciente;
import Model.Sexo;



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
		Endereco endereco = new Endereco();
		Paciente p = new Paciente("a", "Gbri", "Gbri", "Gbri", "Gbri", "Gbri", endereco, "Gbri", "Gbri", "Gbri", EstadoCivil.CASADO, Sexo.MASCULINO);
		//p.gravar();
		p.deletar();
	}
}
