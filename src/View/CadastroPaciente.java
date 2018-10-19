package View;

import Controller.Principal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import util.Formata;

public class CadastroPaciente extends javax.swing.JFrame {

    private void registrarMedico(){
         if (tfSnMedico.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tfNmMedico.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tffCpfMedico.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tftCRM.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tffTelefoneMedico.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tffCelular.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tffRg.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else {
            String nome = tfNmMedico.getText();
            String sobrenome = tfSnMedico.getText();
            String CRM = tftCRM.getText();
            String CPF = tffCpfMedico.getText();
            DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            String Nascimento = fmt.format(this.dtcDataDeNascimento.getDate());
            String Telefone = tffTelefoneMedico.getText();
            String estadocivil = cbEstadoCivilMedico.getSelectedItem().toString();
            String Sexo = cbSexoMed.getSelectedItem().toString();
            String Celular = tffCelular.getText();
            String Email = tfEmailmed.getText();
            String RG = tffRg.getText();
            
            Principal r = new Principal();
            r.registrarMedico(nome, sobrenome, CRM, CPF, Nascimento, Telefone, estadocivil, Sexo, Email, Celular, RG);
        }
    }
    
    private void registrarPaciente(){
         if (tfSnPaciente.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tfNmPaciente.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tffCpf.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tffTelefonePaciente.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tfEmailPac.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (TffCelularPac.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tffRgPac.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else {
            String nome = tfNmPaciente.getText();
            String sobrenome = tfSnPaciente.getText();
            String CPF = tffCpf.getText();
            DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            String Nascimento = fmt.format(this.dtcDataDeNascimentoPac.getDate());
            String Telefone = tffTelefonePaciente.getText();
            String estadocivil = cbEstadoCivil.getSelectedItem().toString();
            String Sexo = cbSexoPac.getSelectedItem().toString();
            String Celular = TffCelularPac.getText();
            String Email = tfEmailPac.getText();
            String RG = tffRgPac.getText();
            
            Principal r = new Principal();
            r.registrarPaciente(nome, sobrenome, CPF, Nascimento, Telefone, estadocivil, Sexo, Email, Celular, RG);
        }
    }
    
    private void setMask(){
        tffCpfMedico.setFormatterFactory(Formata.cpf());
        tffCpf.setFormatterFactory(Formata.cpf());
        tffTelefonePaciente.setFormatterFactory(Formata.telefone());
        tffTelefoneMedico.setFormatterFactory(Formata.telefone());
        TffCelularPac.setFormatterFactory(Formata.celular());
        tffCelular.setFormatterFactory(Formata.celular());
        tffRg.setFormatterFactory(Formata.RG());
        tffRgPac.setFormatterFactory(Formata.RG());
    }
    
    private void LimpaMed(){
        tfSnMedico.setText("");
        tfNmMedico.setText("");
        tffCpfMedico.setText("");
        tftCRM.setText("");
        tffTelefoneMedico.setText("");
    }
    
    private void LimpaPaciente(){
        tfSnMedico.setText("");
        tfNmMedico.setText("");
        tffCpfMedico.setText("");
        tftCRM.setText("");
        tffTelefoneMedico.setText("");
    }
    
    
    /**
     * Creates new form CadastroPaciente
     */
    public CadastroPaciente() {
        initComponents();
        setMask();
    }
    public void tff(){

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        tbCadastros = new javax.swing.JTabbedPane();
        pnPaciente = new javax.swing.JPanel();
        lblDataNascimento = new javax.swing.JLabel();
        lblSexoPaciente = new javax.swing.JLabel();
        tffCpf = new javax.swing.JFormattedTextField();
        lblCpf = new javax.swing.JLabel();
        tfNmPaciente = new javax.swing.JTextField();
        lblNmPaciente = new javax.swing.JLabel();
        tffTelefonePaciente = new javax.swing.JFormattedTextField();
        lblTelefone = new javax.swing.JLabel();
        cbEstadoCivil = new javax.swing.JComboBox<>();
        lblEstadoCivil = new javax.swing.JLabel();
        cbConvenio = new javax.swing.JComboBox<>();
        lblConvenio = new javax.swing.JLabel();
        lbPacientes = new javax.swing.JLabel();
        tfSnPaciente = new javax.swing.JTextField();
        lblSnPaciente = new javax.swing.JLabel();
        lblRg = new javax.swing.JLabel();
        cbSexoPac = new javax.swing.JComboBox<>();
        dtcDataDeNascimentoPac = new com.toedter.calendar.JDateChooser();
        lblCelularPac = new javax.swing.JLabel();
        lblEmailPac = new javax.swing.JLabel();
        tfEmailPac = new javax.swing.JTextField();
        tffRgPac = new javax.swing.JFormattedTextField();
        TffCelularPac = new javax.swing.JFormattedTextField();
        pnMedico = new javax.swing.JPanel();
        tfNmMedico = new javax.swing.JTextField();
        tffCpfMedico = new javax.swing.JFormattedTextField();
        tffTelefoneMedico = new javax.swing.JFormattedTextField();
        cbEstadoCivilMedico = new javax.swing.JComboBox<>();
        cbEspecialidade = new javax.swing.JComboBox<>();
        lblEspecialidade = new javax.swing.JLabel();
        lblEstadoCivil1 = new javax.swing.JLabel();
        lblTelefone1 = new javax.swing.JLabel();
        lblDataNascimento1 = new javax.swing.JLabel();
        lblcdMedico = new javax.swing.JLabel();
        lblNmMedico = new javax.swing.JLabel();
        lblCpf1 = new javax.swing.JLabel();
        lblCRM = new javax.swing.JLabel();
        tftCRM = new javax.swing.JFormattedTextField();
        lbMedicos = new javax.swing.JLabel();
        tfSnMedico = new javax.swing.JTextField();
        lblSnMedico = new javax.swing.JLabel();
        dtcDataDeNascimento = new com.toedter.calendar.JDateChooser();
        lblCelular = new javax.swing.JLabel();
        cbSexoMed = new javax.swing.JComboBox<>();
        lblEmailMed = new javax.swing.JLabel();
        tfEmailmed = new javax.swing.JTextField();
        lblRGMed = new javax.swing.JLabel();
        tffRg = new javax.swing.JFormattedTextField();
        tffCelular = new javax.swing.JFormattedTextField();
        pnbCadastrar = new javax.swing.JPanel();
        lblbCadPaciente = new javax.swing.JLabel();
        lblbCadastrar = new javax.swing.JLabel();
        pnbLimpar = new javax.swing.JPanel();
        lblbLimpar = new javax.swing.JLabel();
        lblLimpar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo.setText("Cadastros");

        lblDataNascimento.setText("Data de nascimento");

        lblSexoPaciente.setText("Sexo do Paciente");

        tffCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        lblCpf.setText("Cpf");

        lblNmPaciente.setText("Nome");

        lblTelefone.setText("Telefone");

        cbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro(a)", "Casado(a)", "Divorciado(a)", "Viúvo(a)", "Separado(a)" }));

        lblEstadoCivil.setText("Estado civil");

        cbConvenio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amil", "NotreDame Intermédica", "Item 3", "Item 4" }));

        lblConvenio.setText("Convenio");

        lbPacientes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbPacientes.setText("Pacientes");

        lblSnPaciente.setText("Sobrenome");

        lblRg.setText("Rg");

        cbSexoPac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        lblCelularPac.setText("Celular");

        lblEmailPac.setText("Email");

        javax.swing.GroupLayout pnPacienteLayout = new javax.swing.GroupLayout(pnPaciente);
        pnPaciente.setLayout(pnPacienteLayout);
        pnPacienteLayout.setHorizontalGroup(
            pnPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfNmPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnPacienteLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblNmPaciente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfSnPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPacienteLayout.createSequentialGroup()
                        .addComponent(lblSnPaciente)
                        .addGap(24, 24, 24)))
                .addGroup(pnPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPacienteLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnPacienteLayout.createSequentialGroup()
                                .addComponent(lblSexoPaciente)
                                .addGap(54, 54, 54)
                                .addComponent(lblEstadoCivil))
                            .addGroup(pnPacienteLayout.createSequentialGroup()
                                .addComponent(tffCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tffRgPac, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addGroup(pnPacienteLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lblCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRg)
                        .addGap(76, 76, 76)))
                .addGroup(pnPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDataNascimento)
                    .addComponent(dtcDataDeNascimentoPac, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPacienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbPacientes)
                .addGap(266, 266, 266))
            .addGroup(pnPacienteLayout.createSequentialGroup()
                .addGroup(pnPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPacienteLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lblTelefone)
                        .addGap(77, 77, 77)
                        .addComponent(lblCelularPac)
                        .addGap(317, 317, 317)
                        .addComponent(lblConvenio))
                    .addGroup(pnPacienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tffTelefonePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TffCelularPac, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbSexoPac, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnPacienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tfEmailPac, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnPacienteLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(lblEmailPac)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnPacienteLayout.setVerticalGroup(
            pnPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPacienteLayout.createSequentialGroup()
                .addComponent(lbPacientes)
                .addGroup(pnPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPacienteLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(pnPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRg)
                            .addComponent(lblDataNascimento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfSnPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfNmPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tffCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tffRgPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dtcDataDeNascimentoPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnPacienteLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSnPaciente)
                            .addComponent(lblNmPaciente)
                            .addComponent(lblCpf))))
                .addGap(18, 18, 18)
                .addGroup(pnPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPacienteLayout.createSequentialGroup()
                        .addGroup(pnPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefone)
                            .addComponent(lblCelularPac)
                            .addComponent(lblSexoPaciente)
                            .addComponent(lblEstadoCivil))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tffTelefonePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSexoPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TffCelularPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblConvenio))
                .addGap(18, 18, 18)
                .addComponent(lblEmailPac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEmailPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        tbCadastros.addTab("Paciente", pnPaciente);

        tffCpfMedico.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        cbEstadoCivilMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro(a)", "Casado(a)", "Divorciado(a)", "Viúvo(a)", "Separado(a)" }));

        cbEspecialidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alergia/Imunologia", "Angiologia", "Cardiologia", "Cirurgia Geral", "Cirurgia Pediátrica", "Cirurgia Plástica", "Clínica Médica", "Dermatologia", "Doenças Infecto-Parasitárias", "DST/AIDS (Doenças Sexualmente Transmissíveis/AIDS)", "Endocrinologia", "Fisiatria/Medicina Esportiva", "Fonoaudiologia", "Gastroenterologia", "Genética", "Geral", "Geriatria", "Ginecologia", "Hematologia", "Homeopatia, Acupuntura e Similares", "Medicina Preventiva e Social", "Medicina do Trabalho", "Nefrologia", "Neurologia", "Nutrição e Dietética", "Obstetrícia", "Odontologia", "Oftalmologia", "Oncologia", "Ortopedia e Traumatologia", "Otorrinolaringologia", "Pediatria", "Psicologia", "Pneumologia/Tisiologia", "Proctologia", "Psiquiatria", "Reumatologia", "Urologia", "Neurocirurgia" }));

        lblEspecialidade.setText("Especialidade");

        lblEstadoCivil1.setText("Estado civil");

        lblTelefone1.setText("Telefone");

        lblDataNascimento1.setText("Data de nascimento");

        lblcdMedico.setText("Sexo do Medico");

        lblNmMedico.setText("Nome");

        lblCpf1.setText("Cpf");

        lblCRM.setText("CRM");

        lbMedicos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbMedicos.setText("Medicos");

        lblSnMedico.setText("Sobrenome");

        lblCelular.setText("Celular");

        cbSexoMed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        lblEmailMed.setText("Email");

        lblRGMed.setText("Rg");

        javax.swing.GroupLayout pnMedicoLayout = new javax.swing.GroupLayout(pnMedico);
        pnMedico.setLayout(pnMedicoLayout);
        pnMedicoLayout.setHorizontalGroup(
            pnMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMedicoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbMedicos)
                .addGap(279, 279, 279))
            .addGroup(pnMedicoLayout.createSequentialGroup()
                .addGroup(pnMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMedicoLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblNmMedico)
                        .addGap(88, 88, 88)
                        .addComponent(lblSnMedico)
                        .addGap(89, 89, 89)
                        .addComponent(lblCpf1)
                        .addGap(107, 107, 107)
                        .addComponent(lblCRM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDataNascimento1))
                    .addGroup(pnMedicoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tfNmMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSnMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tffCpfMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tftCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(dtcDataDeNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMedicoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfEmailmed, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tffRg, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(312, 312, 312))
                    .addGroup(pnMedicoLayout.createSequentialGroup()
                        .addGroup(pnMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnMedicoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnMedicoLayout.createSequentialGroup()
                                        .addComponent(lblTelefone1)
                                        .addGap(77, 77, 77)
                                        .addComponent(lblCelular)
                                        .addGap(53, 53, 53))
                                    .addGroup(pnMedicoLayout.createSequentialGroup()
                                        .addComponent(tffTelefoneMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tffCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                            .addGroup(pnMedicoLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(lblEmailMed)
                                .addGap(145, 145, 145)))
                        .addGroup(pnMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnMedicoLayout.createSequentialGroup()
                                .addComponent(lblRGMed)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnMedicoLayout.createSequentialGroup()
                                .addGroup(pnMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblcdMedico)
                                    .addComponent(cbSexoMed, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnMedicoLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbEstadoCivilMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnMedicoLayout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(lblEstadoCivil1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblEspecialidade)
                                        .addGap(54, 54, 54)))))))
                .addContainerGap())
        );
        pnMedicoLayout.setVerticalGroup(
            pnMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMedicoLayout.createSequentialGroup()
                .addComponent(lbMedicos)
                .addGap(2, 2, 2)
                .addGroup(pnMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNmMedico)
                    .addComponent(lblSnMedico)
                    .addComponent(lblCpf1)
                    .addComponent(lblCRM)
                    .addComponent(lblDataNascimento1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMedicoLayout.createSequentialGroup()
                        .addGroup(pnMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNmMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSnMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tffCpfMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tftCRM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefone1)
                            .addComponent(lblCelular)
                            .addComponent(lblcdMedico)
                            .addComponent(lblEstadoCivil1)
                            .addComponent(lblEspecialidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tffTelefoneMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSexoMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbEstadoCivilMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tffCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(dtcDataDeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailMed)
                    .addComponent(lblRGMed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmailmed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tffRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        tbCadastros.addTab("Medicos", pnMedico);

        pnbCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnbCadastrarMouseClicked(evt);
            }
        });

        lblbCadPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Add_User_Male_50px.png"))); // NOI18N

        lblbCadastrar.setText("Cadastrar");

        javax.swing.GroupLayout pnbCadastrarLayout = new javax.swing.GroupLayout(pnbCadastrar);
        pnbCadastrar.setLayout(pnbCadastrarLayout);
        pnbCadastrarLayout.setHorizontalGroup(
            pnbCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnbCadastrarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnbCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblbCadPaciente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblbCadastrar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pnbCadastrarLayout.setVerticalGroup(
            pnbCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnbCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblbCadPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblbCadastrar))
        );

        pnbLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnbLimparMouseClicked(evt);
            }
        });

        lblbLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Broom_50px.png"))); // NOI18N

        lblLimpar.setText("Limpar");

        javax.swing.GroupLayout pnbLimparLayout = new javax.swing.GroupLayout(pnbLimpar);
        pnbLimpar.setLayout(pnbLimparLayout);
        pnbLimparLayout.setHorizontalGroup(
            pnbLimparLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnbLimparLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnbLimparLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblbLimpar)
                    .addGroup(pnbLimparLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblLimpar)))
                .addGap(28, 28, 28))
        );
        pnbLimparLayout.setVerticalGroup(
            pnbLimparLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnbLimparLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblbLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLimpar))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tbCadastros, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(pnbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbCadastros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnbCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tbCadastros.getAccessibleContext().setAccessibleName("Pacientes");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnbCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnbCadastrarMouseClicked
        // TODO add your handling code here:
        if (tbCadastros.getSelectedComponent()==pnPaciente) registrarPaciente();
        
        else if (tbCadastros.getSelectedComponent()==pnMedico) registrarMedico();
    }//GEN-LAST:event_pnbCadastrarMouseClicked

    private void pnbLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnbLimparMouseClicked
        // TODO add your handling code here:
         if (tbCadastros.getSelectedComponent()==pnPaciente) LimpaPaciente();
            
         else if (tbCadastros.getSelectedComponent()==pnMedico) LimpaMed();
    }//GEN-LAST:event_pnbLimparMouseClicked

     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField TffCelularPac;
    private javax.swing.JComboBox<String> cbConvenio;
    private javax.swing.JComboBox<String> cbEspecialidade;
    private javax.swing.JComboBox<String> cbEstadoCivil;
    private javax.swing.JComboBox<String> cbEstadoCivilMedico;
    private javax.swing.JComboBox<String> cbSexoMed;
    private javax.swing.JComboBox<String> cbSexoPac;
    private com.toedter.calendar.JDateChooser dtcDataDeNascimento;
    private com.toedter.calendar.JDateChooser dtcDataDeNascimentoPac;
    private javax.swing.JLabel lbMedicos;
    private javax.swing.JLabel lbPacientes;
    private javax.swing.JLabel lblCRM;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCelularPac;
    private javax.swing.JLabel lblConvenio;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblCpf1;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblDataNascimento1;
    private javax.swing.JLabel lblEmailMed;
    private javax.swing.JLabel lblEmailPac;
    private javax.swing.JLabel lblEspecialidade;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblEstadoCivil1;
    private javax.swing.JLabel lblLimpar;
    private javax.swing.JLabel lblNmMedico;
    private javax.swing.JLabel lblNmPaciente;
    private javax.swing.JLabel lblRGMed;
    private javax.swing.JLabel lblRg;
    private javax.swing.JLabel lblSexoPaciente;
    private javax.swing.JLabel lblSnMedico;
    private javax.swing.JLabel lblSnPaciente;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTelefone1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblbCadPaciente;
    private javax.swing.JLabel lblbCadastrar;
    private javax.swing.JLabel lblbLimpar;
    private javax.swing.JLabel lblcdMedico;
    private javax.swing.JPanel pnMedico;
    private javax.swing.JPanel pnPaciente;
    private javax.swing.JPanel pnbCadastrar;
    private javax.swing.JPanel pnbLimpar;
    private javax.swing.JTabbedPane tbCadastros;
    private javax.swing.JTextField tfEmailPac;
    private javax.swing.JTextField tfEmailmed;
    private javax.swing.JTextField tfNmMedico;
    private javax.swing.JTextField tfNmPaciente;
    private javax.swing.JTextField tfSnMedico;
    private javax.swing.JTextField tfSnPaciente;
    private javax.swing.JFormattedTextField tffCelular;
    private javax.swing.JFormattedTextField tffCpf;
    private javax.swing.JFormattedTextField tffCpfMedico;
    private javax.swing.JFormattedTextField tffRg;
    private javax.swing.JFormattedTextField tffRgPac;
    private javax.swing.JFormattedTextField tffTelefoneMedico;
    private javax.swing.JFormattedTextField tffTelefonePaciente;
    private javax.swing.JFormattedTextField tftCRM;
    // End of variables declaration//GEN-END:variables
}
