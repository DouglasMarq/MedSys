package Model;

import dao.ConsultaDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Consulta {
    
    private String Consulta;
    private String Status;
    private String DataConsulta;
    private String PacienteNome;
    private String PacienteSobrenome;
    private String MedicoNome;
    private String MedicoSobrenome;
    private String QueixaPaciente;
    private String ExameFisico;
    private String sid;
    private String Conduta;
    
    
    //protected DefaultTableModel ConsultasAbertas = new DefaultTableModel(new String[]{"Codigo da Consulta","Status","Data da Consulta","Paciente","Sobrenome","Medico","Sobrenome"}, 0);
    protected DefaultTableModel ConsultasFechadas = new DefaultTableModel(new String[]{"Codigo da Consulta","Status","Data da Consulta","Paciente","Sobrenome","Medico","Sobrenome"}, 0);
    protected ArrayList<String> ComboBoxMedico = new ArrayList<String>();
    
    public DefaultTableModel TableConsulta(){
        DefaultTableModel ConsultasAbertas = new DefaultTableModel(new String[]{"Codigo da Consulta","Status","Data da Consulta","Paciente","Sobrenome","Medico","Sobrenome"}, 0);
        //DefaultTableModel ConsultasFechadas = new DefaultTableModel(new String[]{"Codigo da Consulta","Status","Data da Consulta","Paciente","Sobrenome","Medico","Sobrenome"}, 0);
        
        ConsultaDao cd = new ConsultaDao();

        for (Consulta ca : cd.read()) {
            if(ca.getStatus().equals("Aberto")){
                ConsultasAbertas.addRow(new String[]{ca.getConsulta(),ca.getStatus(),ca.getDataConsulta(),ca.getPacienteNome(),ca.getPacienteSobrenome(),ca.getMedicoNome(),ca.getMedicoSobrenome()});
            } else {
               ConsultasFechadas.addRow(new String[]{ca.getConsulta(),ca.getStatus(),ca.getDataConsulta(),ca.getPacienteNome(),ca.getPacienteSobrenome(),ca.getMedicoNome(),ca.getMedicoSobrenome()}); 
            }
            ComboBoxMedico.add(ca.getMedicoNome());
        }
        return ConsultasAbertas;
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

    
    
    public DefaultTableModel CFechado(){
        return ConsultasFechadas;
    }
    
    public ArrayList<String> ComboBoxMediquin(){
        return ComboBoxMedico;
    }
    
    public Consulta(String Consulta, String Status, String DataConsulta, String PacienteNome, String PacienteSobrenome, String MedicoNome, String MedicoSobrenome) {
        setConsulta(Consulta);
        setStatus(Status);
        setDataConsulta(DataConsulta);
        setPacienteNome(PacienteNome);
        setPacienteSobrenome(PacienteSobrenome);
        setMedicoNome(MedicoNome);
        setMedicoSobrenome(MedicoSobrenome);
    }
    
    public Consulta(String Consulta, String Status, String DataConsulta, String QueixaPaciente, String PacienteNome, String PacienteSobrenome, String MedicoNome, String MedicoSobrenome) {
        setConsulta(Consulta);
        setStatus(Status);
        setDataConsulta(DataConsulta);
        setQueixaPaciente(QueixaPaciente);
        setPacienteNome(PacienteNome);
        setPacienteSobrenome(PacienteSobrenome);
        setMedicoNome(MedicoNome);
        setMedicoSobrenome(MedicoSobrenome);
    }
    
    public Consulta(String Consulta, String Status, String DataConsulta, String QueixaPaciente,String ExameFisico, String Conduta, String sid, String PacienteNome, String PacienteSobrenome, String MedicoNome, String MedicoSobrenome) {
        setConsulta(Consulta);
        setStatus(Status);
        setDataConsulta(DataConsulta);
        setQueixaPaciente(QueixaPaciente);
        setExameFisico(ExameFisico);
        setConduta(Conduta);
        setSid(sid);
        setPacienteNome(PacienteNome);
        setPacienteSobrenome(PacienteSobrenome);
        setMedicoNome(MedicoNome);
        setMedicoSobrenome(MedicoSobrenome);
    }
    
    public Consulta(String Status, String DataConsulta, String QueixaPaciente,String ExameFisico, String Conduta, String sid, String PacienteNome, String PacienteSobrenome, String MedicoNome, String MedicoSobrenome) {
        setStatus(Status);
        setDataConsulta(DataConsulta);
        setQueixaPaciente(QueixaPaciente);
        setExameFisico(ExameFisico);
        setConduta(Conduta);
        setSid(sid);
        setPacienteNome(PacienteNome);
        setPacienteSobrenome(PacienteSobrenome);
        setMedicoNome(MedicoNome);
        setMedicoSobrenome(MedicoSobrenome);
    }
    
    public Consulta(String MedicoNome, String MedicoSobrenome) {
        setMedicoNome(MedicoNome);
        setMedicoSobrenome(MedicoSobrenome);
    }

    /**
     * @return the Consulta
     */
    public String getConsulta() {
        return Consulta;
    }

    /**
     * @param Consulta the Consulta to set
     */
    public void setConsulta(String Consulta) {
        this.Consulta = Consulta;
    }

    /**
     * @return the Status
     */
    public String getStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * @return the DataConsulta
     */
    public String getDataConsulta() {
        return DataConsulta;
    }

    /**
     * @param DataConsulta the DataConsulta to set
     */
    public void setDataConsulta(String DataConsulta) {
        this.DataConsulta = DataConsulta;
    }

    /**
     * @return the PacienteNome
     */
    public String getPacienteNome() {
        return PacienteNome;
    }

    /**
     * @param PacienteNome the PacienteNome to set
     */
    public void setPacienteNome(String PacienteNome) {
        this.PacienteNome = PacienteNome;
    }

    /**
     * @return the PacienteSobrenome
     */
    public String getPacienteSobrenome() {
        return PacienteSobrenome;
    }

    /**
     * @param PacienteSobrenome the PacienteSobrenome to set
     */
    public void setPacienteSobrenome(String PacienteSobrenome) {
        this.PacienteSobrenome = PacienteSobrenome;
    }

    /**
     * @return the MedicoNome
     */
    public String getMedicoNome() {
        return MedicoNome;
    }

    /**
     * @param MedicoNome the MedicoNome to set
     */
    public void setMedicoNome(String MedicoNome) {
        this.MedicoNome = MedicoNome;
    }

    /**
     * @return the MedicoSobrenome
     */
    public String getMedicoSobrenome() {
        return MedicoSobrenome;
    }

    /**
     * @param MedicoSobrenome the MedicoSobrenome to set
     */
    public void setMedicoSobrenome(String MedicoSobrenome) {
        this.MedicoSobrenome = MedicoSobrenome;
    }

    /**
     * @return the QueixaPaciente
     */
    public String getQueixaPaciente() {
        return QueixaPaciente;
    }

    /**
     * @param QueixaPaciente the QueixaPaciente to set
     */
    public void setQueixaPaciente(String QueixaPaciente) {
        this.QueixaPaciente = QueixaPaciente;
    }

    /**
     * @return the ExameFisico
     */
    public String getExameFisico() {
        return ExameFisico;
    }

    /**
     * @param ExameFisico the ExameFisico to set
     */
    public void setExameFisico(String ExameFisico) {
        this.ExameFisico = ExameFisico;
    }

    /**
     * @return the sid
     */
    public String getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(String sid) {
        this.sid = sid;
    }

    /**
     * @return the Conduta
     */
    public String getConduta() {
        return Conduta;
    }

    /**
     * @param Conduta the Conduta to set
     */
    public void setConduta(String Conduta) {
        this.Conduta = Conduta;
    }
    
    public void gravar() {
		ConsultaDao dao = new ConsultaDao();
		int valida = dao.create(this);

		if (valida != 1) {
			
			String message = "Cadastro não Concluido";
			String erro = "Erro!!";

			JOptionPane.showMessageDialog(null, message, erro, JOptionPane.ERROR_MESSAGE);
                        JOptionPane.showMessageDialog(null, "Ocorreu um erro no cadastro, verifique...");
		} else JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
	}
    
    public List<Consulta> buscar() {
		ConsultaDao dao = new ConsultaDao();
		return dao.read();	
	}
    
    	public void regravar() {
		ConsultaDao dao = new ConsultaDao();
		/*int valida = dao.update(this.getId(), this);
		
		if (valida != 1) {
			String message = "Recadastro não concluido";
			String erro = "Erro!!";

			JOptionPane.showMessageDialog(null, message, erro, JOptionPane.ERROR_MESSAGE);
		}*/
	}
    
    /*public List<Consulta> buscar() {
	ConsultaDao dao = new ConsultaDao();
        return dao.read();	
    }*/
	
    public Consulta buscaUm(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  
}
