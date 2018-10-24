
import Controller.MedicoCt;
import Controller.OperadorCt;
import Model.Endereco;
import Model.EstadoCivil;
import Model.Medico;
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
		MedicoCt medicoct= new MedicoCt();
		OperadorCt operadorct = new OperadorCt();
		
		//operadorct.cadastrarOperador("GabrielOperador", "Martins", 10, "GabrielOperador", "Martins", "333333333", "444444444444", "21/09/1999", "Rua um", "10", "A", "Vila", "Mogi", 987654, "99999999", "888888", "email@email.com", EstadoCivil.CASADO, Sexo.MASCULINO);
		
		//operadorct.renovarOperador("GabrielO", "Martins", 10,21, "GabrielOperador", "Martins", "333333333", "444444444444", "21/09/1999", "Rua um", "10", "A", "Vila", "Mogi", 987654, "99999999", "888888", "email@email.com", EstadoCivil.CASADO, Sexo.MASCULINO);
		
		operadorct.removerOperador(21, "444444444444", "GabrielOperador");
		
		//medicoct.cadastrarMedico("222222", "Gabriel", "Martins", 10, "Gabriel", "Martins", "333333333", "444444444444", "21/09/1999", "Rua um", "10", "A", "Vila", "Mogi", 987654, "99999999", "888888", "email@email.com", EstadoCivil.CASADO, Sexo.MASCULINO);
		
		//medicoct.renovarMedico("3332222", "Gabriel", "Martins", 10, 20, "Gabriel", "Martins", "333333333", "444444444444", "21/09/1999", "Rua um", "10", "A", "Vila", "Mogi", 987654, "99999999", "888888", "email@email.cm", EstadoCivil.CASADO, Sexo.MASCULINO);
		
		//medicoct.removerMedico(20, "444444444444", "Gabriel");
		
		
		System.out.println("Cadastrando!");
	}
}
