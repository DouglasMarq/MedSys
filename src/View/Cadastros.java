package View;

import Model.Endereco;
import Model.EstadoCivil;
import Model.Medico;
import Model.Operador;
import Model.Paciente;
import Model.Sexo;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import util.Botoes;
import util.Formata;

public class Cadastros extends javax.swing.JFrame {

    private void registrarMedico() {
        if (tfSnMed.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tfNmMed.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tffCpfMed.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tftCRM.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (TffCelularMed.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tffCelularMed.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tffRgMed.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else {

            String nome = tfNmMed.getText();
            String sobrenome = tfSnMed.getText();
            String CRM = tftCRM.getText();
            String CPF = tffCpfMed.getText();
            DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            String Nascimento = fmt.format(this.dtcDataDeNascimentoMed.getDate());
            String Telefone = TffCelularMed.getText();
            String estadocivil = cbEstadoCivilMedico.getSelectedItem().toString().toUpperCase();
            String sexo = cbSexoMed.getSelectedItem().toString().toUpperCase();
            String Celular = tffCelularMed.getText();
            String Email = tfEmailMed.getText();
            String RG = tffRgMed.getText();
            String logradouro = tfRuaMed.getText();
            String numero = tfNumeroMed.getText();
            String complemento = tfComplementoMed.getText();
            String cidade = tfCidadeMed.getText();
            String bairro = tfBairroMed.getText();
            int cep = Integer.parseInt(tffCepMed.getText());
            String login = tfUsuarioMed.getText();
            String senha = String.valueOf(pfSenhaMed.getPassword());

            Endereco endereco = new Endereco(logradouro, numero, complemento, bairro, cidade, cep);
            Medico medico = new Medico(CRM, login, senha, 10, nome, sobrenome, RG, CPF, Nascimento, endereco, Celular, Telefone, Email, EstadoCivil.valueOf(estadocivil), Sexo.valueOf(sexo));
            medico.gravar();

        }
    }

    private void registrarPaciente() {
        if (tfSnPaciente.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tfNmPaciente.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tffCpfPaciente.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (TffTelefonePaciente.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tfEmailPaciente.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (TffCelularPaciente.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else if (tffRgPaciente.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Há campos vazios");
        } else {

            String nome = tfNmPaciente.getText();
            String sobrenome = tfSnPaciente.getText();
            String CPF = tffCpfPaciente.getText();
            DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            String Nascimento = fmt.format(this.dtcDataDeNascimentoPaciente.getDate());
            String Telefone = TffTelefonePaciente.getText();
            String estadocivil = cbEstadoCivil.getSelectedItem().toString().toUpperCase();
            String sexo = cbSexoPac.getSelectedItem().toString().toUpperCase();
            String convenio = cbConvenio.getSelectedItem().toString();
            String Celular = TffCelularPaciente.getText();
            String Email = tfEmailPaciente.getText();
            String RG = tffRgPaciente.getText();
            String logradouro = tfRuaPaciente.getText();
            String numero = tfNumeroPaciente.getText();
            String complemento = tfComplementoPaciente.getText();
            String cidade = tfCidadePaciente.getText();
            String bairro = tfBairroPaciente.getText();
            int cep = Integer.parseInt(tffCepPaciente.getText());

            Endereco endereco = new Endereco(logradouro, numero, complemento, bairro, cidade, cep);
            Paciente paciente = new Paciente(convenio, nome, sobrenome, RG, CPF, Nascimento, endereco, Celular, Telefone, Email, EstadoCivil.valueOf(estadocivil), Sexo.valueOf(sexo));
            paciente.gravar();

        }
    }

    private void registrarOperador() {
        String nome = tfNmOperador.getText();
        String sobrenome = tfSnOperador.getText();
        String CPF = tffCpfOperador.getText();
        DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        String Nascimento = fmt.format(this.dtcDataDeNascimentoOperador.getDate());
        String Telefone = tffCelularOperador.getText();
        String estadocivil = cbEstadoCivilOperador.getSelectedItem().toString();
        String sexo = cbSexoOperador.getSelectedItem().toString();
        String Celular = tffCelularOperador.getText();
        String Email = tfEmailOperador.getText();
        String RG = tffRgOperador.getText();
        String logradouro = tfRuaOperador.getText();
        String numero = tfNumeroOperador.getText();
        String complemento = tfComplementoOperador.getText();
        String cidade = tfCidadeOperador.getText();
        String bairro = tfBairroOperador.getText();
        int cep = Integer.parseInt(tffCepOperador.getText());
        String login = tfUserOperador.getText();
        String senha = String.valueOf(pfSenhaOperador.getPassword());
        
        Endereco endereco = new Endereco(logradouro, numero, complemento, bairro, cidade, cep);
        Operador operador = new Operador(login, senha, 20, nome, sobrenome, RG, CPF, Nascimento, endereco, Celular, Telefone, Email, EstadoCivil.valueOf(estadocivil), Sexo.valueOf(sexo));
        operador.gravar();
    }

    private void setMask() {
        tffCpfMed.setFormatterFactory(Formata.cpf());
        tffCpfPaciente.setFormatterFactory(Formata.cpf());
        TffTelefonePaciente.setFormatterFactory(Formata.telefone());
        TffCelularMed.setFormatterFactory(Formata.telefone());
        TffCelularPaciente.setFormatterFactory(Formata.celular());
        tffCelularMed.setFormatterFactory(Formata.celular());
        tffRgMed.setFormatterFactory(Formata.RG());
        tffRgPaciente.setFormatterFactory(Formata.RG());
    }

    private void LimpaMed() {
	        tfSnMed.setText("");
		tfNmMed.setText("");
		tffCpfMed.setText("");
		TffCelularMed.setText("");
                tffRgMed.setText("");
                dtcDataDeNascimentoMed.cleanup();
                TffCelularMed.setText("");
                tfEmailMed.setText("");
                tfRuaMed.setText("");
                tfNumeroMed.setText("");
                tfComplementoMed.setText("");
                tfCidadeMed.setText("");
                tfBairroMed.setText("");
                tffCepMed.setText("");
                tfUsuarioMed.setText("");
                pfSenhaMed.setText("");
                tftCRM.setText("");
    }

    private void LimpaPaciente() {
		tfSnPaciente.setText("");
		tfNmPaciente.setText("");
		tffCpfPaciente.setText("");
		TffTelefonePaciente.setText("");
                tffRgPaciente.setText("");
                dtcDataDeNascimentoPaciente.cleanup();
                TffTelefonePaciente.setText("");
                tfEmailPaciente.setText("");
                tfRuaPaciente.setText("");
                tfNumeroPaciente.setText("");
                tfComplementoPaciente.setText("");
                tfCidadePaciente.setText("");
                tfBairroPaciente.setText("");
                tffCepPaciente.setText("");
    }
    
        private void LimpaOperador() {
		tfSnOperador.setText("");
		tfNmOperador.setText("");
		tffCpfOperador.setText("");
		tffTelefoneOperador.setText("");
                tffRgOperador.setText("");
                dtcDataDeNascimentoOperador.cleanup();
                tffCelularOperador.setText("");
                tfEmailOperador.setText("");
                tfRuaOperador.setText("");
                tfNumeroOperador.setText("");
                tfComplementoOperador.setText("");
                tfCidadeOperador.setText("");
                tfBairroOperador.setText("");
                tffCepOperador.setText("");
                tfUserOperador.setText("");
                pfSenhaOperador.setText("");
    }

    /**
     * Creates new form CadastroPaciente
     */
    public Cadastros() {
        initComponents();
        setMask();
        centralizarComponente();
    }

    public void centralizarComponente() {
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dw = getSize();
        setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
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
        tffCpfPaciente = new javax.swing.JFormattedTextField();
        lblCpf = new javax.swing.JLabel();
        tfNmPaciente = new javax.swing.JTextField();
        lblNmPaciente = new javax.swing.JLabel();
        TffTelefonePaciente = new javax.swing.JFormattedTextField();
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
        dtcDataDeNascimentoPaciente = new com.toedter.calendar.JDateChooser();
        lblCelularPac = new javax.swing.JLabel();
        lblEmailPac = new javax.swing.JLabel();
        tfEmailPaciente = new javax.swing.JTextField();
        tffRgPaciente = new javax.swing.JFormattedTextField();
        TffCelularPaciente = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        lblRuaPac = new javax.swing.JLabel();
        lblNumeroPac = new javax.swing.JLabel();
        lblComplementoPac = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lblCep = new javax.swing.JLabel();
        tfRuaPaciente = new javax.swing.JTextField();
        tfNumeroPaciente = new javax.swing.JTextField();
        tfComplementoPaciente = new javax.swing.JTextField();
        tfCidadePaciente = new javax.swing.JTextField();
        tfBairroPaciente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tffCepPaciente = new javax.swing.JFormattedTextField();
        pnMedico = new javax.swing.JPanel();
        tfNmMed = new javax.swing.JTextField();
        tffCpfMed = new javax.swing.JFormattedTextField();
        TffCelularMed = new javax.swing.JFormattedTextField();
        cbEstadoCivilMedico = new javax.swing.JComboBox<>();
        cbEspecialidade = new javax.swing.JComboBox<>();
        lblEspecialidade = new javax.swing.JLabel();
        lblEstadoCivil1 = new javax.swing.JLabel();
        lblTelefoneMed = new javax.swing.JLabel();
        lblDataNascimentoMed = new javax.swing.JLabel();
        lblSexMed = new javax.swing.JLabel();
        lblNmMed = new javax.swing.JLabel();
        lblCpfMed = new javax.swing.JLabel();
        lblCRM = new javax.swing.JLabel();
        tftCRM = new javax.swing.JFormattedTextField();
        lbMedicos = new javax.swing.JLabel();
        tfSnMed = new javax.swing.JTextField();
        lblSnMed = new javax.swing.JLabel();
        dtcDataDeNascimentoMed = new com.toedter.calendar.JDateChooser();
        lblCelularMed = new javax.swing.JLabel();
        cbSexoMed = new javax.swing.JComboBox<>();
        lblEmailMed = new javax.swing.JLabel();
        tfEmailMed = new javax.swing.JTextField();
        lblRGMed = new javax.swing.JLabel();
        tffRgMed = new javax.swing.JFormattedTextField();
        tffCelularMed = new javax.swing.JFormattedTextField();
        pnAcesso = new javax.swing.JPanel();
        lblAcesso = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        tfUsuarioMed = new javax.swing.JTextField();
        pfSenhaMed = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        lblRuaMed = new javax.swing.JLabel();
        lblNumeroMed = new javax.swing.JLabel();
        lblComplementoMed = new javax.swing.JLabel();
        lblBairroMed = new javax.swing.JLabel();
        lblCidadeMed = new javax.swing.JLabel();
        lblCepMed = new javax.swing.JLabel();
        tfRuaMed = new javax.swing.JTextField();
        tfNumeroMed = new javax.swing.JTextField();
        tfComplementoMed = new javax.swing.JTextField();
        tfCidadeMed = new javax.swing.JTextField();
        tfBairroMed = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tffCepMed = new javax.swing.JFormattedTextField();
        pnOperador = new javax.swing.JPanel();
        tfNmOperador = new javax.swing.JTextField();
        tffCpfOperador = new javax.swing.JFormattedTextField();
        tffTelefoneOperador = new javax.swing.JFormattedTextField();
        cbEstadoCivilOperador = new javax.swing.JComboBox<>();
        lblEstadoCivilOp = new javax.swing.JLabel();
        lblTelefoneOp = new javax.swing.JLabel();
        lblDataNascimentoOp = new javax.swing.JLabel();
        lblSexOp = new javax.swing.JLabel();
        lbOpNome = new javax.swing.JLabel();
        lbCpfOp = new javax.swing.JLabel();
        lbOperador = new javax.swing.JLabel();
        tfSnOperador = new javax.swing.JTextField();
        lbSnOp = new javax.swing.JLabel();
        dtcDataDeNascimentoOperador = new com.toedter.calendar.JDateChooser();
        lblCelularOp = new javax.swing.JLabel();
        cbSexoOperador = new javax.swing.JComboBox<>();
        lblEmailOp = new javax.swing.JLabel();
        tfEmailOperador = new javax.swing.JTextField();
        lblRGOp = new javax.swing.JLabel();
        tffRgOperador = new javax.swing.JFormattedTextField();
        tffCelularOperador = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfUserOperador = new javax.swing.JTextField();
        pfSenhaOperador = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        lblRuaOp = new javax.swing.JLabel();
        lblNumeroOp = new javax.swing.JLabel();
        lblComplementoOp = new javax.swing.JLabel();
        lblBairroOp = new javax.swing.JLabel();
        lblCidadeOp = new javax.swing.JLabel();
        lblCepOp = new javax.swing.JLabel();
        tfRuaOperador = new javax.swing.JTextField();
        tfNumeroOperador = new javax.swing.JTextField();
        tfComplementoOperador = new javax.swing.JTextField();
        tfCidadeOperador = new javax.swing.JTextField();
        tfBairroOperador = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tffCepOperador = new javax.swing.JFormattedTextField();
        lblbCadPaciente = new javax.swing.JLabel();
        lblbLimpar = new javax.swing.JLabel();

        setTitle("Cadastros");
        setBackground(new java.awt.Color(102, 102, 102));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo.setText("Cadastros");

        lblDataNascimento.setText("Data de nascimento");

        lblSexoPaciente.setText("Sexo do Paciente");

        tffCpfPaciente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        lblCpf.setText("Cpf");

        lblNmPaciente.setText("Nome");

        lblTelefone.setText("Telefone");

        cbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Divorciado", "Viúvo", "Separado" }));
        cbEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoCivilActionPerformed(evt);
            }
        });

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

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblRuaPac.setText("Rua");

        lblNumeroPac.setText("Numero");

        lblComplementoPac.setText("Complemento");

        lblBairro.setText("Bairro");

        lblCidade.setText("Cidade");

        lblCep.setText("Cep");

        jLabel4.setText("Endereço");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(lblCidade)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfRuaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(lblRuaPac)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(lblNumeroPac)
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblBairro)
                                    .addComponent(tfNumeroPaciente))
                                .addGap(42, 42, 42)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblComplementoPac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfComplementoPaciente))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(lblCep)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tfCidadePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfBairroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tffCepPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRuaPac)
                    .addComponent(lblNumeroPac)
                    .addComponent(lblComplementoPac))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfRuaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumeroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfComplementoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(lblBairro)
                    .addComponent(lblCep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCidadePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBairroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tffCepPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

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
                                .addComponent(tffCpfPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tffRgPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnPacienteLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lblCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRg)
                        .addGap(76, 76, 76)))
                .addGroup(pnPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDataNascimento)
                    .addComponent(dtcDataDeNascimentoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPacienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbPacientes)
                .addGap(266, 266, 266))
            .addGroup(pnPacienteLayout.createSequentialGroup()
                .addGroup(pnPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPacienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TffTelefonePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TffCelularPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnPacienteLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(lblEmailPac))
                    .addGroup(pnPacienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tfEmailPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPacienteLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cbSexoPac, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPacienteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(pnPacienteLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblTelefone)
                .addGap(77, 77, 77)
                .addComponent(lblCelularPac)
                .addGap(317, 317, 317)
                .addComponent(lblConvenio)
                .addContainerGap(70, Short.MAX_VALUE))
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
                                .addComponent(tffCpfPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tffRgPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dtcDataDeNascimentoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(TffTelefonePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSexoPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TffCelularPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblConvenio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPacienteLayout.createSequentialGroup()
                        .addComponent(lblEmailPac)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEmailPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbCadastros.addTab("Paciente", pnPaciente);

        tffCpfMed.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        cbEstadoCivilMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Divorciado", "Viúvo", "Separado" }));

        cbEspecialidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alergia/Imunologia", "Angiologia", "Cardiologia", "Cirurgia Geral", "Cirurgia Pediátrica", "Cirurgia Plástica", "Clínica Médica", "Dermatologia", "Doenças Infecto-Parasitárias", "DST/AIDS (Doenças Sexualmente Transmissíveis/AIDS)", "Endocrinologia", "Fisiatria/Medicina Esportiva", "Fonoaudiologia", "Gastroenterologia", "Genética", "Geral", "Geriatria", "Ginecologia", "Hematologia", "Homeopatia, Acupuntura e Similares", "Medicina Preventiva e Social", "Medicina do Trabalho", "Nefrologia", "Neurologia", "Nutrição e Dietética", "Obstetrícia", "Odontologia", "Oftalmologia", "Oncologia", "Ortopedia e Traumatologia", "Otorrinolaringologia", "Pediatria", "Psicologia", "Pneumologia/Tisiologia", "Proctologia", "Psiquiatria", "Reumatologia", "Urologia", "Neurocirurgia" }));

        lblEspecialidade.setText("Especialidade");

        lblEstadoCivil1.setText("Estado civil");

        lblTelefoneMed.setText("Telefone");

        lblDataNascimentoMed.setText("Data de nascimento");

        lblSexMed.setText("Sexo do Medico");

        lblNmMed.setText("Nome");

        lblCpfMed.setText("Cpf");

        lblCRM.setText("CRM");

        lbMedicos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbMedicos.setText("Medicos");

        lblSnMed.setText("Sobrenome");

        lblCelularMed.setText("Celular");

        cbSexoMed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        lblEmailMed.setText("Email");

        lblRGMed.setText("Rg");

        pnAcesso.setBackground(new java.awt.Color(153, 153, 153));

        lblAcesso.setText("Acesso");

        lblUsuario.setText("Usuario");

        lblSenha.setText("Senha");

        javax.swing.GroupLayout pnAcessoLayout = new javax.swing.GroupLayout(pnAcesso);
        pnAcesso.setLayout(pnAcessoLayout);
        pnAcessoLayout.setHorizontalGroup(
            pnAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnAcessoLayout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(lblAcesso)
                .addGap(83, 83, 83))
            .addGroup(pnAcessoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnAcessoLayout.createSequentialGroup()
                        .addComponent(lblUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfUsuarioMed))
                    .addGroup(pnAcessoLayout.createSequentialGroup()
                        .addComponent(lblSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pfSenhaMed)))
                .addContainerGap())
        );
        pnAcessoLayout.setVerticalGroup(
            pnAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAcessoLayout.createSequentialGroup()
                .addComponent(lblAcesso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(tfUsuarioMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha)
                    .addComponent(pfSenhaMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblRuaMed.setText("Rua");

        lblNumeroMed.setText("Numero");

        lblComplementoMed.setText("Complemento");

        lblBairroMed.setText("Bairro");

        lblCidadeMed.setText("Cidade");

        lblCepMed.setText("Cep");

        jLabel5.setText("Endereço");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfRuaMed, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(lblRuaMed))
                            .addComponent(tfCidadeMed, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblCidadeMed)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblBairroMed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCepMed)
                        .addGap(41, 41, 41))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfBairroMed, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(lblNumeroMed)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(tfNumeroMed)
                                .addGap(42, 42, 42)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblComplementoMed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfComplementoMed))
                                .addGap(0, 13, Short.MAX_VALUE))
                            .addComponent(tffCepMed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRuaMed)
                    .addComponent(lblNumeroMed)
                    .addComponent(lblComplementoMed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfRuaMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumeroMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfComplementoMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidadeMed)
                    .addComponent(lblBairroMed)
                    .addComponent(lblCepMed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCidadeMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBairroMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tffCepMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

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
                        .addComponent(lblNmMed)
                        .addGap(88, 88, 88)
                        .addComponent(lblSnMed)
                        .addGap(89, 89, 89)
                        .addComponent(lblCpfMed)
                        .addGap(107, 107, 107)
                        .addComponent(lblCRM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDataNascimentoMed))
                    .addGroup(pnMedicoLayout.createSequentialGroup()
                        .addGroup(pnMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnMedicoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnMedicoLayout.createSequentialGroup()
                                        .addComponent(lblTelefoneMed)
                                        .addGap(77, 77, 77)
                                        .addComponent(lblCelularMed)
                                        .addGap(53, 53, 53))
                                    .addGroup(pnMedicoLayout.createSequentialGroup()
                                        .addComponent(TffCelularMed, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tffCelularMed, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                            .addGroup(pnMedicoLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(lblEmailMed)
                                .addGap(145, 145, 145)))
                        .addGroup(pnMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnMedicoLayout.createSequentialGroup()
                                .addGroup(pnMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSexMed)
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
                                        .addGap(54, 54, 54))))
                            .addGroup(pnMedicoLayout.createSequentialGroup()
                                .addComponent(lblRGMed)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pnMedicoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfEmailMed, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tffRgMed, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(312, 312, 312))
                    .addGroup(pnMedicoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tfNmMed, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSnMed, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tffCpfMed, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tftCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(dtcDataDeNascimentoMed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnMedicoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnMedicoLayout.setVerticalGroup(
            pnMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMedicoLayout.createSequentialGroup()
                .addComponent(lbMedicos)
                .addGap(2, 2, 2)
                .addGroup(pnMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNmMed)
                    .addComponent(lblSnMed)
                    .addComponent(lblCpfMed)
                    .addComponent(lblCRM)
                    .addComponent(lblDataNascimentoMed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMedicoLayout.createSequentialGroup()
                        .addGroup(pnMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNmMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSnMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tffCpfMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tftCRM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefoneMed)
                            .addComponent(lblCelularMed)
                            .addComponent(lblSexMed)
                            .addComponent(lblEstadoCivil1)
                            .addComponent(lblEspecialidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TffCelularMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSexoMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbEstadoCivilMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tffCelularMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(dtcDataDeNascimentoMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMedicoLayout.createSequentialGroup()
                        .addGroup(pnMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmailMed)
                            .addComponent(lblRGMed))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfEmailMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tffRgMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        tbCadastros.addTab("Medicos", pnMedico);

        tffCpfOperador.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        cbEstadoCivilOperador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Divorciado", "Viúvo", "Separado" }));

        lblEstadoCivilOp.setText("Estado civil");

        lblTelefoneOp.setText("Telefone");

        lblDataNascimentoOp.setText("Data de nascimento");

        lblSexOp.setText("Sexo");

        lbOpNome.setText("Nome");

        lbCpfOp.setText("Cpf");

        lbOperador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbOperador.setText("Operador");

        lbSnOp.setText("Sobrenome");

        lblCelularOp.setText("Celular");

        cbSexoOperador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        lblEmailOp.setText("Email");

        lblRGOp.setText("Rg");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setText("Acesso");

        jLabel2.setText("Usuario");

        jLabel3.setText("Senha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(83, 83, 83))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfUserOperador))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pfSenhaOperador)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfUserOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pfSenhaOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblRuaOp.setText("Rua");

        lblNumeroOp.setText("Numero");

        lblComplementoOp.setText("Complemento");

        lblBairroOp.setText("Bairro");

        lblCidadeOp.setText("Cidade");

        lblCepOp.setText("Cep");

        jLabel6.setText("Endereço");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfRuaOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(lblRuaOp))
                            .addComponent(tfCidadeOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblCidadeOp)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfBairroOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(lblNumeroOp)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(tfNumeroOperador)
                                .addGap(42, 42, 42)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tffCepOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfComplementoOperador, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblComplementoOp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblBairroOp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCepOp)
                        .addGap(53, 53, 53))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRuaOp)
                    .addComponent(lblNumeroOp)
                    .addComponent(lblComplementoOp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfRuaOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumeroOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfComplementoOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidadeOp)
                    .addComponent(lblBairroOp)
                    .addComponent(lblCepOp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCidadeOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBairroOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tffCepOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnOperadorLayout = new javax.swing.GroupLayout(pnOperador);
        pnOperador.setLayout(pnOperadorLayout);
        pnOperadorLayout.setHorizontalGroup(
            pnOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnOperadorLayout.createSequentialGroup()
                .addGroup(pnOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnOperadorLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lbOpNome)
                        .addGap(88, 88, 88)
                        .addComponent(lbSnOp)
                        .addGap(89, 89, 89)
                        .addComponent(lbCpfOp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRGOp)
                        .addGap(70, 70, 70)
                        .addComponent(lblDataNascimentoOp))
                    .addGroup(pnOperadorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tfNmOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSnOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tffCpfOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tffRgOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dtcDataDeNascimentoOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnOperadorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnOperadorLayout.createSequentialGroup()
                                .addGroup(pnOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnOperadorLayout.createSequentialGroup()
                                        .addComponent(lblTelefoneOp)
                                        .addGap(77, 77, 77)
                                        .addComponent(lblCelularOp)
                                        .addGap(53, 53, 53))
                                    .addGroup(pnOperadorLayout.createSequentialGroup()
                                        .addComponent(tffTelefoneOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tffCelularOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(pnOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnOperadorLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblEmailOp)
                                        .addGap(71, 71, 71))
                                    .addGroup(pnOperadorLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfEmailOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(pnOperadorLayout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(pnOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnOperadorLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(lblSexOp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblEstadoCivilOp)
                                .addGap(26, 26, 26))
                            .addGroup(pnOperadorLayout.createSequentialGroup()
                                .addGroup(pnOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnOperadorLayout.createSequentialGroup()
                                        .addComponent(cbSexoOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbEstadoCivilOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnOperadorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbOperador)
                .addGap(279, 279, 279))
        );
        pnOperadorLayout.setVerticalGroup(
            pnOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnOperadorLayout.createSequentialGroup()
                .addComponent(lbOperador)
                .addGap(2, 2, 2)
                .addGroup(pnOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbOpNome)
                    .addComponent(lbSnOp)
                    .addComponent(lbCpfOp)
                    .addComponent(lblDataNascimentoOp)
                    .addComponent(lblRGOp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnOperadorLayout.createSequentialGroup()
                        .addGroup(pnOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNmOperador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSnOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tffCpfOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tffRgOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefoneOp)
                            .addComponent(lblCelularOp)
                            .addComponent(lblSexOp)
                            .addComponent(lblEstadoCivilOp)
                            .addComponent(lblEmailOp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tffTelefoneOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSexoOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbEstadoCivilOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tffCelularOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEmailOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(dtcDataDeNascimentoOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbCadastros.addTab("Operador", pnOperador);

        lblbCadPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Add_User_Male_50px.png"))); // NOI18N
        lblbCadPaciente.setToolTipText("Cadastrar");
        lblbCadPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblbCadPacienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblbCadPacienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblbCadPacienteMouseExited(evt);
            }
        });

        lblbLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Broom_50px.png"))); // NOI18N
        lblbLimpar.setToolTipText("Limpar Campos");
        lblbLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblbLimparMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblbLimparMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblbLimparMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tbCadastros, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblbCadPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblbLimpar)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbCadastros, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblbCadPaciente)
                    .addComponent(lblbLimpar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        tbCadastros.getAccessibleContext().setAccessibleName("Pacientes");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblbCadPacienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbCadPacienteMouseEntered
        // TODO add your handling code here:
        Botoes bt = new Botoes();
        bt.botabotão(lblbCadPaciente);
    }//GEN-LAST:event_lblbCadPacienteMouseEntered

    private void lblbCadPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbCadPacienteMouseClicked
        // TODO add your handling code here:
        if (tbCadastros.getSelectedComponent() == pnPaciente) {
            registrarPaciente();
        } else if (tbCadastros.getSelectedComponent() == pnMedico) {
            registrarMedico();
        } else if (tbCadastros.getSelectedComponent() == pnOperador) {
            registrarOperador();
        }
    }//GEN-LAST:event_lblbCadPacienteMouseClicked

    private void lblbCadPacienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbCadPacienteMouseExited
        // TODO add your handling code here:
        Botoes bt = new Botoes();
        bt.tirabotão(lblbCadPaciente);
    }//GEN-LAST:event_lblbCadPacienteMouseExited

    private void lblbLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbLimparMouseClicked
        // TODO add your handling code here:
        if (tbCadastros.getSelectedComponent() == pnPaciente) {
            LimpaPaciente();
        } else if (tbCadastros.getSelectedComponent() == pnMedico) {
            LimpaMed();
        } else if (tbCadastros.getSelectedComponent() == pnOperador){
            LimpaOperador();
        }
    }//GEN-LAST:event_lblbLimparMouseClicked

    private void lblbLimparMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbLimparMouseEntered
        // TODO add your handling code here:
        Botoes bt = new Botoes();
        bt.botabotão(lblbLimpar);
    }//GEN-LAST:event_lblbLimparMouseEntered

    private void lblbLimparMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbLimparMouseExited
        // TODO add your handling code here:
        Botoes bt = new Botoes();
        bt.tirabotão(lblbLimpar);
    }//GEN-LAST:event_lblbLimparMouseExited

    private void cbEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEstadoCivilActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField TffCelularMed;
    private javax.swing.JFormattedTextField TffCelularPaciente;
    private javax.swing.JFormattedTextField TffTelefonePaciente;
    private javax.swing.JComboBox<String> cbConvenio;
    private javax.swing.JComboBox<String> cbEspecialidade;
    private javax.swing.JComboBox<String> cbEstadoCivil;
    private javax.swing.JComboBox<String> cbEstadoCivilMedico;
    private javax.swing.JComboBox<String> cbEstadoCivilOperador;
    private javax.swing.JComboBox<String> cbSexoMed;
    private javax.swing.JComboBox<String> cbSexoOperador;
    private javax.swing.JComboBox<String> cbSexoPac;
    private com.toedter.calendar.JDateChooser dtcDataDeNascimentoMed;
    private com.toedter.calendar.JDateChooser dtcDataDeNascimentoOperador;
    private com.toedter.calendar.JDateChooser dtcDataDeNascimentoPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbCpfOp;
    private javax.swing.JLabel lbMedicos;
    private javax.swing.JLabel lbOpNome;
    private javax.swing.JLabel lbOperador;
    private javax.swing.JLabel lbPacientes;
    private javax.swing.JLabel lbSnOp;
    private javax.swing.JLabel lblAcesso;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblBairroMed;
    private javax.swing.JLabel lblBairroOp;
    private javax.swing.JLabel lblCRM;
    private javax.swing.JLabel lblCelularMed;
    private javax.swing.JLabel lblCelularOp;
    private javax.swing.JLabel lblCelularPac;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCepMed;
    private javax.swing.JLabel lblCepOp;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCidadeMed;
    private javax.swing.JLabel lblCidadeOp;
    private javax.swing.JLabel lblComplementoMed;
    private javax.swing.JLabel lblComplementoOp;
    private javax.swing.JLabel lblComplementoPac;
    private javax.swing.JLabel lblConvenio;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblCpfMed;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblDataNascimentoMed;
    private javax.swing.JLabel lblDataNascimentoOp;
    private javax.swing.JLabel lblEmailMed;
    private javax.swing.JLabel lblEmailOp;
    private javax.swing.JLabel lblEmailPac;
    private javax.swing.JLabel lblEspecialidade;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblEstadoCivil1;
    private javax.swing.JLabel lblEstadoCivilOp;
    private javax.swing.JLabel lblNmMed;
    private javax.swing.JLabel lblNmPaciente;
    private javax.swing.JLabel lblNumeroMed;
    private javax.swing.JLabel lblNumeroOp;
    private javax.swing.JLabel lblNumeroPac;
    private javax.swing.JLabel lblRGMed;
    private javax.swing.JLabel lblRGOp;
    private javax.swing.JLabel lblRg;
    private javax.swing.JLabel lblRuaMed;
    private javax.swing.JLabel lblRuaOp;
    private javax.swing.JLabel lblRuaPac;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSexMed;
    private javax.swing.JLabel lblSexOp;
    private javax.swing.JLabel lblSexoPaciente;
    private javax.swing.JLabel lblSnMed;
    private javax.swing.JLabel lblSnPaciente;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTelefoneMed;
    private javax.swing.JLabel lblTelefoneOp;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblbCadPaciente;
    private javax.swing.JLabel lblbLimpar;
    private javax.swing.JPasswordField pfSenhaMed;
    private javax.swing.JPasswordField pfSenhaOperador;
    private javax.swing.JPanel pnAcesso;
    private javax.swing.JPanel pnMedico;
    private javax.swing.JPanel pnOperador;
    private javax.swing.JPanel pnPaciente;
    private javax.swing.JTabbedPane tbCadastros;
    private javax.swing.JTextField tfBairroMed;
    private javax.swing.JTextField tfBairroOperador;
    private javax.swing.JTextField tfBairroPaciente;
    private javax.swing.JTextField tfCidadeMed;
    private javax.swing.JTextField tfCidadeOperador;
    private javax.swing.JTextField tfCidadePaciente;
    private javax.swing.JTextField tfComplementoMed;
    private javax.swing.JTextField tfComplementoOperador;
    private javax.swing.JTextField tfComplementoPaciente;
    private javax.swing.JTextField tfEmailMed;
    private javax.swing.JTextField tfEmailOperador;
    private javax.swing.JTextField tfEmailPaciente;
    private javax.swing.JTextField tfNmMed;
    private javax.swing.JTextField tfNmOperador;
    private javax.swing.JTextField tfNmPaciente;
    private javax.swing.JTextField tfNumeroMed;
    private javax.swing.JTextField tfNumeroOperador;
    private javax.swing.JTextField tfNumeroPaciente;
    private javax.swing.JTextField tfRuaMed;
    private javax.swing.JTextField tfRuaOperador;
    private javax.swing.JTextField tfRuaPaciente;
    private javax.swing.JTextField tfSnMed;
    private javax.swing.JTextField tfSnOperador;
    private javax.swing.JTextField tfSnPaciente;
    private javax.swing.JTextField tfUserOperador;
    private javax.swing.JTextField tfUsuarioMed;
    private javax.swing.JFormattedTextField tffCelularMed;
    private javax.swing.JFormattedTextField tffCelularOperador;
    private javax.swing.JFormattedTextField tffCepMed;
    private javax.swing.JFormattedTextField tffCepOperador;
    private javax.swing.JFormattedTextField tffCepPaciente;
    private javax.swing.JFormattedTextField tffCpfMed;
    private javax.swing.JFormattedTextField tffCpfOperador;
    private javax.swing.JFormattedTextField tffCpfPaciente;
    private javax.swing.JFormattedTextField tffRgMed;
    private javax.swing.JFormattedTextField tffRgOperador;
    private javax.swing.JFormattedTextField tffRgPaciente;
    private javax.swing.JFormattedTextField tffTelefoneOperador;
    private javax.swing.JFormattedTextField tftCRM;
    // End of variables declaration//GEN-END:variables
}
