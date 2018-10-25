package Controller;

import Model.Endereco;
import Model.EstadoCivil;
import Model.Medico;
import Model.Sexo;
import dao.MedicoDao;
import java.util.List;

public class MedicoCt {

	public boolean cadastrarMedico(String crm, String login, String senha, int cargo, String nome, String sobrenome, String rg, String cpf, String dataNascimento, String logradouro, String numero, String complemento, String bairro, String cidade, int cep, String celular, String telefone, String email, EstadoCivil estadocivil, Sexo sexo) {

		try {
			Endereco endereco = new Endereco(logradouro, numero, complemento, bairro, cidade, cep);
			Medico medico = new Medico(crm, login, senha, cargo, nome, sobrenome, rg, cpf, dataNascimento, endereco, celular, telefone, email, estadocivil, sexo);
			MedicoDao dao = new MedicoDao();
			dao.create(medico);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	public boolean removerMedico(long idFind, String CpfFind, String nomeFind) {
		try {
			MedicoDao dao = new MedicoDao();
			dao.delete(idFind, CpfFind, nomeFind);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	public boolean renovarMedico(String crm, String login, String senha, int cargo, long id, String nome, String sobrenome, String rg, String cpf, String dataNascimento, String logradouro, String numero, String complemento, String bairro, String cidade, int cep, String celular, String telefone, String email, EstadoCivil estadocivil, Sexo sexo) {

		try {
			Endereco endereco = new Endereco(logradouro, numero, complemento, bairro, cidade, cep);
			Medico medico = new Medico(crm, login, senha, cargo, id, nome, sobrenome, rg, cpf, dataNascimento, endereco, celular, telefone, email, estadocivil, sexo);
			MedicoDao dao = new MedicoDao();
			dao.update(id, medico);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public Medico procurarMedicoOne(long idFind, String cpfFind, String nomeFind) {
		try {
			MedicoDao dao = new MedicoDao();
			return dao.findOne(idFind, cpfFind, nomeFind);
		} catch (Exception ex) {
			return null;
		}

	}

	public List<Medico> procurarMedicos() {
		try {
			MedicoDao dao = new MedicoDao();
			return dao.read();
		} catch (Exception e) {
			return null;
		}
	}
}
