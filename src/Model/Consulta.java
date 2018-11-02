package Model;

import dao.ConsultaDao;
import dao.PacienteDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Consulta {

    private String codigoConsulta;
    private String status;
    private String dataConsulta;
    private String laudoMedico;
    private String medicoNome;
    private String pacienteNome;

    protected DefaultTableModel ConsultasAbertas = new DefaultTableModel(new String[]{"Codigo da Consulta", "Status", "Data da Consulta", "Medico", "Paciente"}, 0);
    protected DefaultTableModel ConsultasFechadas = new DefaultTableModel(new String[]{"Codigo da Consulta", "Status", "Data da Consulta", "Medico", "Paciente"}, 0);
    private ArrayList<String> ComboBoxMedico = new ArrayList<>();

    public Consulta() {
    }

    public Consulta(String dataConsulta, String medicoNome, String pacienteNome) {
        this.dataConsulta = dataConsulta;
        this.medicoNome = medicoNome;
        this.pacienteNome = pacienteNome;
    }
    
    

    public Consulta(String status, String dataConsulta, String laudoMedico, String medicoNome, String pacienteNome) {
        this.status = status;
        this.dataConsulta = dataConsulta;
        this.laudoMedico = laudoMedico;
        this.medicoNome = medicoNome;
        this.pacienteNome = pacienteNome;
    }

    
    
    public Consulta(String codigoConsulta, String status, String dataConsulta, String laudoMedico, String medicoNome, String pacienteNome) {
        this.codigoConsulta = codigoConsulta;
        this.status = status;
        this.dataConsulta = dataConsulta;
        this.laudoMedico = laudoMedico;
        this.medicoNome = medicoNome;
        this.pacienteNome = pacienteNome;
    }


    
    

    public DefaultTableModel getConsultasFechadas() {
        return ConsultasFechadas;
    }

    public void setConsultasFechadas(DefaultTableModel ConsultasFechadas) {
        this.ConsultasFechadas = ConsultasFechadas;
    }

    public ArrayList<String> getComboBoxMedico() {
        return ComboBoxMedico;
    }

    public void setComboBoxMedico(ArrayList<String> ComboBoxMedico) {
        this.ComboBoxMedico = ComboBoxMedico;
    }

    public String getCodigoConsulta() {
        return codigoConsulta;
    }

    public void setCodigoConsulta(String codigoConsulta) {
        this.codigoConsulta = codigoConsulta;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getLaudoMedico() {
        return laudoMedico;
    }

    public void setLaudoMedico(String laudoMedico) {
        this.laudoMedico = laudoMedico;
    }

    public String getMedicoNome() {
        return medicoNome;
    }

    public void setMedicoNome(String medicoNome) {
        this.medicoNome = medicoNome;
    }

    public String getPacienteNome() {
        return pacienteNome;
    }

    public void setPacienteNome(String pacienteNome) {
        this.pacienteNome = pacienteNome;
    }

    
    public void gravar(){
        ConsultaDao dao = new ConsultaDao();
		int valida = dao.create(this);

		if (valida != 1) {
			
			String message = "Agendamento não Concluido";
			String erro = "Erro!!";

			JOptionPane.showMessageDialog(null, message, erro, JOptionPane.ERROR_MESSAGE);
                        JOptionPane.showMessageDialog(null, "Ocorreu um erro no Agendamento, verifique...");
		} else JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
    }
        
    public void excluir()  {
        ConsultaDao dao = new ConsultaDao();
        int valida = dao.delete(Long.parseLong(this.getCodigoConsulta()));
        
        if (valida != 1) {
			String message = "Exclusão não Concluida";
			String erro = "Erro!!";

			JOptionPane.showMessageDialog(null, message, erro, JOptionPane.ERROR_MESSAGE);
		}
    }
    
    public DefaultTableModel TableConsulta() {
        //DefaultTableModel ConsultasAbertas = new DefaultTableModel(new String[]{"Codigo da Consulta", "Status", "Data da Consulta", "Paciente", "Medico"}, 0);
        //DefaultTableModel ConsultasFechadas = new DefaultTableModel(new String[]{"Codigo da Consulta","Status","Data da Consulta","Paciente","Sobrenome","Medico","Sobrenome"}, 0);

        ConsultaDao cd = new ConsultaDao();

        for (Consulta ca : cd.read()) {
            if (ca.getStatus().equals("Aberto")) {
                ConsultasAbertas.addRow(new String[]{ca.getCodigoConsulta(), ca.getStatus(), ca.getDataConsulta(), ca.getPacienteNome(), ca.getMedicoNome()});
            } else {
                ConsultasFechadas.addRow(new String[]{ca.getCodigoConsulta(), ca.getStatus(), ca.getDataConsulta(), ca.getPacienteNome(), ca.getMedicoNome()});
            }
            ComboBoxMedico.add(ca.getMedicoNome());
        }
        return ConsultasAbertas;
    }
    
    public DefaultTableModel CFechado() {
        return ConsultasFechadas;
    }
    
    public ArrayList<String> ComboBoxMediquin() {
        return ComboBoxMedico;
    }
   
    
    /*public static boolean validarlogin(String username, String password){
        login l = new login(username, password);
        l.validar_login(username, password);
        if(l.validar_login(username,password)){
            return true;
        } else {
            return false;
        }
    }*/
}
